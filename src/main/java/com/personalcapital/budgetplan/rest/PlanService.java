package com.personalcapital.budgetplan.rest;

import com.personalcapital.budgetplan.model.PlanDocument;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.elasticsearch.action.index.IndexRequest;
import org.elasticsearch.action.index.IndexResponse;
import org.elasticsearch.action.search.SearchRequest;
import org.elasticsearch.action.search.SearchResponse;
import org.elasticsearch.client.RequestOptions;
import org.elasticsearch.client.RestHighLevelClient;
import org.elasticsearch.index.query.MatchQueryBuilder;
import org.elasticsearch.index.query.Operator;
import org.elasticsearch.index.query.QueryBuilders;
import org.elasticsearch.search.SearchHit;
import org.elasticsearch.search.builder.SearchSourceBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.*;

@Service
public class PlanService {

    final static Logger logger = LogManager.getLogger(PlanService.class);

    private RestHighLevelClient client;
    private ObjectMapper objectMapper;

    @Autowired
    public PlanService(RestHighLevelClient client, ObjectMapper objectMapper) {
        this.client = client;
        this.objectMapper = objectMapper;
    }

    public String createPlanDocument(PlanDocument document) throws Exception {

        UUID uuid = UUID.randomUUID();
        document.setId(uuid.toString());

        String result = null;

        try {
            Map<String, Object> documentMapper = objectMapper.convertValue(document, Map.class);

            IndexRequest indexRequest = new IndexRequest("stateplans", "plan", document.getId())
                    .source(documentMapper);

            IndexResponse indexResponse = client.index(indexRequest, RequestOptions.DEFAULT);
            result = indexResponse.getResult().name();

        } catch ( Exception e) {
//            logger.error("couldn't index the Plan document " + document.toString());
            logger.error("Exception occurred while indexing the document with ack id: " + document.getAck_id() + ", Exception: " + e.toString());
        }

//        logger.info("succesfully indexed the document with ack id " + document.getAck_id() + " \n name: " + document.getPlan_name());
        return result;
    }

    private List<PlanDocument> getSearchResult(SearchResponse response) {

        SearchHit[] searchHit = response.getHits().getHits();

        List<PlanDocument> profileDocuments = new ArrayList<>();

        if (searchHit.length > 0) {

            Arrays.stream(searchHit)
                    .forEach(hit -> profileDocuments
                            .add(objectMapper
                                    .convertValue(hit.getSourceAsMap(),
                                            PlanDocument.class))
                    );
        }

        return profileDocuments;
    }

    public List<PlanDocument> findAllPlans() throws Exception {

        SearchRequest searchRequest = new SearchRequest();
        SearchSourceBuilder searchSourceBuilder = new SearchSourceBuilder();
        searchSourceBuilder.query(QueryBuilders.matchAllQuery());
        searchRequest.source(searchSourceBuilder);

        SearchResponse searchResponse =
                client.search(searchRequest, RequestOptions.DEFAULT);

        return getSearchResult(searchResponse);
    }

    public List<PlanDocument> searchByPlanName(String planName) throws Exception {


        SearchRequest searchRequest = new SearchRequest();
        searchRequest.indices("stateplans");
        searchRequest.types("plan");

        SearchSourceBuilder searchSourceBuilder = new SearchSourceBuilder();

        MatchQueryBuilder matchQueryBuilder = QueryBuilders
                .matchQuery("plan_name",planName)
                .operator(Operator.AND);

        searchSourceBuilder.query(matchQueryBuilder);

        searchRequest.source(searchSourceBuilder);

        SearchResponse searchResponse =
                client.search(searchRequest, RequestOptions.DEFAULT);

        return getSearchResult(searchResponse);

    }

    public List<PlanDocument> searchBySponserName(String sponserName) throws Exception {

        SearchRequest searchRequest = new SearchRequest();
        searchRequest.indices("stateplans");
        searchRequest.types("plan");

        SearchSourceBuilder searchSourceBuilder = new SearchSourceBuilder();

        MatchQueryBuilder matchQueryBuilder = QueryBuilders
                .matchQuery("sponsor_dfe_name",sponserName)
                .operator(Operator.AND);

        searchSourceBuilder.query(matchQueryBuilder);

        searchRequest.source(searchSourceBuilder);

        SearchResponse searchResponse =
                client.search(searchRequest, RequestOptions.DEFAULT);

        return getSearchResult(searchResponse);
    }

    public List<PlanDocument> searchBySponserState(String sponserState) throws Exception {

        SearchRequest searchRequest = new SearchRequest();
        searchRequest.indices("stateplans");
        searchRequest.types("plan");

        SearchSourceBuilder searchSourceBuilder = new SearchSourceBuilder();

        MatchQueryBuilder matchQueryBuilder = QueryBuilders
                .matchQuery("spons_dfe_mail_us_state",sponserState)
                .operator(Operator.AND);

        searchSourceBuilder.query(matchQueryBuilder);

        searchRequest.source(searchSourceBuilder);

        SearchResponse searchResponse =
                client.search(searchRequest, RequestOptions.DEFAULT);

        return getSearchResult(searchResponse);
    }
}

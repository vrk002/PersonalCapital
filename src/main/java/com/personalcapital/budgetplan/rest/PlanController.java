package com.personalcapital.budgetplan.rest;

import com.personalcapital.budgetplan.model.PlanDocument;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController()
@Api(value="onlinestore", description = "Operations related to accessing Budget Plans stored in Elasticsearch")
public class PlanController {

    final static Logger logger = LogManager.getLogger(PlanController.class);

    private PlanService service;

    @Autowired
    public PlanController(PlanService service) {

        this.service = service;
    }

    @ApiOperation("Heartbeat test for API service")
    @GetMapping("/test")
    public String test(){

        logger.info("checking if the application is running succesfully: true");
        return "Success";
    }

    @ApiOperation("This endpoint reads in the input data file f_5500_2017_latest.csv and populates elasticsearch")
    @PostMapping("/api/v1/createPlans")
    public ResponseEntity createPlansFromFile(@RequestParam (value = "fileName") String fileName) throws Exception {

//        String fileName = "/Users/venu/projects/budgetplan/src/main/resources/static/f_5500_2017_latest.csv";

        ParseFile parseFile = new ParseFile();

        List<PlanDocument> plans = parseFile.parseFile(fileName);
        logger.info("starting to index the plans created out of parsing input file");
        for (PlanDocument tempPlan: plans) {

            //start indexing this POJO
            service.createPlanDocument(tempPlan);
        }

        return new ResponseEntity(HttpStatus.CREATED);
    }

    @ApiOperation("Indexes on Plan document which is passed in as a parameter")
    @PostMapping("/api/v1/plans")
    public ResponseEntity createPlan(
            @RequestBody PlanDocument document) throws Exception {

        return
                new ResponseEntity(service.createPlanDocument(document), HttpStatus.CREATED);
    }

    @ApiOperation("Offers searching the plan store through a plan Name. Expects one parameter, planName")
    @GetMapping(value = "api/v1/plans/planName-search")
    public List<PlanDocument> planSearch(@RequestParam (value = "planName") String planName) throws Exception {

        return service.searchByPlanName(planName);
    }

    @ApiOperation("Offers searching the plan store through a sponser Name. Expects one parameter, sponserName")
    @GetMapping(value = "api/v1/plans/sponserName-search")
    public List<PlanDocument> sponserNamesearch(@RequestParam (value = "sponserName") String sponserName) throws Exception {

        return service.searchBySponserName(sponserName);
    }

    @ApiOperation("Offers searching the plan store through a sponser state Name. Expects one parameter, sponserState")
    @GetMapping(value = "api/v1/plans/sponserState-search")
    public List<PlanDocument> sponserStateearch(@RequestParam (value = "sponserState") String sponserState) throws Exception {

        return service.searchBySponserState(sponserState);
    }

    @ApiOperation("returns all plans from elasticsearch")
    @GetMapping("/api/v1/plans")
    public List<PlanDocument> findAll() throws Exception {

        return service.findAllPlans ();
    }
}

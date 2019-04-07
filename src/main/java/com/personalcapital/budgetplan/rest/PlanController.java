package com.personalcapital.budgetplan.rest;

import com.personalcapital.budgetplan.model.PlanDocument;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController()
public class PlanController {

    final static Logger logger = LogManager.getLogger(PlanController.class);

    private PlanService service;

    @Autowired
    public PlanController(PlanService service) {

        this.service = service;
    }

    @GetMapping("/test")
    public String test(){
        return "Success";
    }

    @PostMapping("/api/v1/createPlans")
    public ResponseEntity createPlansFromFile() throws Exception {

        String fileName = "/Users/venu/projects/budgetplan/src/main/resources/static/f_5500_2017_latest.csv";

        ParseFile parseFile = new ParseFile();

        List<PlanDocument> plans = parseFile.parseFile(fileName);
        logger.info("starting to index the plans created out of parsing input file");
        for (PlanDocument tempPlan: plans) {

            //start indexing this POJO
            service.createPlanDocument(tempPlan);
            Thread.sleep(30);
        }

        return new ResponseEntity(HttpStatus.CREATED);
    }

    @PostMapping("/api/v1/plans")
    public ResponseEntity createPlan(
            @RequestBody PlanDocument document) throws Exception {

        return
                new ResponseEntity(service.createPlanDocument(document), HttpStatus.CREATED);
    }

    @GetMapping(value = "api/v1/plans/planName-search")
    public List<PlanDocument> planSearch(@RequestParam (value = "planName") String planName) throws Exception {

        return service.searchByPlanName(planName);
    }

    @GetMapping(value = "api/v1/plans/sponserName-search")
    public List<PlanDocument> sponserNamesearch(@RequestParam (value = "sponserName") String sponserName) throws Exception {

        return service.searchBySponserName(sponserName);
    }

    @GetMapping(value = "api/v1/plans/sponserState-search")
    public List<PlanDocument> sponserStateearch(@RequestParam (value = "sponserState") String sponserState) throws Exception {

        return service.searchBySponserState(sponserState);
    }

    @GetMapping("/api/v1/plans")
    public List<PlanDocument> findAll() throws Exception {

        return service.findAllPlans ();
    }
}

package com.personalcapital.budgetplan;

import com.personalcapital.budgetplan.model.PlanDocument;
import com.personalcapital.budgetplan.rest.ParseFile;
import com.personalcapital.budgetplan.rest.PlanController;
import com.personalcapital.budgetplan.rest.PlanService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BudgetplanApplicationTests {

	final static Logger logger = LogManager.getLogger(PlanController.class);

	@Autowired
	private PlanService service;

	@Test
	public void contextLoads() {
	}

	@Test
	public void TestEmptyNumberfield() {
		String fileName = "/Users/venu/projects/budgetplan/src/main/resources/static/testfile1.csv";

		ParseFile parseFile = new ParseFile();

		List<PlanDocument> plans = parseFile.parseFile(fileName);

		Assert.assertNull(plans.get(0).getPartcp_account_bal_cnt());

	}

	@Test
	public void TestEmptyFieldESIndex(){

		String fileName = "/Users/venu/projects/budgetplan/src/main/resources/static/ESFailedDocTest.csv";

		ParseFile parseFile = new ParseFile();

		List<PlanDocument> plans = parseFile.parseFile(fileName);

		try {
			if (!plans.isEmpty())
				service.createPlanDocument(plans.get(0));
		} catch (Exception e) {
			logger.error("error foudn while indexing document " + e.toString());
		}

		String ackid = "20181015183427P030247706695005";

		Assert.assertEquals(ackid, plans.get(0).getAck_id());
		logger.info("ack id is " + plans.get(0).getAck_id());

		fileName = "/Users/venu/projects/budgetplan/src/main/resources/static/failedtest2.csv";

		plans = parseFile.parseFile(fileName);

		try {
			if (!plans.isEmpty()) {
				service.createPlanDocument(plans.get(0));
				service.createPlanDocument(plans.get(1));
			}
		} catch (Exception e) {
			logger.error("error foudn while indexing document " + e.toString());
		}

		String ackid2 = "20180222082750P030096736775001";
		String ackid3 = "20180110131058P040018024583001";

		Assert.assertEquals(ackid, plans.get(0).getAck_id());
		logger.info("ack id is " + plans.get(0).getAck_id());

		Assert.assertEquals(ackid, plans.get(1).getAck_id());
		logger.info("ack id is " + plans.get(1).getAck_id());
	}

}

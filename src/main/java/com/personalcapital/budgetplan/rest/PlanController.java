package com.personalcapital.budgetplan.rest;

import com.personalcapital.budgetplan.model.PlanDocument;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@RestController()
public class PlanController {

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
        BufferedReader br = null;
        String line = "";
        String splitBy = ",";
        List<PlanDocument> plans = new ArrayList<>();

        try {

            br = new BufferedReader(new FileReader(fileName));
            br.readLine();

            while ((line = br.readLine()) != null) {

                // split on comma(',')
                String[] items = line.split(splitBy);

                // create car object to store values
                PlanDocument plan = new PlanDocument();

                //set all values
                UUID uuid = UUID.randomUUID();
                plan.setId(uuid.toString());

                plan.setAck_id(items[0]);
                plan.setForm_plan_year_begin_date(items[1]);
                plan.setForm_tax_prd(items[2]);
                plan.setType_plan_entity_cd(items[3]);
                plan.setType_dfe_plan_entity_cd(items[4]);
                plan.setInitial_filing_ind(items[5]);
                plan.setAmended_ind(items[6]);
                plan.setFinal_filing_ind(items[7]);
                plan.setShort_plan_yr_ind(items[8]);
                plan.setCollective_bargain_ind(items[9]);
                plan.setF5558_application_filed_iND(items[10]);
                plan.setExt_automatic_ind(items[11]);
                plan.setDfvc_program_ind(items[12]);
                plan.setExt_special_ind(items[13]);
                plan.setExt_special_text(items[14]);
                plan.setPlan_name(items[15]);
                plan.setSpons_dfe_pn(items[16]);
                plan.setPlan_eff_date(items[17]);
                plan.setSponsor_dfe_name(items[18]);
                plan.setSpons_dfe_dba_name(items[19]);
                plan.setSpons_dfe_care_of_name(items[20]);
                plan.setSpons_dfe_mail_us_address1(items[21]);
                plan.setSpons_dfe_mail_us_address2(items[22]);
                plan.setSpons_dfe_mail_us_city(items[23]);
                plan.setSpons_dfe_mail_us_state(items[24]);
                plan.setSpons_dfe_mail_us_zip(items[25]);
                plan.setSpons_dfe_mail_foreign_addr1(items[26]);
                plan.setSpons_dfe_mail_foreign_addr2(items[27]);
                plan.setSpons_dfe_mail_foreign_city(items[28]);
                plan.setSpons_dfe_mail_forgn_prov_st(items[29]);
                plan.setSpons_dfe_mail_foreign_cntry(items[30]);
                plan.setSpons_dfe_mail_forgn_postal_cd(items[31]);
                plan.setSpons_dfe_loc_us_address1(items[32]);
                plan.setSpons_dfe_loc_us_address2(items[33]);
                plan.setSpons_dfe_loc_us_city(items[34]);
                plan.setSpons_dfe_loc_us_state(items[35]);
                plan.setSpons_dfe_loc_us_zip(items[36]);
                plan.setSpons_dfe_loc_foreign_address1(items[37]);
                plan.setSpons_dfe_loc_foreign_address2(items[38]);
                plan.setSpons_dfe_loc_foreign_city(items[39]);
                plan.setSpons_dfe_loc_forgn_prov_st(items[40]);
                plan.setSpons_dfe_loc_foreign_cntry(items[41]);
                plan.setSpons_dfe_loc_forgn_postal_cd(items[42]);
                plan.setSpons_dfe_ein(items[43]);
                plan.setSpons_dfe_phone_num(items[44]);
                plan.setBusiness_code(items[45]);
                plan.setAdmin_name(items[46]);
                plan.setAdmin_care_of_name(items[47]);
                plan.setAdmin_us_address1(items[48]);
                plan.setAdmin_us_address2(items[49]);
                plan.setAdmin_us_city(items[50]);
                plan.setAdmin_us_state(items[51]);
                plan.setAdmin_us_zip(items[52]);
                plan.setAdmin_foreign_address1(items[53]);
                plan.setAdmin_foreign_address2(items[54]);
                plan.setAdmin_foreign_city(items[55]);
                plan.setAdmin_foreign_prov_state(items[56]);
                plan.setAdmin_foreign_cntry(items[57]);
                plan.setAdmin_foreign_postal_cd(items[58]);
                plan.setAdmin_ein(items[59]);
                plan.setAdmin_phone_num(items[60]);
                plan.setLast_rpt_spons_name(items[61]);
                plan.setLast_rpt_spons_ein(items[62]);
                plan.setLast_rpt_plan_num(items[63]);
                plan.setAdmin_signed_date(items[64]);
                plan.setAdmin_signed_name(items[65]);
                plan.setSpons_signed_date(items[66]);
                plan.setSpons_signed_name(items[67]);
                plan.setDfe_signed_date(items[68]);
                plan.setDfe_signed_name(items[69]);

                if (items[70] != null && items[70].length() != 0) {
                    System.out.println(items[70]);
                    plan.setTot_partcp_boy_cnt(Long.parseLong(items[70]));
                }
                if (items[71] != null && items[71] != " ")
                    plan.setTot_active_partcp_cnt(Long.parseLong(items[71]));
                if (items[72] != null && items[72] != "")
                    plan.setRtd_sep_partcp_rcvg_cnt(Long.parseLong(items[72]));
                if (items[73] != null && items[73] != "")
                    plan.setRtd_sep_partcp_fut_cnt(Long.parseLong(items[73]));
                if (items[74] != null && items[74] != "")
                    plan.setSubtl_act_rtd_sep_cnt(Long.parseLong(items[74]));
                if (items[75] != null && items[75] != "")
                    plan.setBenef_rcvg_bnft_cnt(Long.parseLong(items[75]));
                if (items[76] != null && items[76] != "")
                    plan.setTot_act_rtd_sep_benef_cnt(Long.parseLong(items[76]));
                if (items[77] != null && items[77] != "")
                    plan.setPartcp_account_bal_cnt(Long.parseLong(items[77]));
                if (items[78] != null && items[78] != "")
                    plan.setSep_partcp_partl_vstd_cnt(Long.parseLong(items[78]));
                if (items[79] != null && items[79] != "")
                    plan.setContrib_emplrs_cnt(Long.parseLong(items[79]));

                plan.setType_pension_bnft_code(items[80]);
                plan.setType_welfare_bnft_code(items[81]);
                plan.setFunding_insurance_ind(items[82]);
                plan.setFunding_sec412_ind(items[83]);
                plan.setFunding_trust_ind(items[84]);
                plan.setFunding_gen_asset_ind(items[85]);
                plan.setBenefit_insurance_ind(items[86]);
                plan.setBenefit_sec412_ind(items[87]);
                plan.setBenefit_trust_ind(items[88]);
                plan.setBenefit_gen_asset_ind(items[89]);
                plan.setSch_r_attached_ind(items[90]);
                plan.setSch_mb_attached_ind(items[91]);
                plan.setSch_sb_attached_ind(items[92]);
                plan.setSch_h_attached_ind(items[93]);
                plan.setSch_i_attached_ind(items[94]);
                plan.setSch_a_attached_ind(items[95]);
                plan.setNum_sch_a_attached_cnt(items[96]);
                plan.setSch_c_attached_ind(items[97]);
                plan.setSch_d_attached_ind(items[98]);
                plan.setSch_g_attached_ind(items[99]);
                plan.setFiling_status(items[100]);
                plan.setDate_received(items[101]);
                plan.setValid_admin_signature(items[102]);
                plan.setValid_dfe_signature(items[103]);
                plan.setValid_sponsor_signature(items[104]);
                plan.setAdmin_phone_num_foreign(items[105]);
                plan.setSpons_dfe_phone_num_foreign(items[106]);
                plan.setAdmin_name_same_spon_ind(items[107]);
                plan.setAdmin_address_same_spon_ind(items[108]);
                plan.setPreparer_name(items[109]);
                plan.setPreparer_firm_name(items[110]);
                plan.setPreparer_us_address1(items[111]);
                plan.setPreparer_us_address2(items[112]);
                plan.setPreparer_us_city(items[113]);
                plan.setPreparer_us_state(items[114]);
                plan.setPreparer_us_zip(items[115]);
                plan.setPreparer_foreign_address1(items[116]);
                plan.setPreparer_foreign_address2(items[117]);
                plan.setPreparer_foreign_city(items[118]);
                plan.setPreparer_foreign_prov_state(items[119]);
                plan.setPreparer_foreign_cntry(items[120]);
                plan.setPreparer_foreign_postal_cd(items[121]);
                plan.setPreparer_phone_num(items[122]);
                plan.setPreparer_phone_num_foreign(items[123]);
                plan.setTot_act_partcp_boy_cnt(items[124]);
                plan.setSubj_m1_filing_req_ind(items[125]);
                plan.setCompliance_m1_filing_req_ind(items[126]);
                plan.setM1_receipt_confirmation_code(items[127]);
                plan.setAdmin_manual_signed_date(items[128]);
                plan.setAdmin_manual_signed_name(items[129]);
                plan.setLast_rpt_plan_name(items[130]);
                plan.setSpons_manual_signed_date(items[131]);
                plan.setSpons_manual_signed_name(items[132]);
                plan.setDfe_manual_signed_date(items[133]);
                plan.setDfe_manual_signed_name(items[134]);

                // adding car objects to a list
                plans.add(plan);
                service.createPlanDocument(plan);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
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

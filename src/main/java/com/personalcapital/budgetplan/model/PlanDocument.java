package com.personalcapital.budgetplan.model;

import java.util.Objects;

public class PlanDocument {
    private String id;
    private String ack_id;
    private String form_plan_year_begin_date;
    private String form_tax_prd;
    private String type_plan_entity_cd;
    private String type_dfe_plan_entity_cd;
    private String initial_filing_ind;
    private String amended_ind;
    private String final_filing_ind;
    private String short_plan_yr_ind;
    private String collective_bargain_ind;
    private String f5558_application_filed_iND;
    private String ext_automatic_ind;
    private String dfvc_program_ind;
    private String ext_special_ind;
    private String ext_special_text;
    private String plan_name;
    private String spons_dfe_pn;
    private String plan_eff_date;
    private String sponsor_dfe_name;
    private String spons_dfe_dba_name;
    private String spons_dfe_care_of_name;
    private String spons_dfe_mail_us_address1;
    private String spons_dfe_mail_us_address2;
    private String spons_dfe_mail_us_city;
    private String spons_dfe_mail_us_state;
    private String spons_dfe_mail_us_zip;
    private String spons_dfe_mail_foreign_addr1;
    private String spons_dfe_mail_foreign_addr2;
    private String spons_dfe_mail_foreign_city;
    private String spons_dfe_mail_forgn_prov_st;
    private String spons_dfe_mail_foreign_cntry;
    private String spons_dfe_mail_forgn_postal_cd;
    private String spons_dfe_loc_us_address1;
    private String spons_dfe_loc_us_address2;
    private String spons_dfe_loc_us_city;
    private String spons_dfe_loc_us_state;
    private String spons_dfe_loc_us_zip;
    private String spons_dfe_loc_foreign_address1;
    private String spons_dfe_loc_foreign_address2;
    private String spons_dfe_loc_foreign_city;
    private String spons_dfe_loc_forgn_prov_st;
    private String spons_dfe_loc_foreign_cntry;
    private String spons_dfe_loc_forgn_postal_cd;
    private String spons_dfe_ein;
    private String spons_dfe_phone_num;
    private String business_code;
    private String admin_name;
    private String admin_care_of_name;
    private String admin_us_address1;
    private String admin_us_address2;
    private String admin_us_city;
    private String admin_us_state;
    private String admin_us_zip;
    private String admin_foreign_address1;
    private String admin_foreign_address2;
    private String admin_foreign_city;
    private String admin_foreign_prov_state;
    private String admin_foreign_cntry;
    private String admin_foreign_postal_cd;
    private String admin_ein;
    private String admin_phone_num;
    private String last_rpt_spons_name;
    private String last_rpt_spons_ein;
    private String last_rpt_plan_num;
    private String admin_signed_date;
    private String admin_signed_name;
    private String spons_signed_date;
    private String spons_signed_name;
    private String dfe_signed_date;
    private String dfe_signed_name;
    private Long tot_partcp_boy_cnt;
    private Long tot_active_partcp_cnt;
    private Long rtd_sep_partcp_rcvg_cnt;
    private Long rtd_sep_partcp_fut_cnt;
    private Long subtl_act_rtd_sep_cnt;
    private Long benef_rcvg_bnft_cnt;
    private Long tot_act_rtd_sep_benef_cnt;
    private Long partcp_account_bal_cnt;
    private Long sep_partcp_partl_vstd_cnt;
    private Long contrib_emplrs_cnt;
    private String type_pension_bnft_code;
    private String type_welfare_bnft_code;
    private String funding_insurance_ind;
    private String funding_sec412_ind;
    private String funding_trust_ind;
    private String funding_gen_asset_ind;
    private String benefit_insurance_ind;
    private String benefit_sec412_ind;
    private String benefit_trust_ind;
    private String benefit_gen_asset_ind;
    private String sch_r_attached_ind;
    private String sch_mb_attached_ind;
    private String sch_sb_attached_ind;
    private String sch_h_attached_ind;
    private String sch_i_attached_ind;
    private String sch_a_attached_ind;
    private String num_sch_a_attached_cnt;
    private String sch_c_attached_ind;
    private String sch_d_attached_ind;
    private String sch_g_attached_ind;
    private String filing_status;
    private String date_received;
    private String valid_admin_signature;
    private String valid_dfe_signature;
    private String valid_sponsor_signature;
    private String admin_phone_num_foreign;
    private String spons_dfe_phone_num_foreign;
    private String admin_name_same_spon_ind;
    private String admin_address_same_spon_ind;
    private String preparer_name;
    private String preparer_firm_name;
    private String preparer_us_address1;
    private String preparer_us_address2;
    private String preparer_us_city;
    private String preparer_us_state;
    private String preparer_us_zip;
    private String preparer_foreign_address1;
    private String preparer_foreign_address2;
    private String preparer_foreign_city;
    private String preparer_foreign_prov_state;
    private String preparer_foreign_cntry;
    private String preparer_foreign_postal_cd;
    private String preparer_phone_num;
    private String preparer_phone_num_foreign;
    private String tot_act_partcp_boy_cnt;
    private String subj_m1_filing_req_ind;
    private String compliance_m1_filing_req_ind;
    private String m1_receipt_confirmation_code;
    private String admin_manual_signed_date;
    private String admin_manual_signed_name;
    private String last_rpt_plan_name;
    private String spons_manual_signed_date;
    private String spons_manual_signed_name;
    private String dfe_manual_signed_date;
    private String dfe_manual_signed_name;


    public PlanDocument() {
    }

    public PlanDocument(String id, String ack_id, String form_plan_year_begin_date, String form_tax_prd, String type_plan_entity_cd, String type_dfe_plan_entity_cd, String initial_filing_ind, String amended_ind, String final_filing_ind, String short_plan_yr_ind, String collective_bargain_ind, String f5558_application_filed_iND, String ext_automatic_ind, String dfvc_program_ind, String ext_special_ind, String ext_special_text, String plan_name, String spons_dfe_pn, String plan_eff_date, String sponsor_dfe_name, String spons_dfe_dba_name, String spons_dfe_care_of_name, String spons_dfe_mail_us_address1, String spons_dfe_mail_us_address2, String spons_dfe_mail_us_city, String spons_dfe_mail_us_state, String spons_dfe_mail_us_zip, String spons_dfe_mail_foreign_addr1, String spons_dfe_mail_foreign_addr2, String spons_dfe_mail_foreign_city, String spons_dfe_mail_forgn_prov_st, String spons_dfe_mail_foreign_cntry, String spons_dfe_mail_forgn_postal_cd, String spons_dfe_loc_us_address1, String spons_dfe_loc_us_address2, String spons_dfe_loc_us_city, String spons_dfe_loc_us_state, String spons_dfe_loc_us_zip, String spons_dfe_loc_foreign_address1, String spons_dfe_loc_foreign_address2, String spons_dfe_loc_foreign_city, String spons_dfe_loc_forgn_prov_st, String spons_dfe_loc_foreign_cntry, String spons_dfe_loc_forgn_postal_cd, String spons_dfe_ein, String spons_dfe_phone_num, String business_code, String admin_name, String admin_care_of_name, String admin_us_address1, String admin_us_address2, String admin_us_city, String admin_us_state, String admin_us_zip, String admin_foreign_address1, String admin_foreign_address2, String admin_foreign_city, String admin_foreign_prov_state, String admin_foreign_cntry, String admin_foreign_postal_cd, String admin_ein, String admin_phone_num, String last_rpt_spons_name, String last_rpt_spons_ein, String last_rpt_plan_num, String admin_signed_date, String admin_signed_name, String spons_signed_date, String spons_signed_name, String dfe_signed_date, String dfe_signed_name, Long tot_partcp_boy_cnt, Long tot_active_partcp_cnt, Long rtd_sep_partcp_rcvg_cnt, Long rtd_sep_partcp_fut_cnt, Long subtl_act_rtd_sep_cnt, Long benef_rcvg_bnft_cnt, Long tot_act_rtd_sep_benef_cnt, Long partcp_account_bal_cnt, Long sep_partcp_partl_vstd_cnt, Long contrib_emplrs_cnt, String type_pension_bnft_code, String type_welfare_bnft_code, String funding_insurance_ind, String funding_sec412_ind, String funding_trust_ind, String funding_gen_asset_ind, String benefit_insurance_ind, String benefit_sec412_ind, String benefit_trust_ind, String benefit_gen_asset_ind, String sch_r_attached_ind, String sch_mb_attached_ind, String sch_sb_attached_ind, String sch_h_attached_ind, String sch_i_attached_ind, String sch_a_attached_ind, String num_sch_a_attached_cnt, String sch_c_attached_ind, String sch_d_attached_ind, String sch_g_attached_ind, String filing_status, String date_received, String valid_admin_signature, String valid_dfe_signature, String valid_sponsor_signature, String admin_phone_num_foreign, String spons_dfe_phone_num_foreign, String admin_name_same_spon_ind, String admin_address_same_spon_ind, String preparer_name, String preparer_firm_name, String preparer_us_address1, String preparer_us_address2, String preparer_us_city, String preparer_us_state, String preparer_us_zip, String preparer_foreign_address1, String preparer_foreign_address2, String preparer_foreign_city, String preparer_foreign_prov_state, String preparer_foreign_cntry, String preparer_foreign_postal_cd, String preparer_phone_num, String preparer_phone_num_foreign, String tot_act_partcp_boy_cnt, String subj_m1_filing_req_ind, String compliance_m1_filing_req_ind, String m1_receipt_confirmation_code, String admin_manual_signed_date, String admin_manual_signed_name, String last_rpt_plan_name, String spons_manual_signed_date, String spons_manual_signed_name, String dfe_manual_signed_date, String dfe_manual_signed_name) {
        this.id = id;
        this.ack_id = ack_id;
        this.form_plan_year_begin_date = form_plan_year_begin_date;
        this.form_tax_prd = form_tax_prd;
        this.type_plan_entity_cd = type_plan_entity_cd;
        this.type_dfe_plan_entity_cd = type_dfe_plan_entity_cd;
        this.initial_filing_ind = initial_filing_ind;
        this.amended_ind = amended_ind;
        this.final_filing_ind = final_filing_ind;
        this.short_plan_yr_ind = short_plan_yr_ind;
        this.collective_bargain_ind = collective_bargain_ind;
        this.f5558_application_filed_iND = f5558_application_filed_iND;
        this.ext_automatic_ind = ext_automatic_ind;
        this.dfvc_program_ind = dfvc_program_ind;
        this.ext_special_ind = ext_special_ind;
        this.ext_special_text = ext_special_text;
        this.plan_name = plan_name;
        this.spons_dfe_pn = spons_dfe_pn;
        this.plan_eff_date = plan_eff_date;
        this.sponsor_dfe_name = sponsor_dfe_name;
        this.spons_dfe_dba_name = spons_dfe_dba_name;
        this.spons_dfe_care_of_name = spons_dfe_care_of_name;
        this.spons_dfe_mail_us_address1 = spons_dfe_mail_us_address1;
        this.spons_dfe_mail_us_address2 = spons_dfe_mail_us_address2;
        this.spons_dfe_mail_us_city = spons_dfe_mail_us_city;
        this.spons_dfe_mail_us_state = spons_dfe_mail_us_state;
        this.spons_dfe_mail_us_zip = spons_dfe_mail_us_zip;
        this.spons_dfe_mail_foreign_addr1 = spons_dfe_mail_foreign_addr1;
        this.spons_dfe_mail_foreign_addr2 = spons_dfe_mail_foreign_addr2;
        this.spons_dfe_mail_foreign_city = spons_dfe_mail_foreign_city;
        this.spons_dfe_mail_forgn_prov_st = spons_dfe_mail_forgn_prov_st;
        this.spons_dfe_mail_foreign_cntry = spons_dfe_mail_foreign_cntry;
        this.spons_dfe_mail_forgn_postal_cd = spons_dfe_mail_forgn_postal_cd;
        this.spons_dfe_loc_us_address1 = spons_dfe_loc_us_address1;
        this.spons_dfe_loc_us_address2 = spons_dfe_loc_us_address2;
        this.spons_dfe_loc_us_city = spons_dfe_loc_us_city;
        this.spons_dfe_loc_us_state = spons_dfe_loc_us_state;
        this.spons_dfe_loc_us_zip = spons_dfe_loc_us_zip;
        this.spons_dfe_loc_foreign_address1 = spons_dfe_loc_foreign_address1;
        this.spons_dfe_loc_foreign_address2 = spons_dfe_loc_foreign_address2;
        this.spons_dfe_loc_foreign_city = spons_dfe_loc_foreign_city;
        this.spons_dfe_loc_forgn_prov_st = spons_dfe_loc_forgn_prov_st;
        this.spons_dfe_loc_foreign_cntry = spons_dfe_loc_foreign_cntry;
        this.spons_dfe_loc_forgn_postal_cd = spons_dfe_loc_forgn_postal_cd;
        this.spons_dfe_ein = spons_dfe_ein;
        this.spons_dfe_phone_num = spons_dfe_phone_num;
        this.business_code = business_code;
        this.admin_name = admin_name;
        this.admin_care_of_name = admin_care_of_name;
        this.admin_us_address1 = admin_us_address1;
        this.admin_us_address2 = admin_us_address2;
        this.admin_us_city = admin_us_city;
        this.admin_us_state = admin_us_state;
        this.admin_us_zip = admin_us_zip;
        this.admin_foreign_address1 = admin_foreign_address1;
        this.admin_foreign_address2 = admin_foreign_address2;
        this.admin_foreign_city = admin_foreign_city;
        this.admin_foreign_prov_state = admin_foreign_prov_state;
        this.admin_foreign_cntry = admin_foreign_cntry;
        this.admin_foreign_postal_cd = admin_foreign_postal_cd;
        this.admin_ein = admin_ein;
        this.admin_phone_num = admin_phone_num;
        this.last_rpt_spons_name = last_rpt_spons_name;
        this.last_rpt_spons_ein = last_rpt_spons_ein;
        this.last_rpt_plan_num = last_rpt_plan_num;
        this.admin_signed_date = admin_signed_date;
        this.admin_signed_name = admin_signed_name;
        this.spons_signed_date = spons_signed_date;
        this.spons_signed_name = spons_signed_name;
        this.dfe_signed_date = dfe_signed_date;
        this.dfe_signed_name = dfe_signed_name;
        this.tot_partcp_boy_cnt = tot_partcp_boy_cnt;
        this.tot_active_partcp_cnt = tot_active_partcp_cnt;
        this.rtd_sep_partcp_rcvg_cnt = rtd_sep_partcp_rcvg_cnt;
        this.rtd_sep_partcp_fut_cnt = rtd_sep_partcp_fut_cnt;
        this.subtl_act_rtd_sep_cnt = subtl_act_rtd_sep_cnt;
        this.benef_rcvg_bnft_cnt = benef_rcvg_bnft_cnt;
        this.tot_act_rtd_sep_benef_cnt = tot_act_rtd_sep_benef_cnt;
        this.partcp_account_bal_cnt = partcp_account_bal_cnt;
        this.sep_partcp_partl_vstd_cnt = sep_partcp_partl_vstd_cnt;
        this.contrib_emplrs_cnt = contrib_emplrs_cnt;
        this.type_pension_bnft_code = type_pension_bnft_code;
        this.type_welfare_bnft_code = type_welfare_bnft_code;
        this.funding_insurance_ind = funding_insurance_ind;
        this.funding_sec412_ind = funding_sec412_ind;
        this.funding_trust_ind = funding_trust_ind;
        this.funding_gen_asset_ind = funding_gen_asset_ind;
        this.benefit_insurance_ind = benefit_insurance_ind;
        this.benefit_sec412_ind = benefit_sec412_ind;
        this.benefit_trust_ind = benefit_trust_ind;
        this.benefit_gen_asset_ind = benefit_gen_asset_ind;
        this.sch_r_attached_ind = sch_r_attached_ind;
        this.sch_mb_attached_ind = sch_mb_attached_ind;
        this.sch_sb_attached_ind = sch_sb_attached_ind;
        this.sch_h_attached_ind = sch_h_attached_ind;
        this.sch_i_attached_ind = sch_i_attached_ind;
        this.sch_a_attached_ind = sch_a_attached_ind;
        this.num_sch_a_attached_cnt = num_sch_a_attached_cnt;
        this.sch_c_attached_ind = sch_c_attached_ind;
        this.sch_d_attached_ind = sch_d_attached_ind;
        this.sch_g_attached_ind = sch_g_attached_ind;
        this.filing_status = filing_status;
        this.date_received = date_received;
        this.valid_admin_signature = valid_admin_signature;
        this.valid_dfe_signature = valid_dfe_signature;
        this.valid_sponsor_signature = valid_sponsor_signature;
        this.admin_phone_num_foreign = admin_phone_num_foreign;
        this.spons_dfe_phone_num_foreign = spons_dfe_phone_num_foreign;
        this.admin_name_same_spon_ind = admin_name_same_spon_ind;
        this.admin_address_same_spon_ind = admin_address_same_spon_ind;
        this.preparer_name = preparer_name;
        this.preparer_firm_name = preparer_firm_name;
        this.preparer_us_address1 = preparer_us_address1;
        this.preparer_us_address2 = preparer_us_address2;
        this.preparer_us_city = preparer_us_city;
        this.preparer_us_state = preparer_us_state;
        this.preparer_us_zip = preparer_us_zip;
        this.preparer_foreign_address1 = preparer_foreign_address1;
        this.preparer_foreign_address2 = preparer_foreign_address2;
        this.preparer_foreign_city = preparer_foreign_city;
        this.preparer_foreign_prov_state = preparer_foreign_prov_state;
        this.preparer_foreign_cntry = preparer_foreign_cntry;
        this.preparer_foreign_postal_cd = preparer_foreign_postal_cd;
        this.preparer_phone_num = preparer_phone_num;
        this.preparer_phone_num_foreign = preparer_phone_num_foreign;
        this.tot_act_partcp_boy_cnt = tot_act_partcp_boy_cnt;
        this.subj_m1_filing_req_ind = subj_m1_filing_req_ind;
        this.compliance_m1_filing_req_ind = compliance_m1_filing_req_ind;
        this.m1_receipt_confirmation_code = m1_receipt_confirmation_code;
        this.admin_manual_signed_date = admin_manual_signed_date;
        this.admin_manual_signed_name = admin_manual_signed_name;
        this.last_rpt_plan_name = last_rpt_plan_name;
        this.spons_manual_signed_date = spons_manual_signed_date;
        this.spons_manual_signed_name = spons_manual_signed_name;
        this.dfe_manual_signed_date = dfe_manual_signed_date;
        this.dfe_manual_signed_name = dfe_manual_signed_name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAck_id() {
        return ack_id;
    }

    public void setAck_id(String ack_id) {
        this.ack_id = ack_id;
    }

    public String getForm_plan_year_begin_date() {
        return form_plan_year_begin_date;
    }

    public void setForm_plan_year_begin_date(String form_plan_year_begin_date) {
        this.form_plan_year_begin_date = form_plan_year_begin_date;
    }

    public String getForm_tax_prd() {
        return form_tax_prd;
    }

    public void setForm_tax_prd(String form_tax_prd) {
        this.form_tax_prd = form_tax_prd;
    }

    public String getType_plan_entity_cd() {
        return type_plan_entity_cd;
    }

    public void setType_plan_entity_cd(String type_plan_entity_cd) {
        this.type_plan_entity_cd = type_plan_entity_cd;
    }

    public String getType_dfe_plan_entity_cd() {
        return type_dfe_plan_entity_cd;
    }

    public void setType_dfe_plan_entity_cd(String type_dfe_plan_entity_cd) {
        this.type_dfe_plan_entity_cd = type_dfe_plan_entity_cd;
    }

    public String getInitial_filing_ind() {
        return initial_filing_ind;
    }

    public void setInitial_filing_ind(String initial_filing_ind) {
        this.initial_filing_ind = initial_filing_ind;
    }

    public String getAmended_ind() {
        return amended_ind;
    }

    public void setAmended_ind(String amended_ind) {
        this.amended_ind = amended_ind;
    }

    public String getFinal_filing_ind() {
        return final_filing_ind;
    }

    public void setFinal_filing_ind(String final_filing_ind) {
        this.final_filing_ind = final_filing_ind;
    }

    public String getShort_plan_yr_ind() {
        return short_plan_yr_ind;
    }

    public void setShort_plan_yr_ind(String short_plan_yr_ind) {
        this.short_plan_yr_ind = short_plan_yr_ind;
    }

    public String getCollective_bargain_ind() {
        return collective_bargain_ind;
    }

    public void setCollective_bargain_ind(String collective_bargain_ind) {
        this.collective_bargain_ind = collective_bargain_ind;
    }

    public String getF5558_application_filed_iND() {
        return f5558_application_filed_iND;
    }

    public void setF5558_application_filed_iND(String f5558_application_filed_iND) {
        this.f5558_application_filed_iND = f5558_application_filed_iND;
    }

    public String getExt_automatic_ind() {
        return ext_automatic_ind;
    }

    public void setExt_automatic_ind(String ext_automatic_ind) {
        this.ext_automatic_ind = ext_automatic_ind;
    }

    public String getDfvc_program_ind() {
        return dfvc_program_ind;
    }

    public void setDfvc_program_ind(String dfvc_program_ind) {
        this.dfvc_program_ind = dfvc_program_ind;
    }

    public String getExt_special_ind() {
        return ext_special_ind;
    }

    public void setExt_special_ind(String ext_special_ind) {
        this.ext_special_ind = ext_special_ind;
    }

    public String getExt_special_text() {
        return ext_special_text;
    }

    public void setExt_special_text(String ext_special_text) {
        this.ext_special_text = ext_special_text;
    }

    public String getPlan_name() {
        return plan_name;
    }

    public void setPlan_name(String plan_name) {
        this.plan_name = plan_name;
    }

    public String getSpons_dfe_pn() {
        return spons_dfe_pn;
    }

    public void setSpons_dfe_pn(String spons_dfe_pn) {
        this.spons_dfe_pn = spons_dfe_pn;
    }

    public String getPlan_eff_date() {
        return plan_eff_date;
    }

    public void setPlan_eff_date(String plan_eff_date) {
        this.plan_eff_date = plan_eff_date;
    }

    public String getSponsor_dfe_name() {
        return sponsor_dfe_name;
    }

    public void setSponsor_dfe_name(String sponsor_dfe_name) {
        this.sponsor_dfe_name = sponsor_dfe_name;
    }

    public String getSpons_dfe_dba_name() {
        return spons_dfe_dba_name;
    }

    public void setSpons_dfe_dba_name(String spons_dfe_dba_name) {
        this.spons_dfe_dba_name = spons_dfe_dba_name;
    }

    public String getSpons_dfe_care_of_name() {
        return spons_dfe_care_of_name;
    }

    public void setSpons_dfe_care_of_name(String spons_dfe_care_of_name) {
        this.spons_dfe_care_of_name = spons_dfe_care_of_name;
    }

    public String getSpons_dfe_mail_us_address1() {
        return spons_dfe_mail_us_address1;
    }

    public void setSpons_dfe_mail_us_address1(String spons_dfe_mail_us_address1) {
        this.spons_dfe_mail_us_address1 = spons_dfe_mail_us_address1;
    }

    public String getSpons_dfe_mail_us_address2() {
        return spons_dfe_mail_us_address2;
    }

    public void setSpons_dfe_mail_us_address2(String spons_dfe_mail_us_address2) {
        this.spons_dfe_mail_us_address2 = spons_dfe_mail_us_address2;
    }

    public String getSpons_dfe_mail_us_city() {
        return spons_dfe_mail_us_city;
    }

    public void setSpons_dfe_mail_us_city(String spons_dfe_mail_us_city) {
        this.spons_dfe_mail_us_city = spons_dfe_mail_us_city;
    }

    public String getSpons_dfe_mail_us_state() {
        return spons_dfe_mail_us_state;
    }

    public void setSpons_dfe_mail_us_state(String spons_dfe_mail_us_state) {
        this.spons_dfe_mail_us_state = spons_dfe_mail_us_state;
    }

    public String getSpons_dfe_mail_us_zip() {
        return spons_dfe_mail_us_zip;
    }

    public void setSpons_dfe_mail_us_zip(String spons_dfe_mail_us_zip) {
        this.spons_dfe_mail_us_zip = spons_dfe_mail_us_zip;
    }

    public String getSpons_dfe_mail_foreign_addr1() {
        return spons_dfe_mail_foreign_addr1;
    }

    public void setSpons_dfe_mail_foreign_addr1(String spons_dfe_mail_foreign_addr1) {
        this.spons_dfe_mail_foreign_addr1 = spons_dfe_mail_foreign_addr1;
    }

    public String getSpons_dfe_mail_foreign_addr2() {
        return spons_dfe_mail_foreign_addr2;
    }

    public void setSpons_dfe_mail_foreign_addr2(String spons_dfe_mail_foreign_addr2) {
        this.spons_dfe_mail_foreign_addr2 = spons_dfe_mail_foreign_addr2;
    }

    public String getSpons_dfe_mail_foreign_city() {
        return spons_dfe_mail_foreign_city;
    }

    public void setSpons_dfe_mail_foreign_city(String spons_dfe_mail_foreign_city) {
        this.spons_dfe_mail_foreign_city = spons_dfe_mail_foreign_city;
    }

    public String getSpons_dfe_mail_forgn_prov_st() {
        return spons_dfe_mail_forgn_prov_st;
    }

    public void setSpons_dfe_mail_forgn_prov_st(String spons_dfe_mail_forgn_prov_st) {
        this.spons_dfe_mail_forgn_prov_st = spons_dfe_mail_forgn_prov_st;
    }

    public String getSpons_dfe_mail_foreign_cntry() {
        return spons_dfe_mail_foreign_cntry;
    }

    public void setSpons_dfe_mail_foreign_cntry(String spons_dfe_mail_foreign_cntry) {
        this.spons_dfe_mail_foreign_cntry = spons_dfe_mail_foreign_cntry;
    }

    public String getSpons_dfe_mail_forgn_postal_cd() {
        return spons_dfe_mail_forgn_postal_cd;
    }

    public void setSpons_dfe_mail_forgn_postal_cd(String spons_dfe_mail_forgn_postal_cd) {
        this.spons_dfe_mail_forgn_postal_cd = spons_dfe_mail_forgn_postal_cd;
    }

    public String getSpons_dfe_loc_us_address1() {
        return spons_dfe_loc_us_address1;
    }

    public void setSpons_dfe_loc_us_address1(String spons_dfe_loc_us_address1) {
        this.spons_dfe_loc_us_address1 = spons_dfe_loc_us_address1;
    }

    public String getSpons_dfe_loc_us_address2() {
        return spons_dfe_loc_us_address2;
    }

    public void setSpons_dfe_loc_us_address2(String spons_dfe_loc_us_address2) {
        this.spons_dfe_loc_us_address2 = spons_dfe_loc_us_address2;
    }

    public String getSpons_dfe_loc_us_city() {
        return spons_dfe_loc_us_city;
    }

    public void setSpons_dfe_loc_us_city(String spons_dfe_loc_us_city) {
        this.spons_dfe_loc_us_city = spons_dfe_loc_us_city;
    }

    public String getSpons_dfe_loc_us_state() {
        return spons_dfe_loc_us_state;
    }

    public void setSpons_dfe_loc_us_state(String spons_dfe_loc_us_state) {
        this.spons_dfe_loc_us_state = spons_dfe_loc_us_state;
    }

    public String getSpons_dfe_loc_us_zip() {
        return spons_dfe_loc_us_zip;
    }

    public void setSpons_dfe_loc_us_zip(String spons_dfe_loc_us_zip) {
        this.spons_dfe_loc_us_zip = spons_dfe_loc_us_zip;
    }

    public String getSpons_dfe_loc_foreign_address1() {
        return spons_dfe_loc_foreign_address1;
    }

    public void setSpons_dfe_loc_foreign_address1(String spons_dfe_loc_foreign_address1) {
        this.spons_dfe_loc_foreign_address1 = spons_dfe_loc_foreign_address1;
    }

    public String getSpons_dfe_loc_foreign_address2() {
        return spons_dfe_loc_foreign_address2;
    }

    public void setSpons_dfe_loc_foreign_address2(String spons_dfe_loc_foreign_address2) {
        this.spons_dfe_loc_foreign_address2 = spons_dfe_loc_foreign_address2;
    }

    public String getSpons_dfe_loc_foreign_city() {
        return spons_dfe_loc_foreign_city;
    }

    public void setSpons_dfe_loc_foreign_city(String spons_dfe_loc_foreign_city) {
        this.spons_dfe_loc_foreign_city = spons_dfe_loc_foreign_city;
    }

    public String getSpons_dfe_loc_forgn_prov_st() {
        return spons_dfe_loc_forgn_prov_st;
    }

    public void setSpons_dfe_loc_forgn_prov_st(String spons_dfe_loc_forgn_prov_st) {
        this.spons_dfe_loc_forgn_prov_st = spons_dfe_loc_forgn_prov_st;
    }

    public String getSpons_dfe_loc_foreign_cntry() {
        return spons_dfe_loc_foreign_cntry;
    }

    public void setSpons_dfe_loc_foreign_cntry(String spons_dfe_loc_foreign_cntry) {
        this.spons_dfe_loc_foreign_cntry = spons_dfe_loc_foreign_cntry;
    }

    public String getSpons_dfe_loc_forgn_postal_cd() {
        return spons_dfe_loc_forgn_postal_cd;
    }

    public void setSpons_dfe_loc_forgn_postal_cd(String spons_dfe_loc_forgn_postal_cd) {
        this.spons_dfe_loc_forgn_postal_cd = spons_dfe_loc_forgn_postal_cd;
    }

    public String getSpons_dfe_ein() {
        return spons_dfe_ein;
    }

    public void setSpons_dfe_ein(String spons_dfe_ein) {
        this.spons_dfe_ein = spons_dfe_ein;
    }

    public String getSpons_dfe_phone_num() {
        return spons_dfe_phone_num;
    }

    public void setSpons_dfe_phone_num(String spons_dfe_phone_num) {
        this.spons_dfe_phone_num = spons_dfe_phone_num;
    }

    public String getBusiness_code() {
        return business_code;
    }

    public void setBusiness_code(String business_code) {
        this.business_code = business_code;
    }

    public String getAdmin_name() {
        return admin_name;
    }

    public void setAdmin_name(String admin_name) {
        this.admin_name = admin_name;
    }

    public String getAdmin_care_of_name() {
        return admin_care_of_name;
    }

    public void setAdmin_care_of_name(String admin_care_of_name) {
        this.admin_care_of_name = admin_care_of_name;
    }

    public String getAdmin_us_address1() {
        return admin_us_address1;
    }

    public void setAdmin_us_address1(String admin_us_address1) {
        this.admin_us_address1 = admin_us_address1;
    }

    public String getAdmin_us_address2() {
        return admin_us_address2;
    }

    public void setAdmin_us_address2(String admin_us_address2) {
        this.admin_us_address2 = admin_us_address2;
    }

    public String getAdmin_us_city() {
        return admin_us_city;
    }

    public void setAdmin_us_city(String admin_us_city) {
        this.admin_us_city = admin_us_city;
    }

    public String getAdmin_us_state() {
        return admin_us_state;
    }

    public void setAdmin_us_state(String admin_us_state) {
        this.admin_us_state = admin_us_state;
    }

    public String getAdmin_us_zip() {
        return admin_us_zip;
    }

    public void setAdmin_us_zip(String admin_us_zip) {
        this.admin_us_zip = admin_us_zip;
    }

    public String getAdmin_foreign_address1() {
        return admin_foreign_address1;
    }

    public void setAdmin_foreign_address1(String admin_foreign_address1) {
        this.admin_foreign_address1 = admin_foreign_address1;
    }

    public String getAdmin_foreign_address2() {
        return admin_foreign_address2;
    }

    public void setAdmin_foreign_address2(String admin_foreign_address2) {
        this.admin_foreign_address2 = admin_foreign_address2;
    }

    public String getAdmin_foreign_city() {
        return admin_foreign_city;
    }

    public void setAdmin_foreign_city(String admin_foreign_city) {
        this.admin_foreign_city = admin_foreign_city;
    }

    public String getAdmin_foreign_prov_state() {
        return admin_foreign_prov_state;
    }

    public void setAdmin_foreign_prov_state(String admin_foreign_prov_state) {
        this.admin_foreign_prov_state = admin_foreign_prov_state;
    }

    public String getAdmin_foreign_cntry() {
        return admin_foreign_cntry;
    }

    public void setAdmin_foreign_cntry(String admin_foreign_cntry) {
        this.admin_foreign_cntry = admin_foreign_cntry;
    }

    public String getAdmin_foreign_postal_cd() {
        return admin_foreign_postal_cd;
    }

    public void setAdmin_foreign_postal_cd(String admin_foreign_postal_cd) {
        this.admin_foreign_postal_cd = admin_foreign_postal_cd;
    }

    public String getAdmin_ein() {
        return admin_ein;
    }

    public void setAdmin_ein(String admin_ein) {
        this.admin_ein = admin_ein;
    }

    public String getAdmin_phone_num() {
        return admin_phone_num;
    }

    public void setAdmin_phone_num(String admin_phone_num) {
        this.admin_phone_num = admin_phone_num;
    }

    public String getLast_rpt_spons_name() {
        return last_rpt_spons_name;
    }

    public void setLast_rpt_spons_name(String last_rpt_spons_name) {
        this.last_rpt_spons_name = last_rpt_spons_name;
    }

    public String getLast_rpt_spons_ein() {
        return last_rpt_spons_ein;
    }

    public void setLast_rpt_spons_ein(String last_rpt_spons_ein) {
        this.last_rpt_spons_ein = last_rpt_spons_ein;
    }

    public String getLast_rpt_plan_num() {
        return last_rpt_plan_num;
    }

    public void setLast_rpt_plan_num(String last_rpt_plan_num) {
        this.last_rpt_plan_num = last_rpt_plan_num;
    }

    public String getAdmin_signed_date() {
        return admin_signed_date;
    }

    public void setAdmin_signed_date(String admin_signed_date) {
        this.admin_signed_date = admin_signed_date;
    }

    public String getAdmin_signed_name() {
        return admin_signed_name;
    }

    public void setAdmin_signed_name(String admin_signed_name) {
        this.admin_signed_name = admin_signed_name;
    }

    public String getSpons_signed_date() {
        return spons_signed_date;
    }

    public void setSpons_signed_date(String spons_signed_date) {
        this.spons_signed_date = spons_signed_date;
    }

    public String getSpons_signed_name() {
        return spons_signed_name;
    }

    public void setSpons_signed_name(String spons_signed_name) {
        this.spons_signed_name = spons_signed_name;
    }

    public String getDfe_signed_date() {
        return dfe_signed_date;
    }

    public void setDfe_signed_date(String dfe_signed_date) {
        this.dfe_signed_date = dfe_signed_date;
    }

    public String getDfe_signed_name() {
        return dfe_signed_name;
    }

    public void setDfe_signed_name(String dfe_signed_name) {
        this.dfe_signed_name = dfe_signed_name;
    }

    public Long getTot_partcp_boy_cnt() {
        return tot_partcp_boy_cnt;
    }

    public void setTot_partcp_boy_cnt(Long tot_partcp_boy_cnt) {
        this.tot_partcp_boy_cnt = tot_partcp_boy_cnt;
    }

    public Long getTot_active_partcp_cnt() {
        return tot_active_partcp_cnt;
    }

    public void setTot_active_partcp_cnt(Long tot_active_partcp_cnt) {
        this.tot_active_partcp_cnt = tot_active_partcp_cnt;
    }

    public Long getRtd_sep_partcp_rcvg_cnt() {
        return rtd_sep_partcp_rcvg_cnt;
    }

    public void setRtd_sep_partcp_rcvg_cnt(Long rtd_sep_partcp_rcvg_cnt) {
        this.rtd_sep_partcp_rcvg_cnt = rtd_sep_partcp_rcvg_cnt;
    }

    public Long getRtd_sep_partcp_fut_cnt() {
        return rtd_sep_partcp_fut_cnt;
    }

    public void setRtd_sep_partcp_fut_cnt(Long rtd_sep_partcp_fut_cnt) {
        this.rtd_sep_partcp_fut_cnt = rtd_sep_partcp_fut_cnt;
    }

    public Long getSubtl_act_rtd_sep_cnt() {
        return subtl_act_rtd_sep_cnt;
    }

    public void setSubtl_act_rtd_sep_cnt(Long subtl_act_rtd_sep_cnt) {
        this.subtl_act_rtd_sep_cnt = subtl_act_rtd_sep_cnt;
    }

    public Long getBenef_rcvg_bnft_cnt() {
        return benef_rcvg_bnft_cnt;
    }

    public void setBenef_rcvg_bnft_cnt(Long benef_rcvg_bnft_cnt) {
        this.benef_rcvg_bnft_cnt = benef_rcvg_bnft_cnt;
    }

    public Long getTot_act_rtd_sep_benef_cnt() {
        return tot_act_rtd_sep_benef_cnt;
    }

    public void setTot_act_rtd_sep_benef_cnt(Long tot_act_rtd_sep_benef_cnt) {
        this.tot_act_rtd_sep_benef_cnt = tot_act_rtd_sep_benef_cnt;
    }

    public Long getPartcp_account_bal_cnt() {
        return partcp_account_bal_cnt;
    }

    public void setPartcp_account_bal_cnt(Long partcp_account_bal_cnt) {
        this.partcp_account_bal_cnt = partcp_account_bal_cnt;
    }

    public Long getSep_partcp_partl_vstd_cnt() {
        return sep_partcp_partl_vstd_cnt;
    }

    public void setSep_partcp_partl_vstd_cnt(Long sep_partcp_partl_vstd_cnt) {
        this.sep_partcp_partl_vstd_cnt = sep_partcp_partl_vstd_cnt;
    }

    public Long getContrib_emplrs_cnt() {
        return contrib_emplrs_cnt;
    }

    public void setContrib_emplrs_cnt(Long contrib_emplrs_cnt) {
        this.contrib_emplrs_cnt = contrib_emplrs_cnt;
    }

    public String getType_pension_bnft_code() {
        return type_pension_bnft_code;
    }

    public void setType_pension_bnft_code(String type_pension_bnft_code) {
        this.type_pension_bnft_code = type_pension_bnft_code;
    }

    public String getType_welfare_bnft_code() {
        return type_welfare_bnft_code;
    }

    public void setType_welfare_bnft_code(String type_welfare_bnft_code) {
        this.type_welfare_bnft_code = type_welfare_bnft_code;
    }

    public String getFunding_insurance_ind() {
        return funding_insurance_ind;
    }

    public void setFunding_insurance_ind(String funding_insurance_ind) {
        this.funding_insurance_ind = funding_insurance_ind;
    }

    public String getFunding_sec412_ind() {
        return funding_sec412_ind;
    }

    public void setFunding_sec412_ind(String funding_sec412_ind) {
        this.funding_sec412_ind = funding_sec412_ind;
    }

    public String getFunding_trust_ind() {
        return funding_trust_ind;
    }

    public void setFunding_trust_ind(String funding_trust_ind) {
        this.funding_trust_ind = funding_trust_ind;
    }

    public String getFunding_gen_asset_ind() {
        return funding_gen_asset_ind;
    }

    public void setFunding_gen_asset_ind(String funding_gen_asset_ind) {
        this.funding_gen_asset_ind = funding_gen_asset_ind;
    }

    public String getBenefit_insurance_ind() {
        return benefit_insurance_ind;
    }

    public void setBenefit_insurance_ind(String benefit_insurance_ind) {
        this.benefit_insurance_ind = benefit_insurance_ind;
    }

    public String getBenefit_sec412_ind() {
        return benefit_sec412_ind;
    }

    public void setBenefit_sec412_ind(String benefit_sec412_ind) {
        this.benefit_sec412_ind = benefit_sec412_ind;
    }

    public String getBenefit_trust_ind() {
        return benefit_trust_ind;
    }

    public void setBenefit_trust_ind(String benefit_trust_ind) {
        this.benefit_trust_ind = benefit_trust_ind;
    }

    public String getBenefit_gen_asset_ind() {
        return benefit_gen_asset_ind;
    }

    public void setBenefit_gen_asset_ind(String benefit_gen_asset_ind) {
        this.benefit_gen_asset_ind = benefit_gen_asset_ind;
    }

    public String getSch_r_attached_ind() {
        return sch_r_attached_ind;
    }

    public void setSch_r_attached_ind(String sch_r_attached_ind) {
        this.sch_r_attached_ind = sch_r_attached_ind;
    }

    public String getSch_mb_attached_ind() {
        return sch_mb_attached_ind;
    }

    public void setSch_mb_attached_ind(String sch_mb_attached_ind) {
        this.sch_mb_attached_ind = sch_mb_attached_ind;
    }

    public String getSch_sb_attached_ind() {
        return sch_sb_attached_ind;
    }

    public void setSch_sb_attached_ind(String sch_sb_attached_ind) {
        this.sch_sb_attached_ind = sch_sb_attached_ind;
    }

    public String getSch_h_attached_ind() {
        return sch_h_attached_ind;
    }

    public void setSch_h_attached_ind(String sch_h_attached_ind) {
        this.sch_h_attached_ind = sch_h_attached_ind;
    }

    public String getSch_i_attached_ind() {
        return sch_i_attached_ind;
    }

    public void setSch_i_attached_ind(String sch_i_attached_ind) {
        this.sch_i_attached_ind = sch_i_attached_ind;
    }

    public String getSch_a_attached_ind() {
        return sch_a_attached_ind;
    }

    public void setSch_a_attached_ind(String sch_a_attached_ind) {
        this.sch_a_attached_ind = sch_a_attached_ind;
    }

    public String getNum_sch_a_attached_cnt() {
        return num_sch_a_attached_cnt;
    }

    public void setNum_sch_a_attached_cnt(String num_sch_a_attached_cnt) {
        this.num_sch_a_attached_cnt = num_sch_a_attached_cnt;
    }

    public String getSch_c_attached_ind() {
        return sch_c_attached_ind;
    }

    public void setSch_c_attached_ind(String sch_c_attached_ind) {
        this.sch_c_attached_ind = sch_c_attached_ind;
    }

    public String getSch_d_attached_ind() {
        return sch_d_attached_ind;
    }

    public void setSch_d_attached_ind(String sch_d_attached_ind) {
        this.sch_d_attached_ind = sch_d_attached_ind;
    }

    public String getSch_g_attached_ind() {
        return sch_g_attached_ind;
    }

    public void setSch_g_attached_ind(String sch_g_attached_ind) {
        this.sch_g_attached_ind = sch_g_attached_ind;
    }

    public String getFiling_status() {
        return filing_status;
    }

    public void setFiling_status(String filing_status) {
        this.filing_status = filing_status;
    }

    public String getDate_received() {
        return date_received;
    }

    public void setDate_received(String date_received) {
        this.date_received = date_received;
    }

    public String getValid_admin_signature() {
        return valid_admin_signature;
    }

    public void setValid_admin_signature(String valid_admin_signature) {
        this.valid_admin_signature = valid_admin_signature;
    }

    public String getValid_dfe_signature() {
        return valid_dfe_signature;
    }

    public void setValid_dfe_signature(String valid_dfe_signature) {
        this.valid_dfe_signature = valid_dfe_signature;
    }

    public String getValid_sponsor_signature() {
        return valid_sponsor_signature;
    }

    public void setValid_sponsor_signature(String valid_sponsor_signature) {
        this.valid_sponsor_signature = valid_sponsor_signature;
    }

    public String getAdmin_phone_num_foreign() {
        return admin_phone_num_foreign;
    }

    public void setAdmin_phone_num_foreign(String admin_phone_num_foreign) {
        this.admin_phone_num_foreign = admin_phone_num_foreign;
    }

    public String getSpons_dfe_phone_num_foreign() {
        return spons_dfe_phone_num_foreign;
    }

    public void setSpons_dfe_phone_num_foreign(String spons_dfe_phone_num_foreign) {
        this.spons_dfe_phone_num_foreign = spons_dfe_phone_num_foreign;
    }

    public String getAdmin_name_same_spon_ind() {
        return admin_name_same_spon_ind;
    }

    public void setAdmin_name_same_spon_ind(String admin_name_same_spon_ind) {
        this.admin_name_same_spon_ind = admin_name_same_spon_ind;
    }

    public String getAdmin_address_same_spon_ind() {
        return admin_address_same_spon_ind;
    }

    public void setAdmin_address_same_spon_ind(String admin_address_same_spon_ind) {
        this.admin_address_same_spon_ind = admin_address_same_spon_ind;
    }

    public String getPreparer_name() {
        return preparer_name;
    }

    public void setPreparer_name(String preparer_name) {
        this.preparer_name = preparer_name;
    }

    public String getPreparer_firm_name() {
        return preparer_firm_name;
    }

    public void setPreparer_firm_name(String preparer_firm_name) {
        this.preparer_firm_name = preparer_firm_name;
    }

    public String getPreparer_us_address1() {
        return preparer_us_address1;
    }

    public void setPreparer_us_address1(String preparer_us_address1) {
        this.preparer_us_address1 = preparer_us_address1;
    }

    public String getPreparer_us_address2() {
        return preparer_us_address2;
    }

    public void setPreparer_us_address2(String preparer_us_address2) {
        this.preparer_us_address2 = preparer_us_address2;
    }

    public String getPreparer_us_city() {
        return preparer_us_city;
    }

    public void setPreparer_us_city(String preparer_us_city) {
        this.preparer_us_city = preparer_us_city;
    }

    public String getPreparer_us_state() {
        return preparer_us_state;
    }

    public void setPreparer_us_state(String preparer_us_state) {
        this.preparer_us_state = preparer_us_state;
    }

    public String getPreparer_us_zip() {
        return preparer_us_zip;
    }

    public void setPreparer_us_zip(String preparer_us_zip) {
        this.preparer_us_zip = preparer_us_zip;
    }

    public String getPreparer_foreign_address1() {
        return preparer_foreign_address1;
    }

    public void setPreparer_foreign_address1(String preparer_foreign_address1) {
        this.preparer_foreign_address1 = preparer_foreign_address1;
    }

    public String getPreparer_foreign_address2() {
        return preparer_foreign_address2;
    }

    public void setPreparer_foreign_address2(String preparer_foreign_address2) {
        this.preparer_foreign_address2 = preparer_foreign_address2;
    }

    public String getPreparer_foreign_city() {
        return preparer_foreign_city;
    }

    public void setPreparer_foreign_city(String preparer_foreign_city) {
        this.preparer_foreign_city = preparer_foreign_city;
    }

    public String getPreparer_foreign_prov_state() {
        return preparer_foreign_prov_state;
    }

    public void setPreparer_foreign_prov_state(String preparer_foreign_prov_state) {
        this.preparer_foreign_prov_state = preparer_foreign_prov_state;
    }

    public String getPreparer_foreign_cntry() {
        return preparer_foreign_cntry;
    }

    public void setPreparer_foreign_cntry(String preparer_foreign_cntry) {
        this.preparer_foreign_cntry = preparer_foreign_cntry;
    }

    public String getPreparer_foreign_postal_cd() {
        return preparer_foreign_postal_cd;
    }

    public void setPreparer_foreign_postal_cd(String preparer_foreign_postal_cd) {
        this.preparer_foreign_postal_cd = preparer_foreign_postal_cd;
    }

    public String getPreparer_phone_num() {
        return preparer_phone_num;
    }

    public void setPreparer_phone_num(String preparer_phone_num) {
        this.preparer_phone_num = preparer_phone_num;
    }

    public String getPreparer_phone_num_foreign() {
        return preparer_phone_num_foreign;
    }

    public void setPreparer_phone_num_foreign(String preparer_phone_num_foreign) {
        this.preparer_phone_num_foreign = preparer_phone_num_foreign;
    }

    public String getTot_act_partcp_boy_cnt() {
        return tot_act_partcp_boy_cnt;
    }

    public void setTot_act_partcp_boy_cnt(String tot_act_partcp_boy_cnt) {
        this.tot_act_partcp_boy_cnt = tot_act_partcp_boy_cnt;
    }

    public String getSubj_m1_filing_req_ind() {
        return subj_m1_filing_req_ind;
    }

    public void setSubj_m1_filing_req_ind(String subj_m1_filing_req_ind) {
        this.subj_m1_filing_req_ind = subj_m1_filing_req_ind;
    }

    public String getCompliance_m1_filing_req_ind() {
        return compliance_m1_filing_req_ind;
    }

    public void setCompliance_m1_filing_req_ind(String compliance_m1_filing_req_ind) {
        this.compliance_m1_filing_req_ind = compliance_m1_filing_req_ind;
    }

    public String getM1_receipt_confirmation_code() {
        return m1_receipt_confirmation_code;
    }

    public void setM1_receipt_confirmation_code(String m1_receipt_confirmation_code) {
        this.m1_receipt_confirmation_code = m1_receipt_confirmation_code;
    }

    public String getAdmin_manual_signed_date() {
        return admin_manual_signed_date;
    }

    public void setAdmin_manual_signed_date(String admin_manual_signed_date) {
        this.admin_manual_signed_date = admin_manual_signed_date;
    }

    public String getAdmin_manual_signed_name() {
        return admin_manual_signed_name;
    }

    public void setAdmin_manual_signed_name(String admin_manual_signed_name) {
        this.admin_manual_signed_name = admin_manual_signed_name;
    }

    public String getLast_rpt_plan_name() {
        return last_rpt_plan_name;
    }

    public void setLast_rpt_plan_name(String last_rpt_plan_name) {
        this.last_rpt_plan_name = last_rpt_plan_name;
    }

    public String getSpons_manual_signed_date() {
        return spons_manual_signed_date;
    }

    public void setSpons_manual_signed_date(String spons_manual_signed_date) {
        this.spons_manual_signed_date = spons_manual_signed_date;
    }

    public String getSpons_manual_signed_name() {
        return spons_manual_signed_name;
    }

    public void setSpons_manual_signed_name(String spons_manual_signed_name) {
        this.spons_manual_signed_name = spons_manual_signed_name;
    }

    public String getDfe_manual_signed_date() {
        return dfe_manual_signed_date;
    }

    public void setDfe_manual_signed_date(String dfe_manual_signed_date) {
        this.dfe_manual_signed_date = dfe_manual_signed_date;
    }

    public String getDfe_manual_signed_name() {
        return dfe_manual_signed_name;
    }

    public void setDfe_manual_signed_name(String dfe_manual_signed_name) {
        this.dfe_manual_signed_name = dfe_manual_signed_name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PlanDocument)) return false;
        PlanDocument that = (PlanDocument) o;
        return Objects.equals(getId(), that.getId()) &&
                Objects.equals(getAck_id(), that.getAck_id()) &&
                Objects.equals(getForm_plan_year_begin_date(), that.getForm_plan_year_begin_date()) &&
                Objects.equals(getForm_tax_prd(), that.getForm_tax_prd()) &&
                Objects.equals(getType_plan_entity_cd(), that.getType_plan_entity_cd()) &&
                Objects.equals(getType_dfe_plan_entity_cd(), that.getType_dfe_plan_entity_cd()) &&
                Objects.equals(getInitial_filing_ind(), that.getInitial_filing_ind()) &&
                Objects.equals(getAmended_ind(), that.getAmended_ind()) &&
                Objects.equals(getFinal_filing_ind(), that.getFinal_filing_ind()) &&
                Objects.equals(getShort_plan_yr_ind(), that.getShort_plan_yr_ind()) &&
                Objects.equals(getCollective_bargain_ind(), that.getCollective_bargain_ind()) &&
                Objects.equals(getF5558_application_filed_iND(), that.getF5558_application_filed_iND()) &&
                Objects.equals(getExt_automatic_ind(), that.getExt_automatic_ind()) &&
                Objects.equals(getDfvc_program_ind(), that.getDfvc_program_ind()) &&
                Objects.equals(getExt_special_ind(), that.getExt_special_ind()) &&
                Objects.equals(getExt_special_text(), that.getExt_special_text()) &&
                Objects.equals(getPlan_name(), that.getPlan_name()) &&
                Objects.equals(getSpons_dfe_pn(), that.getSpons_dfe_pn()) &&
                Objects.equals(getPlan_eff_date(), that.getPlan_eff_date()) &&
                Objects.equals(getSponsor_dfe_name(), that.getSponsor_dfe_name()) &&
                Objects.equals(getSpons_dfe_dba_name(), that.getSpons_dfe_dba_name()) &&
                Objects.equals(getSpons_dfe_care_of_name(), that.getSpons_dfe_care_of_name()) &&
                Objects.equals(getSpons_dfe_mail_us_address1(), that.getSpons_dfe_mail_us_address1()) &&
                Objects.equals(getSpons_dfe_mail_us_address2(), that.getSpons_dfe_mail_us_address2()) &&
                Objects.equals(getSpons_dfe_mail_us_city(), that.getSpons_dfe_mail_us_city()) &&
                Objects.equals(getSpons_dfe_mail_us_state(), that.getSpons_dfe_mail_us_state()) &&
                Objects.equals(getSpons_dfe_mail_us_zip(), that.getSpons_dfe_mail_us_zip()) &&
                Objects.equals(getSpons_dfe_mail_foreign_addr1(), that.getSpons_dfe_mail_foreign_addr1()) &&
                Objects.equals(getSpons_dfe_mail_foreign_addr2(), that.getSpons_dfe_mail_foreign_addr2()) &&
                Objects.equals(getSpons_dfe_mail_foreign_city(), that.getSpons_dfe_mail_foreign_city()) &&
                Objects.equals(getSpons_dfe_mail_forgn_prov_st(), that.getSpons_dfe_mail_forgn_prov_st()) &&
                Objects.equals(getSpons_dfe_mail_foreign_cntry(), that.getSpons_dfe_mail_foreign_cntry()) &&
                Objects.equals(getSpons_dfe_mail_forgn_postal_cd(), that.getSpons_dfe_mail_forgn_postal_cd()) &&
                Objects.equals(getSpons_dfe_loc_us_address1(), that.getSpons_dfe_loc_us_address1()) &&
                Objects.equals(getSpons_dfe_loc_us_address2(), that.getSpons_dfe_loc_us_address2()) &&
                Objects.equals(getSpons_dfe_loc_us_city(), that.getSpons_dfe_loc_us_city()) &&
                Objects.equals(getSpons_dfe_loc_us_state(), that.getSpons_dfe_loc_us_state()) &&
                Objects.equals(getSpons_dfe_loc_us_zip(), that.getSpons_dfe_loc_us_zip()) &&
                Objects.equals(getSpons_dfe_loc_foreign_address1(), that.getSpons_dfe_loc_foreign_address1()) &&
                Objects.equals(getSpons_dfe_loc_foreign_address2(), that.getSpons_dfe_loc_foreign_address2()) &&
                Objects.equals(getSpons_dfe_loc_foreign_city(), that.getSpons_dfe_loc_foreign_city()) &&
                Objects.equals(getSpons_dfe_loc_forgn_prov_st(), that.getSpons_dfe_loc_forgn_prov_st()) &&
                Objects.equals(getSpons_dfe_loc_foreign_cntry(), that.getSpons_dfe_loc_foreign_cntry()) &&
                Objects.equals(getSpons_dfe_loc_forgn_postal_cd(), that.getSpons_dfe_loc_forgn_postal_cd()) &&
                Objects.equals(getSpons_dfe_ein(), that.getSpons_dfe_ein()) &&
                Objects.equals(getSpons_dfe_phone_num(), that.getSpons_dfe_phone_num()) &&
                Objects.equals(getBusiness_code(), that.getBusiness_code()) &&
                Objects.equals(getAdmin_name(), that.getAdmin_name()) &&
                Objects.equals(getAdmin_care_of_name(), that.getAdmin_care_of_name()) &&
                Objects.equals(getAdmin_us_address1(), that.getAdmin_us_address1()) &&
                Objects.equals(getAdmin_us_address2(), that.getAdmin_us_address2()) &&
                Objects.equals(getAdmin_us_city(), that.getAdmin_us_city()) &&
                Objects.equals(getAdmin_us_state(), that.getAdmin_us_state()) &&
                Objects.equals(getAdmin_us_zip(), that.getAdmin_us_zip()) &&
                Objects.equals(getAdmin_foreign_address1(), that.getAdmin_foreign_address1()) &&
                Objects.equals(getAdmin_foreign_address2(), that.getAdmin_foreign_address2()) &&
                Objects.equals(getAdmin_foreign_city(), that.getAdmin_foreign_city()) &&
                Objects.equals(getAdmin_foreign_prov_state(), that.getAdmin_foreign_prov_state()) &&
                Objects.equals(getAdmin_foreign_cntry(), that.getAdmin_foreign_cntry()) &&
                Objects.equals(getAdmin_foreign_postal_cd(), that.getAdmin_foreign_postal_cd()) &&
                Objects.equals(getAdmin_ein(), that.getAdmin_ein()) &&
                Objects.equals(getAdmin_phone_num(), that.getAdmin_phone_num()) &&
                Objects.equals(getLast_rpt_spons_name(), that.getLast_rpt_spons_name()) &&
                Objects.equals(getLast_rpt_spons_ein(), that.getLast_rpt_spons_ein()) &&
                Objects.equals(getLast_rpt_plan_num(), that.getLast_rpt_plan_num()) &&
                Objects.equals(getAdmin_signed_date(), that.getAdmin_signed_date()) &&
                Objects.equals(getAdmin_signed_name(), that.getAdmin_signed_name()) &&
                Objects.equals(getSpons_signed_date(), that.getSpons_signed_date()) &&
                Objects.equals(getSpons_signed_name(), that.getSpons_signed_name()) &&
                Objects.equals(getDfe_signed_date(), that.getDfe_signed_date()) &&
                Objects.equals(getDfe_signed_name(), that.getDfe_signed_name()) &&
                Objects.equals(getTot_partcp_boy_cnt(), that.getTot_partcp_boy_cnt()) &&
                Objects.equals(getTot_active_partcp_cnt(), that.getTot_active_partcp_cnt()) &&
                Objects.equals(getRtd_sep_partcp_rcvg_cnt(), that.getRtd_sep_partcp_rcvg_cnt()) &&
                Objects.equals(getRtd_sep_partcp_fut_cnt(), that.getRtd_sep_partcp_fut_cnt()) &&
                Objects.equals(getSubtl_act_rtd_sep_cnt(), that.getSubtl_act_rtd_sep_cnt()) &&
                Objects.equals(getBenef_rcvg_bnft_cnt(), that.getBenef_rcvg_bnft_cnt()) &&
                Objects.equals(getTot_act_rtd_sep_benef_cnt(), that.getTot_act_rtd_sep_benef_cnt()) &&
                Objects.equals(getPartcp_account_bal_cnt(), that.getPartcp_account_bal_cnt()) &&
                Objects.equals(getSep_partcp_partl_vstd_cnt(), that.getSep_partcp_partl_vstd_cnt()) &&
                Objects.equals(getContrib_emplrs_cnt(), that.getContrib_emplrs_cnt()) &&
                Objects.equals(getType_pension_bnft_code(), that.getType_pension_bnft_code()) &&
                Objects.equals(getType_welfare_bnft_code(), that.getType_welfare_bnft_code()) &&
                Objects.equals(getFunding_insurance_ind(), that.getFunding_insurance_ind()) &&
                Objects.equals(getFunding_sec412_ind(), that.getFunding_sec412_ind()) &&
                Objects.equals(getFunding_trust_ind(), that.getFunding_trust_ind()) &&
                Objects.equals(getFunding_gen_asset_ind(), that.getFunding_gen_asset_ind()) &&
                Objects.equals(getBenefit_insurance_ind(), that.getBenefit_insurance_ind()) &&
                Objects.equals(getBenefit_sec412_ind(), that.getBenefit_sec412_ind()) &&
                Objects.equals(getBenefit_trust_ind(), that.getBenefit_trust_ind()) &&
                Objects.equals(getBenefit_gen_asset_ind(), that.getBenefit_gen_asset_ind()) &&
                Objects.equals(getSch_r_attached_ind(), that.getSch_r_attached_ind()) &&
                Objects.equals(getSch_mb_attached_ind(), that.getSch_mb_attached_ind()) &&
                Objects.equals(getSch_sb_attached_ind(), that.getSch_sb_attached_ind()) &&
                Objects.equals(getSch_h_attached_ind(), that.getSch_h_attached_ind()) &&
                Objects.equals(getSch_i_attached_ind(), that.getSch_i_attached_ind()) &&
                Objects.equals(getSch_a_attached_ind(), that.getSch_a_attached_ind()) &&
                Objects.equals(getNum_sch_a_attached_cnt(), that.getNum_sch_a_attached_cnt()) &&
                Objects.equals(getSch_c_attached_ind(), that.getSch_c_attached_ind()) &&
                Objects.equals(getSch_d_attached_ind(), that.getSch_d_attached_ind()) &&
                Objects.equals(getSch_g_attached_ind(), that.getSch_g_attached_ind()) &&
                Objects.equals(getFiling_status(), that.getFiling_status()) &&
                Objects.equals(getDate_received(), that.getDate_received()) &&
                Objects.equals(getValid_admin_signature(), that.getValid_admin_signature()) &&
                Objects.equals(getValid_dfe_signature(), that.getValid_dfe_signature()) &&
                Objects.equals(getValid_sponsor_signature(), that.getValid_sponsor_signature()) &&
                Objects.equals(getAdmin_phone_num_foreign(), that.getAdmin_phone_num_foreign()) &&
                Objects.equals(getSpons_dfe_phone_num_foreign(), that.getSpons_dfe_phone_num_foreign()) &&
                Objects.equals(getAdmin_name_same_spon_ind(), that.getAdmin_name_same_spon_ind()) &&
                Objects.equals(getAdmin_address_same_spon_ind(), that.getAdmin_address_same_spon_ind()) &&
                Objects.equals(getPreparer_name(), that.getPreparer_name()) &&
                Objects.equals(getPreparer_firm_name(), that.getPreparer_firm_name()) &&
                Objects.equals(getPreparer_us_address1(), that.getPreparer_us_address1()) &&
                Objects.equals(getPreparer_us_address2(), that.getPreparer_us_address2()) &&
                Objects.equals(getPreparer_us_city(), that.getPreparer_us_city()) &&
                Objects.equals(getPreparer_us_state(), that.getPreparer_us_state()) &&
                Objects.equals(getPreparer_us_zip(), that.getPreparer_us_zip()) &&
                Objects.equals(getPreparer_foreign_address1(), that.getPreparer_foreign_address1()) &&
                Objects.equals(getPreparer_foreign_address2(), that.getPreparer_foreign_address2()) &&
                Objects.equals(getPreparer_foreign_city(), that.getPreparer_foreign_city()) &&
                Objects.equals(getPreparer_foreign_prov_state(), that.getPreparer_foreign_prov_state()) &&
                Objects.equals(getPreparer_foreign_cntry(), that.getPreparer_foreign_cntry()) &&
                Objects.equals(getPreparer_foreign_postal_cd(), that.getPreparer_foreign_postal_cd()) &&
                Objects.equals(getPreparer_phone_num(), that.getPreparer_phone_num()) &&
                Objects.equals(getPreparer_phone_num_foreign(), that.getPreparer_phone_num_foreign()) &&
                Objects.equals(getTot_act_partcp_boy_cnt(), that.getTot_act_partcp_boy_cnt()) &&
                Objects.equals(getSubj_m1_filing_req_ind(), that.getSubj_m1_filing_req_ind()) &&
                Objects.equals(getCompliance_m1_filing_req_ind(), that.getCompliance_m1_filing_req_ind()) &&
                Objects.equals(getM1_receipt_confirmation_code(), that.getM1_receipt_confirmation_code()) &&
                Objects.equals(getAdmin_manual_signed_date(), that.getAdmin_manual_signed_date()) &&
                Objects.equals(getAdmin_manual_signed_name(), that.getAdmin_manual_signed_name()) &&
                Objects.equals(getLast_rpt_plan_name(), that.getLast_rpt_plan_name()) &&
                Objects.equals(getSpons_manual_signed_date(), that.getSpons_manual_signed_date()) &&
                Objects.equals(getSpons_manual_signed_name(), that.getSpons_manual_signed_name()) &&
                Objects.equals(getDfe_manual_signed_date(), that.getDfe_manual_signed_date()) &&
                Objects.equals(getDfe_manual_signed_name(), that.getDfe_manual_signed_name());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getAck_id(), getForm_plan_year_begin_date(), getForm_tax_prd(), getType_plan_entity_cd(), getType_dfe_plan_entity_cd(), getInitial_filing_ind(), getAmended_ind(), getFinal_filing_ind(), getShort_plan_yr_ind(), getCollective_bargain_ind(), getF5558_application_filed_iND(), getExt_automatic_ind(), getDfvc_program_ind(), getExt_special_ind(), getExt_special_text(), getPlan_name(), getSpons_dfe_pn(), getPlan_eff_date(), getSponsor_dfe_name(), getSpons_dfe_dba_name(), getSpons_dfe_care_of_name(), getSpons_dfe_mail_us_address1(), getSpons_dfe_mail_us_address2(), getSpons_dfe_mail_us_city(), getSpons_dfe_mail_us_state(), getSpons_dfe_mail_us_zip(), getSpons_dfe_mail_foreign_addr1(), getSpons_dfe_mail_foreign_addr2(), getSpons_dfe_mail_foreign_city(), getSpons_dfe_mail_forgn_prov_st(), getSpons_dfe_mail_foreign_cntry(), getSpons_dfe_mail_forgn_postal_cd(), getSpons_dfe_loc_us_address1(), getSpons_dfe_loc_us_address2(), getSpons_dfe_loc_us_city(), getSpons_dfe_loc_us_state(), getSpons_dfe_loc_us_zip(), getSpons_dfe_loc_foreign_address1(), getSpons_dfe_loc_foreign_address2(), getSpons_dfe_loc_foreign_city(), getSpons_dfe_loc_forgn_prov_st(), getSpons_dfe_loc_foreign_cntry(), getSpons_dfe_loc_forgn_postal_cd(), getSpons_dfe_ein(), getSpons_dfe_phone_num(), getBusiness_code(), getAdmin_name(), getAdmin_care_of_name(), getAdmin_us_address1(), getAdmin_us_address2(), getAdmin_us_city(), getAdmin_us_state(), getAdmin_us_zip(), getAdmin_foreign_address1(), getAdmin_foreign_address2(), getAdmin_foreign_city(), getAdmin_foreign_prov_state(), getAdmin_foreign_cntry(), getAdmin_foreign_postal_cd(), getAdmin_ein(), getAdmin_phone_num(), getLast_rpt_spons_name(), getLast_rpt_spons_ein(), getLast_rpt_plan_num(), getAdmin_signed_date(), getAdmin_signed_name(), getSpons_signed_date(), getSpons_signed_name(), getDfe_signed_date(), getDfe_signed_name(), getTot_partcp_boy_cnt(), getTot_active_partcp_cnt(), getRtd_sep_partcp_rcvg_cnt(), getRtd_sep_partcp_fut_cnt(), getSubtl_act_rtd_sep_cnt(), getBenef_rcvg_bnft_cnt(), getTot_act_rtd_sep_benef_cnt(), getPartcp_account_bal_cnt(), getSep_partcp_partl_vstd_cnt(), getContrib_emplrs_cnt(), getType_pension_bnft_code(), getType_welfare_bnft_code(), getFunding_insurance_ind(), getFunding_sec412_ind(), getFunding_trust_ind(), getFunding_gen_asset_ind(), getBenefit_insurance_ind(), getBenefit_sec412_ind(), getBenefit_trust_ind(), getBenefit_gen_asset_ind(), getSch_r_attached_ind(), getSch_mb_attached_ind(), getSch_sb_attached_ind(), getSch_h_attached_ind(), getSch_i_attached_ind(), getSch_a_attached_ind(), getNum_sch_a_attached_cnt(), getSch_c_attached_ind(), getSch_d_attached_ind(), getSch_g_attached_ind(), getFiling_status(), getDate_received(), getValid_admin_signature(), getValid_dfe_signature(), getValid_sponsor_signature(), getAdmin_phone_num_foreign(), getSpons_dfe_phone_num_foreign(), getAdmin_name_same_spon_ind(), getAdmin_address_same_spon_ind(), getPreparer_name(), getPreparer_firm_name(), getPreparer_us_address1(), getPreparer_us_address2(), getPreparer_us_city(), getPreparer_us_state(), getPreparer_us_zip(), getPreparer_foreign_address1(), getPreparer_foreign_address2(), getPreparer_foreign_city(), getPreparer_foreign_prov_state(), getPreparer_foreign_cntry(), getPreparer_foreign_postal_cd(), getPreparer_phone_num(), getPreparer_phone_num_foreign(), getTot_act_partcp_boy_cnt(), getSubj_m1_filing_req_ind(), getCompliance_m1_filing_req_ind(), getM1_receipt_confirmation_code(), getAdmin_manual_signed_date(), getAdmin_manual_signed_name(), getLast_rpt_plan_name(), getSpons_manual_signed_date(), getSpons_manual_signed_name(), getDfe_manual_signed_date(), getDfe_manual_signed_name());
    }

    @Override
    public String toString() {
        return "PlanDocument{" +
                "id='" + id + '\'' +
                ", ack_id='" + ack_id + '\'' +
                ", form_plan_year_begin_date='" + form_plan_year_begin_date + '\'' +
                ", form_tax_prd='" + form_tax_prd + '\'' +
                ", type_plan_entity_cd='" + type_plan_entity_cd + '\'' +
                ", type_dfe_plan_entity_cd='" + type_dfe_plan_entity_cd + '\'' +
                ", initial_filing_ind='" + initial_filing_ind + '\'' +
                ", amended_ind='" + amended_ind + '\'' +
                ", final_filing_ind='" + final_filing_ind + '\'' +
                ", short_plan_yr_ind='" + short_plan_yr_ind + '\'' +
                ", collective_bargain_ind='" + collective_bargain_ind + '\'' +
                ", f5558_application_filed_iND='" + f5558_application_filed_iND + '\'' +
                ", ext_automatic_ind='" + ext_automatic_ind + '\'' +
                ", dfvc_program_ind='" + dfvc_program_ind + '\'' +
                ", ext_special_ind='" + ext_special_ind + '\'' +
                ", ext_special_text='" + ext_special_text + '\'' +
                ", plan_name='" + plan_name + '\'' +
                ", spons_dfe_pn='" + spons_dfe_pn + '\'' +
                ", plan_eff_date='" + plan_eff_date + '\'' +
                ", sponsor_dfe_name='" + sponsor_dfe_name + '\'' +
                ", spons_dfe_dba_name='" + spons_dfe_dba_name + '\'' +
                ", spons_dfe_care_of_name='" + spons_dfe_care_of_name + '\'' +
                ", spons_dfe_mail_us_address1='" + spons_dfe_mail_us_address1 + '\'' +
                ", spons_dfe_mail_us_address2='" + spons_dfe_mail_us_address2 + '\'' +
                ", spons_dfe_mail_us_city='" + spons_dfe_mail_us_city + '\'' +
                ", spons_dfe_mail_us_state='" + spons_dfe_mail_us_state + '\'' +
                ", spons_dfe_mail_us_zip='" + spons_dfe_mail_us_zip + '\'' +
                ", spons_dfe_mail_foreign_addr1='" + spons_dfe_mail_foreign_addr1 + '\'' +
                ", spons_dfe_mail_foreign_addr2='" + spons_dfe_mail_foreign_addr2 + '\'' +
                ", spons_dfe_mail_foreign_city='" + spons_dfe_mail_foreign_city + '\'' +
                ", spons_dfe_mail_forgn_prov_st='" + spons_dfe_mail_forgn_prov_st + '\'' +
                ", spons_dfe_mail_foreign_cntry='" + spons_dfe_mail_foreign_cntry + '\'' +
                ", spons_dfe_mail_forgn_postal_cd='" + spons_dfe_mail_forgn_postal_cd + '\'' +
                ", spons_dfe_loc_us_address1='" + spons_dfe_loc_us_address1 + '\'' +
                ", spons_dfe_loc_us_address2='" + spons_dfe_loc_us_address2 + '\'' +
                ", spons_dfe_loc_us_city='" + spons_dfe_loc_us_city + '\'' +
                ", spons_dfe_loc_us_state='" + spons_dfe_loc_us_state + '\'' +
                ", spons_dfe_loc_us_zip='" + spons_dfe_loc_us_zip + '\'' +
                ", spons_dfe_loc_foreign_address1='" + spons_dfe_loc_foreign_address1 + '\'' +
                ", spons_dfe_loc_foreign_address2='" + spons_dfe_loc_foreign_address2 + '\'' +
                ", spons_dfe_loc_foreign_city='" + spons_dfe_loc_foreign_city + '\'' +
                ", spons_dfe_loc_forgn_prov_st='" + spons_dfe_loc_forgn_prov_st + '\'' +
                ", spons_dfe_loc_foreign_cntry='" + spons_dfe_loc_foreign_cntry + '\'' +
                ", spons_dfe_loc_forgn_postal_cd='" + spons_dfe_loc_forgn_postal_cd + '\'' +
                ", spons_dfe_ein='" + spons_dfe_ein + '\'' +
                ", spons_dfe_phone_num='" + spons_dfe_phone_num + '\'' +
                ", business_code='" + business_code + '\'' +
                ", admin_name='" + admin_name + '\'' +
                ", admin_care_of_name='" + admin_care_of_name + '\'' +
                ", admin_us_address1='" + admin_us_address1 + '\'' +
                ", admin_us_address2='" + admin_us_address2 + '\'' +
                ", admin_us_city='" + admin_us_city + '\'' +
                ", admin_us_state='" + admin_us_state + '\'' +
                ", admin_us_zip='" + admin_us_zip + '\'' +
                ", admin_foreign_address1='" + admin_foreign_address1 + '\'' +
                ", admin_foreign_address2='" + admin_foreign_address2 + '\'' +
                ", admin_foreign_city='" + admin_foreign_city + '\'' +
                ", admin_foreign_prov_state='" + admin_foreign_prov_state + '\'' +
                ", admin_foreign_cntry='" + admin_foreign_cntry + '\'' +
                ", admin_foreign_postal_cd='" + admin_foreign_postal_cd + '\'' +
                ", admin_ein='" + admin_ein + '\'' +
                ", admin_phone_num='" + admin_phone_num + '\'' +
                ", last_rpt_spons_name='" + last_rpt_spons_name + '\'' +
                ", last_rpt_spons_ein='" + last_rpt_spons_ein + '\'' +
                ", last_rpt_plan_num='" + last_rpt_plan_num + '\'' +
                ", admin_signed_date='" + admin_signed_date + '\'' +
                ", admin_signed_name='" + admin_signed_name + '\'' +
                ", spons_signed_date='" + spons_signed_date + '\'' +
                ", spons_signed_name='" + spons_signed_name + '\'' +
                ", dfe_signed_date='" + dfe_signed_date + '\'' +
                ", dfe_signed_name='" + dfe_signed_name + '\'' +
                ", tot_partcp_boy_cnt=" + tot_partcp_boy_cnt +
                ", tot_active_partcp_cnt=" + tot_active_partcp_cnt +
                ", rtd_sep_partcp_rcvg_cnt=" + rtd_sep_partcp_rcvg_cnt +
                ", rtd_sep_partcp_fut_cnt=" + rtd_sep_partcp_fut_cnt +
                ", subtl_act_rtd_sep_cnt=" + subtl_act_rtd_sep_cnt +
                ", benef_rcvg_bnft_cnt=" + benef_rcvg_bnft_cnt +
                ", tot_act_rtd_sep_benef_cnt=" + tot_act_rtd_sep_benef_cnt +
                ", partcp_account_bal_cnt=" + partcp_account_bal_cnt +
                ", sep_partcp_partl_vstd_cnt=" + sep_partcp_partl_vstd_cnt +
                ", contrib_emplrs_cnt=" + contrib_emplrs_cnt +
                ", type_pension_bnft_code='" + type_pension_bnft_code + '\'' +
                ", type_welfare_bnft_code='" + type_welfare_bnft_code + '\'' +
                ", funding_insurance_ind='" + funding_insurance_ind + '\'' +
                ", funding_sec412_ind='" + funding_sec412_ind + '\'' +
                ", funding_trust_ind='" + funding_trust_ind + '\'' +
                ", funding_gen_asset_ind='" + funding_gen_asset_ind + '\'' +
                ", benefit_insurance_ind='" + benefit_insurance_ind + '\'' +
                ", benefit_sec412_ind='" + benefit_sec412_ind + '\'' +
                ", benefit_trust_ind='" + benefit_trust_ind + '\'' +
                ", benefit_gen_asset_ind='" + benefit_gen_asset_ind + '\'' +
                ", sch_r_attached_ind='" + sch_r_attached_ind + '\'' +
                ", sch_mb_attached_ind='" + sch_mb_attached_ind + '\'' +
                ", sch_sb_attached_ind='" + sch_sb_attached_ind + '\'' +
                ", sch_h_attached_ind='" + sch_h_attached_ind + '\'' +
                ", sch_i_attached_ind='" + sch_i_attached_ind + '\'' +
                ", sch_a_attached_ind='" + sch_a_attached_ind + '\'' +
                ", num_sch_a_attached_cnt='" + num_sch_a_attached_cnt + '\'' +
                ", sch_c_attached_ind='" + sch_c_attached_ind + '\'' +
                ", sch_d_attached_ind='" + sch_d_attached_ind + '\'' +
                ", sch_g_attached_ind='" + sch_g_attached_ind + '\'' +
                ", filing_status='" + filing_status + '\'' +
                ", date_received='" + date_received + '\'' +
                ", valid_admin_signature='" + valid_admin_signature + '\'' +
                ", valid_dfe_signature='" + valid_dfe_signature + '\'' +
                ", valid_sponsor_signature='" + valid_sponsor_signature + '\'' +
                ", admin_phone_num_foreign='" + admin_phone_num_foreign + '\'' +
                ", spons_dfe_phone_num_foreign='" + spons_dfe_phone_num_foreign + '\'' +
                ", admin_name_same_spon_ind='" + admin_name_same_spon_ind + '\'' +
                ", admin_address_same_spon_ind='" + admin_address_same_spon_ind + '\'' +
                ", preparer_name='" + preparer_name + '\'' +
                ", preparer_firm_name='" + preparer_firm_name + '\'' +
                ", preparer_us_address1='" + preparer_us_address1 + '\'' +
                ", preparer_us_address2='" + preparer_us_address2 + '\'' +
                ", preparer_us_city='" + preparer_us_city + '\'' +
                ", preparer_us_state='" + preparer_us_state + '\'' +
                ", preparer_us_zip='" + preparer_us_zip + '\'' +
                ", preparer_foreign_address1='" + preparer_foreign_address1 + '\'' +
                ", preparer_foreign_address2='" + preparer_foreign_address2 + '\'' +
                ", preparer_foreign_city='" + preparer_foreign_city + '\'' +
                ", preparer_foreign_prov_state='" + preparer_foreign_prov_state + '\'' +
                ", preparer_foreign_cntry='" + preparer_foreign_cntry + '\'' +
                ", preparer_foreign_postal_cd='" + preparer_foreign_postal_cd + '\'' +
                ", preparer_phone_num='" + preparer_phone_num + '\'' +
                ", preparer_phone_num_foreign='" + preparer_phone_num_foreign + '\'' +
                ", tot_act_partcp_boy_cnt='" + tot_act_partcp_boy_cnt + '\'' +
                ", subj_m1_filing_req_ind='" + subj_m1_filing_req_ind + '\'' +
                ", compliance_m1_filing_req_ind='" + compliance_m1_filing_req_ind + '\'' +
                ", m1_receipt_confirmation_code='" + m1_receipt_confirmation_code + '\'' +
                ", admin_manual_signed_date='" + admin_manual_signed_date + '\'' +
                ", admin_manual_signed_name='" + admin_manual_signed_name + '\'' +
                ", last_rpt_plan_name='" + last_rpt_plan_name + '\'' +
                ", spons_manual_signed_date='" + spons_manual_signed_date + '\'' +
                ", spons_manual_signed_name='" + spons_manual_signed_name + '\'' +
                ", dfe_manual_signed_date='" + dfe_manual_signed_date + '\'' +
                ", dfe_manual_signed_name='" + dfe_manual_signed_name + '\'' +
                '}';
    }
}

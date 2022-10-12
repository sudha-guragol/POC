package com.aexp.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.aexp.model.Global_pricing_Plan_Details;
import com.aexp.model.ResponseBinding;

public interface MerchantRepository extends JpaRepository<Global_pricing_Plan_Details, Serializable> {
	
public final static String merchant_pricing_detail = "select  A.pricing_structure_creation_timestamp,A.pricing_plan_type_code,\r\n" + 
		"B.flat_fee_amount,B.flat_fee_application_code,B.flat_fee_frequencty_code,\r\n" + 
		"B.flat_fee_adjustment_reason_code,B.flat_fee_FET_code,B.flat_fee_delay_count,B.threshold_evaluation_type,B.threshold_evaluation_period,B.threshold_evaluation_amount,\r\n" + 
		"\r\n" + 
		"B.tierNumber,B.pricing_plan_reset_indicator,B.fixed_date_indicator,B.toc_indicator,\r\n" + 
		"B.fee_ATRT_linkage_indicator,B.resetDate,B.periodic_reset_indicator,\r\n" + 
		"B.reset_periodic_month_count,B.reset_limit_count \r\n" + 
		"from smpsdb.GLOBAL_PRICING_PLA A,smpsdb.GLB_PRC_PLN_DTL B\r\n" + 
		"where A.smps_Pricing_Id=B.smps_Pricing_Id;";
	
		@Query(merchant_pricing_detail)
	public ResponseBinding getMerchantPricingDetail();
	
}

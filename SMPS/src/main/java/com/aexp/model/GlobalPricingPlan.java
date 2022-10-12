package com.aexp.model;

import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import lombok.Data;

@Table(name="GLOBAL_PRICING_PLA")
@Data
public class GlobalPricingPlan {
	@Id
	private String smps_Pricing_Id;
	private String business_center_code;
	private String country_code;
	private String SE_industry_Acc_type_code;
	private String SE_major_industry_code;
	private String SE_industry_subordinate_major_code;
	private String SE_industry_detail_code;
	private String SE_industry_code;
	private String pricing_plan_currency_code;
	private String pricing_plan_type_code;
	
	@Column(name="pricing_structure_creation_timestamp",updatable=false)
	@CreationTimestamp
	private LocalDateTime pricing_structure_creation_timestamp;
	
	
	private LocalDate Effective_date;
	private LocalDate endDate;
	private Integer no_of_SE_attached;
	
	@Column(name="last_update_timestamp",insertable=false)
	@UpdateTimestamp
	private LocalDateTime last_update_timestamp;
	
	private Integer last_update_identifier;
	
	
	

}

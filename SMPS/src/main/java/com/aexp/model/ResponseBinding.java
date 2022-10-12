package com.aexp.model;

import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.persistence.Column;

import org.hibernate.annotations.CreationTimestamp;

public class ResponseBinding {
	

//	@Column(name="pricing_structure_creation_timestamp",updatable=false)
	//@CreationTimestamp
	private LocalDateTime pricing_structure_creation_timestamp;
	private String pricing_plan_type_code;
	private Double flat_fee_amount;
	private String flat_fee_application_code;
	private String flat_fee_frequencty_code;
	private String flat_fee_adjustment_reason_code;
	private String flat_fee_FET_code;
	private Integer flat_fee_delay_day_count;
	private String threshold_evaulation_type;
	private String threshold_evaulation_period;
	private String threshold_evaluation_amount;
	
	private String tierNumber;
	private Integer pricing_plan_reset_indicator;
	private String fixed_date_indicator;
	private Integer toc_indicator;
	private Integer fee_ATRT_linkage_indicator;
	private LocalDate resetDate;
	private Integer periodic_reset_indicator;
	private Integer reset_periodic_month_count;
	private Integer reset_limit_count;
	
}

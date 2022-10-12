package com.aexp.model;

import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.UpdateTimestamp;

import lombok.Data;

@Table(name="GLB_PRC_PLN_DTL")
@Data
@Entity
public class Global_pricing_Plan_Details {
	
	@Id
	private String smps_Pricing_Id;
	
	private String tierNumber;
	private Integer pricing_plan_reset_indicator;
	private String fixed_date_indicator;
	private LocalDate resetDate;
	private Integer toc_indicator;
	private Integer fee_ATRT_linkage_indicator;
	private Integer periodic_reset_indicator;
	private Integer reset_periodic_month_count;
	private Integer reset_limit_count;
	private Double flat_fee_amount;
	private String flat_fee_application_code;
	private String flat_fee_frequencty_code;
	private String flat_fee_FET_code;
	private String flat_fee_adjustment_reason_code;
	private Integer flat_fee_delay_day_count;
	private String threshold_evaulation_type;
	private String threshold_evaulation_period;
	private String threshold_evaluation_amount;
	@Column(name="last_update_timestamp",insertable=false)
	@UpdateTimestamp
	private LocalDateTime last_update_timestamp;
	private String last_update_identifier;
	
	
	
	
	

}

package com.aexp.model;

import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import lombok.Data;

@Table(name="GLB_PRC_PLN_DTL")
@Data
public class SE_Global_Pricing {
	@Id
	private String SE_number;
	
	private String smps_id;
	
	
	@Column(name="creation_timestamp",updatable=false)
	@CreationTimestamp
	private LocalDateTime creation_timestamp;
	private String pricing_plan_type_code;
	private LocalDate effective_date;
	private LocalDate endDate;
	private String business_center_code;
	private String submission_currenct_code;
	private Double flat_fee_amount;
	private String flat_fee_application_code;
	private String flat_fee_frequency_code;
	private String flat_fee_adjustment_reason;
	private String flat_fee_FET_code;
	private Integer flat_fee_delay_days;
	private String threshold_evaluation_type;
	private Integer threshold_evaluation_period;
	private Double threshold_evaluation_amount;
	
	@Column(name="last_update_timestamp",insertable=false)
	@UpdateTimestamp
	private LocalDateTime last_update_timestamp;
	
	private String last_Update_Identifier;
	
	

}

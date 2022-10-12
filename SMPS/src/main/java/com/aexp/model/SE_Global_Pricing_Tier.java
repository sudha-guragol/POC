package com.aexp.model;

import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.UpdateTimestamp;

import lombok.Data;

@Table(name="SE_GLOBAL_PRC_TIER")
@Data
public class SE_Global_Pricing_Tier {
@Id
	private String SE_number;

    private String smps_id;
    private String pricing_plan_type_code;
    private String tier_number;
    private Integer pricing_plan_reset_indicator;
    private Integer  fixed_date_indicator;
    private Integer toc_indicator;
    private Integer fee_linkage_indicator;
    private LocalDate reset_date;
    private Integer reset_frequency_number;
    private Integer reset_count;
    private LocalDate reset_cancellation_date;
    private LocalDate pp_change_effective_date;
    private LocalDate pp_change_end_date;
    private Integer periodic_reset_indicator;
    private Integer reset_month_count;
    private Integer reset_limit_count;
    @Column(name="last_update_timestamp",insertable=false)
    @UpdateTimestamp
    private LocalDateTime last_update_timestamp;
    private Integer last_update_identifier;
    
    
    
    
    
    

}

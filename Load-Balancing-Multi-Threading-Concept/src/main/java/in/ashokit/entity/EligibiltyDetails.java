package in.ashokit.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "ELIGIBILITY_DETAILS")

public class EligibiltyDetails {
	
	@Id
	@GeneratedValue
	@Column(name = "ED_TRACE_ID")
	private Integer ed_trace_id;

	@Column(name = "BENIFIT_AMT")
	private String benefit_amt;

	@Column(name = "CASE_NUM")
	private Integer case_num;

	@Column(name = "CREATE_DT")
	private LocalDate create_dt;

	@Column(name = "DENIEL_REASON")
	private String denial_reason;

	@Column(name = "PLAN_END_DT")
	private String plan_end_dt;

	@Column(name = "PLAN_NAME")
	private String plan_name;

	@Column(name = "PLAN_STRAT_DT")
	private String plan_start_dt;

	@Column(name = "PLAN_STATUS")
	private String plan_status;

	@Column(name = "UPDATE_DT")
	private LocalDate update_dt;

}

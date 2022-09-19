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
@Table(name="CO_TRIGGERS")
public class CoTriggers {

	@Id
	@GeneratedValue
	@Column(name="TRG_ID")
	private Integer trg_id ;
	
	@Column(name="CASE_NUM")
	private Integer	case_num;
	
	@Column(name="CREATE_DT")
	private  LocalDate create_dt;
	
	@Column(name="TRG_STATUS")
	private String trg_status;
	
	@Column(name="UPDATE_DT")
	private LocalDate update_dt ;


}

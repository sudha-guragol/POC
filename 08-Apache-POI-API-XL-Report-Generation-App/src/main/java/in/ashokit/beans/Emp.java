package in.ashokit.beans;

import lombok.Data;

@Data
public class Emp {
	private String empId;
	private String empName;
	private String empSalary;
	
	Emp()
	{
		
	}

	public Emp(String empId, String empName, String empSalary) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empSalary = empSalary;
	}
	
	

}

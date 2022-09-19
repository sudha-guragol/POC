package in.ashokit.beans;

import lombok.Data;

@Data
public class Course {

	
	private String CourseName;
	private String Timings;
	
	
	 public Course()
	  {
		  
	  }


	public Course(String courseName, String timings) {
		super();
		CourseName = courseName;
		Timings = timings;
	}
	 
	 
}

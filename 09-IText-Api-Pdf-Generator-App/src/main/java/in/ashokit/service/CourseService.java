package in.ashokit.service;

import java.util.ArrayList;
import java.util.List;

import in.ashokit.beans.Course;

public class CourseService {

	
	public List<Course> getCourses()
	{
		
		//if v want to access from db write dao.findAll() method instead of below lines
		Course c1=new Course("10 SBMS","6.30 AM IST");
		Course c2=new Course("09 SBMS","7.45 AM IST");
		Course c3=new Course("15 SBMS","10.15 AM IST");
		Course c4=new Course("16 SBMS","11.45 AM IST");
		
		
		List<Course> courses=new ArrayList<>();
		courses.add(c1);
		courses.add(c2);
		courses.add(c3);
		courses.add(c4);
		
		return courses;
		
	}
}

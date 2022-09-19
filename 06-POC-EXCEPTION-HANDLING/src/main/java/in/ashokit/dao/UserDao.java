package in.ashokit.dao;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

import in.ashokit.exception.NoDataFoundException;

@Repository //(acts as a DAO class)
public class UserDao {

	//in memory database (which is avilable within our Application)
	private Map<Integer,String> userData=new HashMap<>();
	
	public UserDao() {
		userData.put(101,"Raju");
		userData.put(102,"Ram");
		}
	public String findNameById(Integer userId) throws Exception
	{
		
		if(userData.containsKey(userId))
		{
		String name = userData.get(userId);	
		return name;
	}
		else
		{
		
			throw new NoDataFoundException("Invalid User Id");
		
	}
	}
	
}

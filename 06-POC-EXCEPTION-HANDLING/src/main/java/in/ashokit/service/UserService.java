package in.ashokit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ashokit.dao.UserDao;

@Service
public class UserService {
	
@Autowired
	private UserDao userDao;

public UserService() {
}

public String getUserName(Integer userId) throws Exception {
	String name = userDao.findNameById(userId);
	return name;

	

}
	
}

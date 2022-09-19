package in.ashokit.rest;

import javax.net.ssl.SSLEngineResult.Status;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import in.ashokit.service.UserService;
@RestController
public class UserRestController {
	@Autowired
	private UserService userService;
	
	@GetMapping(value="/user/{userId}",produces= {"text/plain","application/json"})
	public ResponseEntity<String> getName(@PathVariable Integer userId) throws Exception
	{
	String userName = userService.getUserName(userId);
	
	return new ResponseEntity<>(userName, HttpStatus.OK);
	}
	

}

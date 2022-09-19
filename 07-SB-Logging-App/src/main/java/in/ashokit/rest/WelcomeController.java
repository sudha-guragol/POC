package in.ashokit.rest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(WelcomeController.class);

 
	@GetMapping("/welcome")
	public String WelcomeMsg()
	{
		logger.debug("WelcomeMsg() Execution started");
		
		try
		{
			int i=10/0;
		}
		
		catch(Exception e)
		{logger.error("Exceptopon Occured "+e.getMessage());
		}
		String msg="Welcome to Ashok IT";
		logger.debug("WelcomeMsg() Execution Ended");
		logger.info("WelcomeMsg() Execution Completed Successfully");
		return msg;
	}
}

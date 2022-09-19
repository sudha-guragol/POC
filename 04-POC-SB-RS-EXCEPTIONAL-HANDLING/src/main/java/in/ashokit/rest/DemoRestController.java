package in.ashokit.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoRestController {
	@GetMapping("/demo")
	public String Demo()
	{
		String msg=null;
	
try
{
	int i=10/0;
	 msg="Welcome to Ashok IT";
}
catch(Exception e)
{
	throw new ArithmeticException("Number Should not be divide by zero");
}
		
		return msg;
	}
	
	@GetMapping("/demo1")
	
	public String Demo1()
	{
		String s=null;
		s.length();
		return s;
	}
	
	@ExceptionHandler(value=ArithmeticException.class)
	public ResponseEntity<String> handleArithmeticException(ArithmeticException ae)
	{
		return new ResponseEntity<>(ae.getMessage(),HttpStatus.INTERNAL_SERVER_ERROR);
	}
	

}

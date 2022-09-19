package in.ashokit.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoRestController {
	@GetMapping("/demo")
	public String demo() {
		String msg=null;
		int i=10/0;
		
		msg="Welcome";
		return msg;
	}

}

package in.ashokit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class ContactController {

	@RequestMapping("/welcome")
	public String welcome(Model model)
	{
		model.addAttribute("msg", "Welcome to ashokit Training Institute");
		System.out.println("hiiiiiii");
		return "index";
	}
}

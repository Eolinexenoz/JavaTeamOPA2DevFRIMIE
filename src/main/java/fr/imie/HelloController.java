package fr.imie;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {

	@RequestMapping("hello/{username}")
	public String hello(@PathVariable("username") String username, Model m) {
		m.addAttribute("username", username);
		return "hello";
	}

}

package com.convochat.resources;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {

	@GetMapping(value = "/index")
	public ModelAndView getIndex() {

		ModelAndView mv = new ModelAndView();

		String name = "Chan";
		mv.addObject("NAME", name);
		mv.setViewName("/index");

		return mv;
	}

	@GetMapping(value = "/public")
	public String getPublic() {
		return "/public";
	}

	@GetMapping(value = "/user")
	public ModelAndView getUser() {
		ModelAndView mv = new ModelAndView();
		String user = "Christian";

		mv.addObject("USER", user);
		mv.setViewName("/user");

		return mv;
	}

	@GetMapping(value = "/admin")
	public String getAdmin() {
		return "/admin";
	}

}

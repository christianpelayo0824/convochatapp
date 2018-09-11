package com.convochat.resources;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

	@GetMapping(value = "/index")
	public String getIndex() {
		return "/index";
	}

	@GetMapping(value = "/public")
	public String getPublic() {
		return "/public";
	}
	
	@GetMapping(value = "/user")
	public String getUser() {
		return "/user";
	}
	
	@GetMapping(value = "/admin") 
	public String getAdmin() {
		return "/admin";
	}
	
}

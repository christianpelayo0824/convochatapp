package com.convochat.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.convochat.model.User;
import com.convochat.services.UserServices;

@RestController
@RequestMapping(value = "/user")
public class UserController {

	@Autowired
	private UserServices userServices;

	@GetMapping(value = "/getAllUser")
	public List<User> getAllUser() {
		return userServices.getAllUser();
	}

}

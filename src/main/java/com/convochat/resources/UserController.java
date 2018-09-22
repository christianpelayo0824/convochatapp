package com.convochat.resources;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
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

	@GetMapping(value = "/getUserById/{uid}")
	public Optional<User> getUserById(@PathVariable("uid") final int uid) {
		return userServices.getUserById(uid);
	}

	@PostMapping(value = "/createUser", consumes = MediaType.APPLICATION_JSON_VALUE)
	public void createUser(@RequestBody User user) {
		userServices.createUser(user);
	}

	@DeleteMapping(value = "/deleteUserById/{uid}")
	public boolean deleteUserById(@PathVariable("uid") final int uid) {
		userServices.deleteUserById(uid);
		return true;
	}

	@PutMapping(value = "/getText")
	public String getText() {
		return "Hello";
	}
}

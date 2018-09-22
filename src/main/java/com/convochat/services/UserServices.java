package com.convochat.services;

import java.util.List;
import java.util.Optional;

import com.convochat.model.User;

public interface UserServices {

	public List<User> getAllUser();

	public Optional<User> getUserById(int uid);

	public void deleteUserById(int uid);

	public void createUser(User user);
}

package com.convochat.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.convochat.model.User;
import com.convochat.repository.UserRepository;

@Service
public class UserServicesImpl implements UserServices {

	@Autowired
	private UserRepository userRepo;

	@Override
	public List<User> getAllUser() {
		return userRepo.findAll();
	}

	@Override
	public Optional<User> getUserById(int uid) {
		return userRepo.findById(uid);
	}

	@Override
	public void deleteUserById(int uid) {
		userRepo.deleteById(uid);
	}

	@Override
	public void createUser(User user) {
		userRepo.save(user);
	}

}

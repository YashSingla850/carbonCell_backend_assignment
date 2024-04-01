package com.backendAssignment.service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;

import com.backendAssignment.model.User;

@Service
public class UserService {

	private List<User> userList = new ArrayList<>();

	public UserService() {
		userList.add(new User(UUID.randomUUID().toString(), "yash", "yash@gmail.com"));
		userList.add(new User(UUID.randomUUID().toString(), "ritik", "ritik@gmail.com"));
		userList.add(new User(UUID.randomUUID().toString(), "sumit", "sumit@gmail.com"));

	}

	public List<User> getAllUser() {
		return this.userList;
	}
}

package com.backendAssignment.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.backendAssignment.model.User;
import com.backendAssignment.service.UserService;

import io.swagger.v3.oas.annotations.security.SecurityRequirement;

@RestController
@SecurityRequirement(name = "authBearer")
@RequestMapping("/home")
public class HomeController {

	@Autowired
	UserService service;

	@GetMapping("/users")
	public ResponseEntity<List<User>> getUser() {
		return ResponseEntity.ok(service.getAllUser());
	}

}

package com.backendAssignment.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.backendAssignment.service.ApiService;
import com.fasterxml.jackson.core.JsonProcessingException;

import io.swagger.v3.oas.annotations.security.SecurityRequirement;

@RestController
@RequestMapping("/api")
@SecurityRequirement(name ="authBearer")
public class ApiController {
	@Autowired
	ApiService service;

	@GetMapping("/entries")
	public ResponseEntity<?> getEntries(@RequestParam(value = "category", required = false) String category,
			@RequestParam(value = "limit", required = false, defaultValue = "5") Long limit)
			throws JsonProcessingException {

		return ResponseEntity.ok(service.getAllEntries(category, limit));

	}

}

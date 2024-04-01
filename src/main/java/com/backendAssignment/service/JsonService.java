package com.backendAssignment.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.backendAssignment.model.Entries;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

@Service
public class JsonService {

	private final ObjectMapper objectMapper;

	public JsonService(ObjectMapper objectMapper) {
		this.objectMapper = objectMapper;
	}

	public List<Entries> parseJsonStringToList(String jsonString) throws JsonProcessingException {
		return objectMapper.readValue(jsonString, new TypeReference<List<Entries>>() {
		});
	}
}

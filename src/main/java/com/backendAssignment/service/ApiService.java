package com.backendAssignment.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.core.JsonProcessingException;

@Service
public class ApiService {
	@Autowired
	private RestTemplate restTemplate;
	@Autowired
	JsonService jsonservice;
	private Logger logger = LoggerFactory.getLogger(ApiService.class);
	private final String API_URL = "https://api.publicapis.org/entries";

	public String getAllEntries(String category, Long limit) throws JsonProcessingException {

		String url = API_URL ;
		if (category != null) {
			url += "?category=" + category;
		}
		logger.info(url);
		String response = restTemplate.getForObject(url, String.class);
		return response;
//		List<Entries> responseList = jsonservice.parseJsonStringToList(response);
//		return responseList;

	}

}

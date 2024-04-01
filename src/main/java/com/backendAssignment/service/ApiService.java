package com.backendAssignment.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import com.backendAssignment.model.Entries;
import com.fasterxml.jackson.core.JsonProcessingException;

@Service
public class ApiService {
	@Autowired
	private RestTemplate restTemplate;
	@Autowired
	JsonService jsonservice;
	private Logger logger = LoggerFactory.getLogger(ApiService.class);
	private final String API_URL = "https://api.publicapis.org/entries";

	public List<Entries> getAllEntries(String category, Long limit) throws JsonProcessingException {

		String url = API_URL;
		if (category != null) {
			url += "?category=" + category;
		}
		logger.info(url);
		String response = restTemplate.getForObject(url, String.class);
		List<Entries> responseList = new ArrayList<>();
		try {
			JSONObject jsonObject = new JSONObject(response);
			int count = jsonObject.getInt("count");
			JSONArray entries = jsonObject.getJSONArray("entries");

			System.out.println("Count: " + count);
			System.out.println("Entries:");

			for (int i = 0; i < entries.length(); i++) {
				if (i + 1 <= limit) {
					JSONObject entry = entries.getJSONObject(i);
					Entries val = new Entries(entry);
					responseList.add(val);
				} else {
					break;
				}

			}
		} catch (JSONException e) {
			e.printStackTrace();
		}
		return responseList;
	}

}

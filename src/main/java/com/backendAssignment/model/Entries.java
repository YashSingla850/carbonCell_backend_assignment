package com.backendAssignment.model;

import org.json.JSONException;
import org.json.JSONObject;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Entries {

	private String API;
	private String Description;
	private String Auth;
	private Boolean HTTPS;
	private String Cors;
	private String Link;
	private String Category;

	public Entries(JSONObject jsonObject) throws JSONException {
		this.API = jsonObject.getString("API");
		this.Description = jsonObject.getString("Description");
		this.Auth = jsonObject.getString("Auth");
		this.HTTPS = jsonObject.getBoolean("HTTPS");
		this.Cors = jsonObject.getString("Cors");
		this.Link = jsonObject.getString("Link");
		this.Category = jsonObject.getString("Category");
	}

}

//
//{
//    "API": "AdoptAPet",
//    "Description": "Resource to help get pets adopted",
//    "Auth": "apiKey",
//    "HTTPS": true,
//    "Cors": "yes",
//    "Link": "https://www.adoptapet.com/public/apis/pet_list.html",
//    "Category": "Animals"
//  },
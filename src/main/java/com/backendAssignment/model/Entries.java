package com.backendAssignment.model;

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
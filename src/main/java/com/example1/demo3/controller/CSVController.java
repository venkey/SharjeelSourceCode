package com.example1.demo3.controller;

import java.io.IOException;

import org.json.JSONException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example1.demo3.services.DemoDaoService;

@RestController
public class CSVController {

	@Autowired
	DemoDaoService demoDaoServices;
	

	@GetMapping("/jsonObj")
	public String testJson(@RequestBody String jsonObj) throws JSONException, IOException {

		return demoDaoServices.jsonObjTocsv(jsonObj);
	}

	@GetMapping("/jsonUrl")
	public String jsonTocv(@RequestParam String jsonUrl) throws JSONException, IOException {
		return demoDaoServices.jsonUrlTocsv(jsonUrl);
	}

	
}

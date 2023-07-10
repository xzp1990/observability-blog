package com.example.restservice;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


@RestController
public class PersonController {
	
	private static final Logger logger = LogManager.getLogger(PersonController.class);
	private static final List<String> personlist= Arrays.asList("jason", "tracy", "olivia", "henry");

	@GetMapping("/person")
	public String getFullName(@RequestParam(value = "name", defaultValue = "anonymous") String name) {
		
		logger.info(String.format("Verifing whether[ %s ] is a member", name));
		
		if (personlist.contains(name)){
			return "true";
		}else{
			return "false";
		} 
	}
}
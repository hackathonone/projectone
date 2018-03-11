package com.hackathanone.devops.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

public class HackathanController {

	@RequestMapping(value = "/fetch/{id}", method = RequestMethod.GET)
	  public String getDynamicUriValue(@PathVariable String id){
	    System.out.println("ID is "+id);
	    return "Dynamic URI parameter fetched"; 
	  } 
}

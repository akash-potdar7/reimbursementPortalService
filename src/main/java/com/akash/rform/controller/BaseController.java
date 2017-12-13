package com.akash.rform.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.akash.rform.repository.EmployeeDetailRepo;

@RestController
@RequestMapping("/api")
public class BaseController {

	@Autowired
	EmployeeDetailRepo empDetailRepo;
	
	public BaseController() {
	}

	@RequestMapping(value = "/test", method = RequestMethod.GET)
	public String test() {
		System.out.println(empDetailRepo.findOne((long)10005));
		return "Success";
	}
	
}
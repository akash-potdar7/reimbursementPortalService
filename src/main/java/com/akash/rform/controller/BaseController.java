package com.akash.rform.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.akash.rform.entity.EmployeeDetail;
import com.akash.rform.entity.ProjectDetail;
import com.akash.rform.entity.RType;
import com.akash.rform.repository.EmployeeDetailRepo;
import com.akash.rform.repository.ProjectDetailRepo;
import com.akash.rform.repository.RTypeRepo;

@RestController
@RequestMapping("/api")
public class BaseController {

	@Autowired
	EmployeeDetailRepo empDetailRepo;

	@Autowired
	RTypeRepo rTypeRepo;

	@Autowired
	ProjectDetailRepo projectDetailRepo;

	public BaseController() {
	}

	@RequestMapping(value = "/getEmployeeById", method = RequestMethod.GET)
	public EmployeeDetail test(@RequestParam Long id) {
		return empDetailRepo.findOne(id);
	}

	@RequestMapping(value = "/getRTypes", method = RequestMethod.GET)
	public List<RType> getRTypes() {
		List<RType> l = (List<RType>) rTypeRepo.findAll();
		return l;
	}

	@RequestMapping(value = "/getProjects", method = RequestMethod.GET)
	public List<ProjectDetail> getProjects() {
		List<ProjectDetail> l = (List<ProjectDetail>) projectDetailRepo.findAll();
		return l;
	}

}
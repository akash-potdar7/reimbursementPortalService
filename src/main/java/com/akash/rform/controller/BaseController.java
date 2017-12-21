package com.akash.rform.controller;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.akash.rform.entity.EmployeeDetail;
import com.akash.rform.entity.ProjectDetail;
import com.akash.rform.entity.RType;
import com.akash.rform.entity.ReimbursementDetails;
import com.akash.rform.repository.EmployeeDetailRepo;
import com.akash.rform.repository.ProjectDetailRepo;
import com.akash.rform.repository.RTypeRepo;
import com.akash.rform.repository.ReimbursementDetailsRepo;
import com.akash.rform.view.Employee;
import com.akash.rform.view.Reimbursement;

@RestController
@RequestMapping("/api")
public class BaseController {

	@Autowired
	EmployeeDetailRepo empDetailRepo;

	@Autowired
	RTypeRepo rTypeRepo;

	@Autowired
	ProjectDetailRepo projectDetailRepo;

	@Autowired
	ReimbursementDetailsRepo reimbursementDetailsRepo;

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

	@RequestMapping(value = "/saveReimbursements", method = RequestMethod.POST)
	public EmployeeDetail saveReimbursements(@RequestBody Employee emp) {

		EmployeeDetail employeeDetailEntity = new EmployeeDetail();

		employeeDetailEntity.setActiveInd(emp.getActiveInd());
		employeeDetailEntity.setDateOfEmployement(emp.getDateOfEmployement());
		employeeDetailEntity.setDesignation(emp.getDesignation());
		employeeDetailEntity.setEmpName(emp.getEmpName());
		employeeDetailEntity.setEmpNo(emp.getEmpNo());

		Set<ReimbursementDetails> reimbursementSet = new HashSet<>();
		for (Reimbursement reimbursement : emp.getReimbursements()) {
			ReimbursementDetails reimbursementDetailsEntity = new ReimbursementDetails();
			ProjectDetail projectDetailEntity = new ProjectDetail();
			RType rTypeEntity = new RType();

			reimbursementDetailsEntity.setAmount(reimbursement.getAmount());
			reimbursementDetailsEntity.setBillDate(reimbursement.getBillDate());
			reimbursementDetailsEntity.setBillNumber(reimbursement.getBillNumber());
			reimbursementDetailsEntity.setId(reimbursement.getId());
			reimbursementDetailsEntity.setNoOfPersons(reimbursement.getNoOfPersons());

			projectDetailEntity.setProjectId(reimbursement.getProjectDetail().getProjectId());
			projectDetailEntity.setProjectName(reimbursement.getProjectDetail().getProjectName());
			projectDetailEntity.setProjectType(reimbursement.getProjectDetail().getProjectType());
			projectDetailEntity.setActiveInd(reimbursement.getProjectDetail().getActiveInd());

			rTypeEntity.setTypeId(reimbursement.getrType().getTypeId());
			rTypeEntity.setTypeName(reimbursement.getrType().getTypeName());
			rTypeEntity.setPriceLimit(reimbursement.getrType().getPriceLimit());
			rTypeEntity.setActiveInd(reimbursement.getrType().getActiveInd());

			reimbursementDetailsEntity.setProjectDetail(projectDetailEntity);
			reimbursementDetailsEntity.setrType(rTypeEntity);
			reimbursementSet.add(reimbursementDetailsEntity);
			reimbursementDetailsRepo.save(reimbursementDetailsEntity);
		}
		employeeDetailEntity.setReimbursements(reimbursementSet);

		return empDetailRepo.save(employeeDetailEntity);
	}

}
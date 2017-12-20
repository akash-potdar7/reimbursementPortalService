package com.akash.rform.view;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Employee {

	private Long empNo;
	private String empName;
	private String designation;
	private Date dateOfEmployement;
	private char activeInd;
	private List<Reimbursement> reimbursements = new ArrayList<Reimbursement>();

	public Employee() {
	}

	public Employee(Long empNo, String empName, String designation, Date dateOfEmployement, char activeInd,
			List<Reimbursement> reimbursements) {
		super();
		this.empNo = empNo;
		this.empName = empName;
		this.designation = designation;
		this.dateOfEmployement = dateOfEmployement;
		this.activeInd = activeInd;
		this.reimbursements = reimbursements;
	}

	public Long getEmpNo() {
		return empNo;
	}

	public void setEmpNo(Long empNo) {
		this.empNo = empNo;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public Date getDateOfEmployement() {
		return dateOfEmployement;
	}

	public void setDateOfEmployement(Date dateOfEmployement) {
		this.dateOfEmployement = dateOfEmployement;
	}

	public char getActiveInd() {
		return activeInd;
	}

	public void setActiveInd(char activeInd) {
		this.activeInd = activeInd;
	}

	public List<Reimbursement> getReimbursements() {
		return reimbursements;
	}

	public void setReimbursements(List<Reimbursement> reimbursements) {
		this.reimbursements = reimbursements;
	}

	@Override
	public String toString() {
		return "Employee [empNo=" + empNo + ", empName=" + empName + ", designation=" + designation
				+ ", dateOfEmployement=" + dateOfEmployement + ", activeInd=" + activeInd + ", reimbursements="
				+ reimbursements + "]";
	}

}

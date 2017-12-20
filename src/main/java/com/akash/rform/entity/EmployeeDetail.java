package com.akash.rform.entity;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "EMPLOYEE_DETAIL")
public class EmployeeDetail {

	@Id
	@Column(name = "EMPNO")
	private Long empNo;

	@Column(name = "EMP_NAME")
	private String empName;

	@Column(name = "DESIGNATION")
	private String designation;

	@Column(name = "DATE_OF_EMPLOYEMENT")
	private Date dateOfEmployement;

	@Column(name = "ACTIVE_IND")
	private char activeInd;

	@OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinColumn(name = "Emp_id")
	private Set<ReimbursementDetails> reimbursements = new HashSet<>();

	public EmployeeDetail() {
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

	public Set<ReimbursementDetails> getReimbursements() {
		return reimbursements;
	}

	public void setReimbursements(Set<ReimbursementDetails> reimbursements) {
		this.reimbursements = reimbursements;
	}

	public EmployeeDetail(Long empNo, String empName, String designation, Date dateOfEmployement, char activeInd,
			Set<ReimbursementDetails> reimbursements) {
		super();
		this.empNo = empNo;
		this.empName = empName;
		this.designation = designation;
		this.dateOfEmployement = dateOfEmployement;
		this.activeInd = activeInd;
		this.reimbursements = reimbursements;
	}

}

package com.akash.rform.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
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

	public EmployeeDetail(Long empNo, String empName, String designation, Date dateOfEmployement, char activeInd) {
		super();
		this.empNo = empNo;
		this.empName = empName;
		this.designation = designation;
		this.dateOfEmployement = dateOfEmployement;
		this.activeInd = activeInd;
	}
	
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + activeInd;
		result = prime * result + ((dateOfEmployement == null) ? 0 : dateOfEmployement.hashCode());
		result = prime * result + ((designation == null) ? 0 : designation.hashCode());
		result = prime * result + ((empName == null) ? 0 : empName.hashCode());
		result = prime * result + ((empNo == null) ? 0 : empNo.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EmployeeDetail other = (EmployeeDetail) obj;
		if (activeInd != other.activeInd)
			return false;
		if (dateOfEmployement == null) {
			if (other.dateOfEmployement != null)
				return false;
		} else if (!dateOfEmployement.equals(other.dateOfEmployement))
			return false;
		if (designation == null) {
			if (other.designation != null)
				return false;
		} else if (!designation.equals(other.designation))
			return false;
		if (empName == null) {
			if (other.empName != null)
				return false;
		} else if (!empName.equals(other.empName))
			return false;
		if (empNo == null) {
			if (other.empNo != null)
				return false;
		} else if (!empNo.equals(other.empNo))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "EmployeeDetail [empNo=" + empNo + ", empName=" + empName + ", designation=" + designation
				+ ", dateOfEmployement=" + dateOfEmployement + ", activeInd=" + activeInd + "]";
	}
	
	
}

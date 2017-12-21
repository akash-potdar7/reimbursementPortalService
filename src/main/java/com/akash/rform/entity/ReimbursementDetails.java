package com.akash.rform.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "Reimbursement_details")
public class ReimbursementDetails {

	@Id
	@Column(name = "id")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="reimbursement_seq")
	@SequenceGenerator(
	    name="reimbursement_seq",
	    sequenceName="reimbursement_sequence",
	    allocationSize=20
	)
	private Long id;

	@Column(name = "bill_date")
	private Date billDate;

	@Column(name = "bill_number")
	private Long billNumber;

	//select * from EMPLOYEE_DETAIL e inner join Reimbursement_details r on r.Emp_id=e.Empno;
	@OneToOne(optional=false,fetch = FetchType.EAGER)
	@JoinColumn(name = "Reimbursement_typeid")
	private RType rType;

	@OneToOne(optional=false,fetch = FetchType.EAGER)
	@JoinColumn(name = "project_id")
	private ProjectDetail projectDetail;

	@Column(name = "no_of_persons")
	private Long noOfPersons;

	@Column(name = "Amount")
	private Double amount;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getBillDate() {
		return billDate;
	}

	public void setBillDate(Date billDate) {
		this.billDate = billDate;
	}

	public Long getBillNumber() {
		return billNumber;
	}

	public void setBillNumber(Long billNumber) {
		this.billNumber = billNumber;
	}

	public RType getrType() {
		return rType;
	}

	public void setrType(RType rType) {
		this.rType = rType;
	}

	public ProjectDetail getProjectDetail() {
		return projectDetail;
	}

	public void setProjectDetail(ProjectDetail projectDetail) {
		this.projectDetail = projectDetail;
	}

	public Long getNoOfPersons() {
		return noOfPersons;
	}

	public void setNoOfPersons(Long noOfPersons) {
		this.noOfPersons = noOfPersons;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}
	
	



}

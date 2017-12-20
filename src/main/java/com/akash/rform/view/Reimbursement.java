package com.akash.rform.view;

import java.util.Date;

public class Reimbursement {

	private Long id;
	private Date billDate;
	private Long billNumber;
	private ReimbursementType rType;
	private Project projectDetail;
	private Long noOfPersons;
	private Double amount;

	public Reimbursement() {
	}

	public Reimbursement(Long id, Date billDate, Long billNumber, ReimbursementType rType, Project projectDetail,
			Long noOfPersons, Double amount) {
		super();
		this.id = id;
		this.billDate = billDate;
		this.billNumber = billNumber;
		this.rType = rType;
		this.projectDetail = projectDetail;
		this.noOfPersons = noOfPersons;
		this.amount = amount;
	}

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

	public ReimbursementType getrType() {
		return rType;
	}

	public void setrType(ReimbursementType rType) {
		this.rType = rType;
	}

	public Project getProjectDetail() {
		return projectDetail;
	}

	public void setProjectDetail(Project projectDetail) {
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

	@Override
	public String toString() {
		return "Reimbursement [id=" + id + ", billDate=" + billDate + ", billNumber=" + billNumber + ", rType=" + rType
				+ ", projectDetail=" + projectDetail + ", noOfPersons=" + noOfPersons + ", amount=" + amount + "]";
	}

}

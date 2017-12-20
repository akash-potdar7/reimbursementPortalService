package com.akash.rform.view;

public class ReimbursementType {

	private Long typeId;
	private String typeName;
	private Double priceLimit;
	private char activeInd;

	public ReimbursementType() {}

	public ReimbursementType(Long typeId, String typeName, Double priceLimit, char activeInd) {
		super();
		this.typeId = typeId;
		this.typeName = typeName;
		this.priceLimit = priceLimit;
		this.activeInd = activeInd;
	}

	public Long getTypeId() {
		return typeId;
	}

	public void setTypeId(Long typeId) {
		this.typeId = typeId;
	}

	public String getTypeName() {
		return typeName;
	}

	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}

	public Double getPriceLimit() {
		return priceLimit;
	}

	public void setPriceLimit(Double priceLimit) {
		this.priceLimit = priceLimit;
	}

	public char getActiveInd() {
		return activeInd;
	}

	public void setActiveInd(char activeInd) {
		this.activeInd = activeInd;
	}

	@Override
	public String toString() {
		return "ReimbursementType [typeId=" + typeId + ", typeName=" + typeName + ", priceLimit=" + priceLimit
				+ ", activeInd=" + activeInd + "]";
	}

	
}

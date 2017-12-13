package com.akash.rform.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "REIMBURSEMENT_TYPE")
public class RType implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "TYPE_ID")
	private Long typeId;

	@Column(name = "TYPE_NAME")
	private String typeName;

	@Column(name = "PRICE_LIMIT")
	private Double priceLimit;

	@Column(name = "ACTIVE_IND")
	private char activeInd;

	@Column(name = "CREATED_TMSTMP")
	private Date createdTmstmp;

	public RType(Long typeId, String typeName, Double priceLimit, char activeInd, Date createdTmstmp) {
		super();
		this.typeId = typeId;
		this.typeName = typeName;
		this.priceLimit = priceLimit;
		this.activeInd = activeInd;
		this.createdTmstmp = createdTmstmp;
	}

	public RType() {
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

	public Date getCreatedTmstmp() {
		return createdTmstmp;
	}

	public void setCreatedTmstmp(Date createdTmstmp) {
		this.createdTmstmp = createdTmstmp;
	}

	@Override
	public String toString() {
		return "RType [typeId=" + typeId + ", typeName=" + typeName + ", priceLimit=" + priceLimit + ", activeInd="
				+ activeInd + ", createdTmstmp=" + createdTmstmp + "]";
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + activeInd;
		result = prime * result + ((createdTmstmp == null) ? 0 : createdTmstmp.hashCode());
		result = prime * result + ((priceLimit == null) ? 0 : priceLimit.hashCode());
		result = prime * result + ((typeId == null) ? 0 : typeId.hashCode());
		result = prime * result + ((typeName == null) ? 0 : typeName.hashCode());
		return result;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		RType other = (RType) obj;
		if (activeInd != other.activeInd)
			return false;
		if (createdTmstmp == null) {
			if (other.createdTmstmp != null)
				return false;
		} else if (!createdTmstmp.equals(other.createdTmstmp))
			return false;
		if (priceLimit == null) {
			if (other.priceLimit != null)
				return false;
		} else if (!priceLimit.equals(other.priceLimit))
			return false;
		if (typeId == null) {
			if (other.typeId != null)
				return false;
		} else if (!typeId.equals(other.typeId))
			return false;
		if (typeName == null) {
			if (other.typeName != null)
				return false;
		} else if (!typeName.equals(other.typeName))
			return false;
		return true;
	}

}

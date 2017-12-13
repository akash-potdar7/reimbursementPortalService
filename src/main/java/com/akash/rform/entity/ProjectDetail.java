package com.akash.rform.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "PROJECT_DETAIL")
public class ProjectDetail {

	@Id
	@Column(name = "PROJECT_ID")
	private Long projectId;

	@Column(name = "PROJECT_NAME")
	private String projectName;

	@Column(name = "PROJECT_TYPE")
	private String projectType;

	@Column(name = "ACTIVE_IND")
	private char activeInd;

	@Column(name = "CREATED_TMSTMP")
	private Date createdTmstmp;

	public ProjectDetail(Long projectId, String projectName, String projectType, char activeInd, Date createdTmstmp) {
		super();
		this.projectId = projectId;
		this.projectName = projectName;
		this.projectType = projectType;
		this.activeInd = activeInd;
		this.createdTmstmp = createdTmstmp;
	}

	public ProjectDetail() {
	}

	public Long getProjectId() {
		return projectId;
	}

	public void setProjectId(Long projectId) {
		this.projectId = projectId;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public String getProjectType() {
		return projectType;
	}

	public void setProjectType(String projectType) {
		this.projectType = projectType;
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
		return "ProjectDetail [projectId=" + projectId + ", projectName=" + projectName + ", projectType=" + projectType
				+ ", activeInd=" + activeInd + ", createdTmstmp=" + createdTmstmp + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + activeInd;
		result = prime * result + ((createdTmstmp == null) ? 0 : createdTmstmp.hashCode());
		result = prime * result + ((projectId == null) ? 0 : projectId.hashCode());
		result = prime * result + ((projectName == null) ? 0 : projectName.hashCode());
		result = prime * result + ((projectType == null) ? 0 : projectType.hashCode());
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
		ProjectDetail other = (ProjectDetail) obj;
		if (activeInd != other.activeInd)
			return false;
		if (createdTmstmp == null) {
			if (other.createdTmstmp != null)
				return false;
		} else if (!createdTmstmp.equals(other.createdTmstmp))
			return false;
		if (projectId == null) {
			if (other.projectId != null)
				return false;
		} else if (!projectId.equals(other.projectId))
			return false;
		if (projectName == null) {
			if (other.projectName != null)
				return false;
		} else if (!projectName.equals(other.projectName))
			return false;
		if (projectType == null) {
			if (other.projectType != null)
				return false;
		} else if (!projectType.equals(other.projectType))
			return false;
		return true;
	}

}

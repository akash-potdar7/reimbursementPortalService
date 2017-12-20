package com.akash.rform.view;

import java.util.Date;

public class Project {

	private Long projectId;
	private String projectName;
	private String projectType;
	private char activeInd;

	public Project() {
	}

	public Project(Long projectId, String projectName, String projectType, char activeInd) {
		super();
		this.projectId = projectId;
		this.projectName = projectName;
		this.projectType = projectType;
		this.activeInd = activeInd;
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

	@Override
	public String toString() {
		return "Project [projectId=" + projectId + ", projectName=" + projectName + ", projectType=" + projectType
				+ ", activeInd=" + activeInd + "]";
	}

	
}

package com.timetracker.vo;

public class Project {
	private Integer projectId;
	private String projectName;
	private String projectCode;
	private Integer clientId;
	private Integer taskId;
	private boolean projectDeleted;
	public Integer getProjectId() {
		return projectId;
	}
	public void setProjectId(Integer projectId) {
		this.projectId = projectId;
	}
	public String getProjectName() {
		return projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	public String getProjectCode() {
		return projectCode;
	}
	public void setProjectCode(String projectCode) {
		this.projectCode = projectCode;
	}
	public Integer getClientId() {
		return clientId;
	}
	public void setClientId(Integer clientId) {
		this.clientId = clientId;
	}
	public Integer getTaskId() {
		return taskId;
	}
	public void setTaskId(Integer taskId) {
		this.taskId = taskId;
	}
	public boolean isProjectDeleted() {
		return projectDeleted;
	}
	public void setProjectDeleted(boolean projectDeleted) {
		this.projectDeleted = projectDeleted;
	}
}

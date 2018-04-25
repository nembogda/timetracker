package com.timetracker.vo;

public class Resource {
	private Integer resourceId;
	private String resourceFirstName;
	private String resourceLastName;
	private boolean resourceIsEmployee;
	private String resourceExternalReferenceURL;
	private Integer projectId;
	private Integer currencyId;
	private Integer departmentId;
	private Resource resourceDeleted;
	
	public Integer getResourceId() {
		return resourceId;
	}
	public void setResourceId(Integer resourceId) {
		this.resourceId = resourceId;
	}
	public String getResourceFirstName() {
		return resourceFirstName;
	}
	public void setResourceFirstName(String resourceFirstName) {
		this.resourceFirstName = resourceFirstName;
	}
	public String getResourceLastName() {
		return resourceLastName;
	}
	public void setResourceLastName(String resourceLastName) {
		this.resourceLastName = resourceLastName;
	}
	public boolean isResourceIsEmployee() {
		return resourceIsEmployee;
	}
	public void setResourceIsEmployee(boolean resourceIsEmployee) {
		this.resourceIsEmployee = resourceIsEmployee;
	}
	public String getResourceExternalReferenceURL() {
		return resourceExternalReferenceURL;
	}
	public void setResourceExternalReferenceURL(String resourceExternalReferenceURL) {
		this.resourceExternalReferenceURL = resourceExternalReferenceURL;
	}
	public Integer getProjectId() {
		return projectId;
	}
	public void setProjectId(Integer projectId) {
		this.projectId = projectId;
	}
	public Integer getCurrencyId() {
		return currencyId;
	}
	public void setCurrencyId(Integer currencyId) {
		this.currencyId = currencyId;
	}
	public Integer getDepartmentId() {
		return departmentId;
	}
	public void setDepartmentId(Integer departmentId) {
		this.departmentId = departmentId;
	}
	public Resource getResourceDeleted() {
		return resourceDeleted;
	}
	public void setResourceDeleted(Resource resourceDeleted) {
		this.resourceDeleted = resourceDeleted;
	}
}

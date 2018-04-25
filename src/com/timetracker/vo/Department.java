package com.timetracker.vo;

public class Department {
	private Integer departmentId;
	private String departmentName;
	private boolean departmentDeleted;
	
	public Integer getDepartmentId() {
		return departmentId;
	}
	public void setDepartmentId(Integer departmentId) {
		this.departmentId = departmentId;
	}
	public String getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	public boolean isDepartmentDeleted() {
		return departmentDeleted;
	}
	public void setDepartmentDeleted(boolean departmentDeleted) {
		this.departmentDeleted = departmentDeleted;
	}
}

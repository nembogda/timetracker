package com.timetracker.vo;

import java.sql.Date;

public class Timesheet {
	private Integer timesheetId;
	private Date timesheetDate;
	private Double timesheetHours;
	private Integer timesheetHoursRounded;
	private boolean timesheetApproved;
	private boolean timesheetBillable;
	private boolean timesheetInvoiced;
    private Integer timesheetBillableRate;
    private Integer timesheetCostRate;
    private Integer timesheetCostAmount;  	
	private Integer projectId;
	private Integer resourceId;
	private boolean timesheetDeleted;
	
	public Integer getTimesheetId() {
		return timesheetId;
	}
	public void setTimesheetId(Integer timesheetId) {
		this.timesheetId = timesheetId;
	}
	public Date getTimesheetDate() {
		return timesheetDate;
	}
	public void setTimesheetDate(Date timesheetDate) {
		this.timesheetDate = timesheetDate;
	}
	public Double getTimesheetHours() {
		return timesheetHours;
	}
	public void setTimesheetHours(Double timesheetHours) {
		this.timesheetHours = timesheetHours;
	}
	public Integer getTimesheetHoursRounded() {
		return timesheetHoursRounded;
	}
	public void setTimesheetHoursRounded(Integer timesheetHoursRounded) {
		this.timesheetHoursRounded = timesheetHoursRounded;
	}
	public boolean isTimesheetApproved() {
		return timesheetApproved;
	}
	public void setTimesheetApproved(boolean timesheetApproved) {
		this.timesheetApproved = timesheetApproved;
	}
	public boolean isTimesheetBillable() {
		return timesheetBillable;
	}
	public void setTimesheetBillable(boolean timesheetBillable) {
		this.timesheetBillable = timesheetBillable;
	}
	public boolean isTimesheetInvoiced() {
		return timesheetInvoiced;
	}
	public void setTimesheetInvoiced(boolean timesheetInvoiced) {
		this.timesheetInvoiced = timesheetInvoiced;
	}
	public Integer getProjectId() {
		return projectId;
	}
	public void setProjectId(Integer projectId) {
		this.projectId = projectId;
	}
	public Integer getResourceId() {
		return resourceId;
	}
	public void setResourceId(Integer resourceId) {
		this.resourceId = resourceId;
	}
	public boolean isTimesheetDeleted() {
		return timesheetDeleted;
	}
	public void setTimesheetDeleted(boolean timesheetDeleted) {
		this.timesheetDeleted = timesheetDeleted;
	}
	public Integer getTimesheetBillableRate() {
		return timesheetBillableRate;
	}
	public void setTimesheetBillableRate(Integer timesheetBillableRate) {
		this.timesheetBillableRate = timesheetBillableRate;
	}
	public Integer getTimesheetCostRate() {
		return timesheetCostRate;
	}
	public void setTimesheetCostRate(Integer timesheetCostRate) {
		this.timesheetCostRate = timesheetCostRate;
	}
	public Integer getTimesheetCostAmount() {
		return timesheetCostAmount;
	}
	public void setTimesheetCostAmount(Integer timesheetCostAmount) {
		this.timesheetCostAmount = timesheetCostAmount;
	}
}
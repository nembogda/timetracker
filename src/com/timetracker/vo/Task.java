package com.timetracker.vo;

public class Task {
	private Integer taskId;
	private String taskName;
	private boolean taskDeleted;
	public Integer getTaskId() {
		return taskId;
	}
	public void setTaskId(Integer taskId) {
		this.taskId = taskId;
	}
	public String getTaskName() {
		return taskName;
	}
	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}
	public boolean isTaskDeleted() {
		return taskDeleted;
	}
	public void setTaskDeleted(boolean taskDeleted) {
		this.taskDeleted = taskDeleted;
	}
}
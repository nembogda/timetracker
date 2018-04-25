package com.timetracker.vo;

public class Client {
	private Integer clientId;
	private String clientName;
	private boolean clientDeleted;

	public Integer getClientId() {
		return clientId;
	}
	public void setClientId(Integer clientId) {
		this.clientId = clientId;
	}
	public String getClientName() {
		return clientName;
	}
	public void setClientName(String clientName) {
		this.clientName = clientName;
	}
	public boolean isClientDeleted() {
		return clientDeleted;
	}
	public void setClientDeleted(boolean clientDeleted) {
		this.clientDeleted = clientDeleted;
	}
}
//lombok
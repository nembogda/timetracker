package com.timetracker.vo;

public class Currency {
	private Integer currencyId;
	private String currencyName;
	private boolean currencyDeleted;
	public String getCurrencyName() {
		return currencyName;
	}
	public void setCurrencyName(String currencyName) {
		this.currencyName = currencyName;
	}
	public Integer getCurrencyId() {
		return currencyId;
	}
	public void setCurrencyId(Integer currencyId) {
		this.currencyId = currencyId;
	}
	public boolean isCurrencyDeleted() {
		return currencyDeleted;
	}
	public void setCurrencyDeleted(boolean currencyDeleted) {
		this.currencyDeleted = currencyDeleted;
	}
}

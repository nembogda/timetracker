package com.timetracker.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.timetracker.dao.CurrencyDAO;
import com.timetracker.vo.Currency;

@Service
public class CurrencyService {
	@Autowired
	private CurrencyDAO dao;
	public Object getCurrencies() {
		return null;
	}
	public void addCurrencies(List<Currency> currencies) {
		// TODO Auto-generated method stub		
	}

	public void updateCurrencies(List<Currency> currencies) {
		// TODO Auto-generated method stub
		
	}
}

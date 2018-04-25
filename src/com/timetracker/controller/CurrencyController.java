package com.timetracker.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.timetracker.service.CurrencyService;
import com.timetracker.util.Response;
import com.timetracker.vo.Currency;

@RestController
@RequestMapping("/currency")
public class CurrencyController {
	@Autowired
	private CurrencyService service;
	@RequestMapping(method = RequestMethod.GET)
	public Object getCurrencies() {
		return service.getCurrencies();
	}
	@RequestMapping(method = RequestMethod.POST)
	public void addCurrencies(List<Currency> currencies) {
		service.addCurrencies(currencies);
	}
	@RequestMapping(method = RequestMethod.PUT)
	public void updateCurrency(List<Currency> currencies) {
		service.updateCurrencies(currencies);
	}
}

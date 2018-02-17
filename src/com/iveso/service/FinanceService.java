package com.iveso.service;

import java.util.ArrayList;
import java.util.List;

import com.iveso.dao.FinanceDAO;
import com.iveso.entity.Finance;

public class FinanceService {

	private FinanceDAO dao;
	private List<Finance> finances;
	
	public FinanceService(FinanceDAO dao) {
		this.dao = dao;
		this.finances = new ArrayList<>();
	}
	
	public void save(Finance finance) {
		this.dao.save(finance);
		this.finances.add(finance);
	}
	
	public void remove(Finance finance) {
		this.dao.remove(finance);
		this.finances.remove(finance);
	}
	
	public List<Finance> getFinances() {
		return finances;
	}
}

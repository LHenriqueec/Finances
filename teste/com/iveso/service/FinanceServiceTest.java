package com.iveso.service;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

import org.junit.Before;
import org.junit.Test;

import com.iveso.dao.FinanceDAO;
import com.iveso.entity.Finance;

public class FinanceServiceTest {
	
	private Finance finance;
	private FinanceService service;
	private FinanceDAO dao;
	
	@Before
	public void init() {
		dao = mock(FinanceDAO.class);
		service = new FinanceService(dao);
	}
	
	@Test
	public void remove_finance() throws Exception {
		finance = new Finance();
		service.save(finance);
		
		service.remove(finance);
		
		verify(dao).remove(finance);
		assertEquals(0, service.getFinances().size());
	}
	
	@Test
	public void add_finance() throws Exception {
		finance = new Finance();
		service.save(finance);
		
		verify(dao).save(finance);
		assertEquals(1, service.getFinances().size());
	}
}

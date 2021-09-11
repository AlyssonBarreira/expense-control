package com.alysson.expensecontrol.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alysson.expensecontrol.entity.Expenses;
import com.alysson.expensecontrol.repository.ExpenseRepository;
import com.alysson.expensecontrol.service.ExpenseService;

@Service
public class ExpenseServiceImpl implements ExpenseService{
	
	@Autowired
	private ExpenseRepository expenseRepository;
	
	@Override
	public List<Expenses> getAllExpenses() {
		return expenseRepository.findAll();
	}
	
	@Override
	public Expenses saveExpense(Expenses expense) {
		return expenseRepository.save(expense);
	}
	
	

}

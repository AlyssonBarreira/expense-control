package com.alysson.expensecontrol.service;

import java.util.List;

import com.alysson.expensecontrol.entity.Expenses;

public interface ExpenseService {

	List<Expenses> getAllExpenses();
}
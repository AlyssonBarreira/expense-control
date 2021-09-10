package com.alysson.expensecontrol.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.alysson.expensecontrol.entity.Expenses;
import com.alysson.expensecontrol.service.ExpenseService;

@Controller
public class ExpenseController {

	@Autowired
	private ExpenseService expenseService;
	
	
	@GetMapping("/expenses")
	public String listExpeses(Model model) {
		model.addAttribute("expense", expenseService.getAllExpenses());
		return "expense";
	}
	
	@GetMapping("/expenses/new")
	public String createExpenseForm(Model model) {
		Expenses expense = new Expenses();
		model.addAttribute("expense", expense);
		return "create_expense";
	}
	
}

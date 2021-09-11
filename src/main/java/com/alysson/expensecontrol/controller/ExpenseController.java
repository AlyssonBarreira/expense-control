package com.alysson.expensecontrol.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.alysson.expensecontrol.entity.Expenses;
import com.alysson.expensecontrol.service.ExpenseService;

@Controller
public class ExpenseController {

	
	private ExpenseService expenseService;
	
	public ExpenseController(ExpenseService expenseService) {
		super();
		this.expenseService = expenseService;
	}
	
	
	@GetMapping("/expenses")
	public String listExpenses(Model model) {
		model.addAttribute("expense", expenseService.getAllExpenses());
		return "expense";
	}
	
	@GetMapping("/expenses/new")
	public String createExpenseForm(Model model) {
		Expenses expense = new Expenses(null, null, null);
		model.addAttribute("expense", expense);
		return "create_expense";
	}
	
	@PostMapping("/expenses")
	public String saveExpense(@ModelAttribute("expense") Expenses expense) {
		expenseService.saveExpense(expense);
		return "redirect:/expenses";
	}
	
}

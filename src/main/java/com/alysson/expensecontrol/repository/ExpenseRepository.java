package com.alysson.expensecontrol.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alysson.expensecontrol.entity.Expenses;

public interface ExpenseRepository extends JpaRepository<Expenses, Long>{

}

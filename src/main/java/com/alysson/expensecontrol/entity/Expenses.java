package com.alysson.expensecontrol.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "expense")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Expenses {
	
	@Id
	private Long id;
	
	@Column(name = "expense_name", nullable = false)
	private String expenseName;
	
	@Column(name = "expense_price", nullable = false)
	private Double expensePrice;
	

}

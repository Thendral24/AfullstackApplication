package com.example.demo;



import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RestController;

@RestController

public class UserController {
	@GetMapping("/test")
	
	public String testAPI() {
		
		return "Server up and Running";
	}
	@GetMapping("/getUserDetails")
	
	public User getUserDetails() {
		User user=new User();

		Expense expense = new Expense();
		expense.setDate("21/07/2022");
		expense.setCostOfItem("200");
		expense.setItem("Grossory");
		
		user.setExpense(expense);

		Income income = new Income();
		income.setDate("21/07/2022");
		income.setIncomeAmount("50000");

		user.setIncome(income);

		return user;
		
	}

}

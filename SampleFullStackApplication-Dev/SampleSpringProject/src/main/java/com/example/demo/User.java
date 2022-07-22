package com.example.demo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class User {

	String userName;
	String userPassword;
	String email;
	Expense expense;
	Income income;
	
       
}


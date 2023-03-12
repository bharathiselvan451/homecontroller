package com.phaseii.demo;

import java.sql.Date;



import jakarta.persistence.Entity;
import jakarta.persistence.Id;


@Entity
public class database {
    @Id
	private String email;
	private String password;
	//private Date date;
	private int expense;
	private int budget;
	private String name;
	@Override
	public String toString() {
		return "database [email=" + email + ", password=" + password + ", date=" + "date" + ", expense=" + expense
				+ ", budget=" + budget + ", name=" + name + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public int getExpense() {
		return expense;
	}
	public void setExpense(int expense) {
		this.expense = expense;
	}
	public int getBudget() {
		return budget;
	}
	public void setBudget(int budget) {
		this.budget = budget;
	}
	
	
	
	
}

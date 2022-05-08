package com.training.inheritance;

public abstract class Account {
	
	public abstract double getBalanceAmount();  //only declaration
	
	public String accountType(){  // concrete method
		return "savings";
	}

}

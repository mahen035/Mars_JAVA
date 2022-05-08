package com.training.service;

public class HomeService implements IHomeService {
	
	@Override
	public boolean validateUser(String uName, String password) {
		if(uName.equalsIgnoreCase("adam") && password.equals("pass123")) {
			return true;
		}
		else {
			return false;
		}
	}

}

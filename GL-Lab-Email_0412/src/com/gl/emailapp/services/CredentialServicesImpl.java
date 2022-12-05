package com.gl.emailapp.services;

import java.util.Random;
import com.gl.emailapp.model.Employee;

public class CredentialServicesImpl implements CredentialServices {

	@Override
	public String passwordgenerator() {
		// TODO Auto-generated method stub	
		String capChars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String smallChars = "abcdefghijklmnopqrstuvwxyz";
		String numbers = "1234567890";
		String symbols = "!@#$%^&*_-+=/,.<>";
		String values = capChars + smallChars + numbers + symbols ;
		
		Random random = new Random();
		char[] password = new char[8];
		for (int i =0; i< 8; i++) {
			int randomNumber = random.nextInt(values.length());
			password[i] = values.charAt(randomNumber);
		}
		return new String(password);
	}

	
	@Override
	public String emailgenerator(Employee employee, String department) {
		// TODO Auto-generated method stub
		return (employee.getFirstname() + employee.getLastname()).toLowerCase() + "@" + department +".abc.com";
	}

	@Override
	public void displayCredentials(Employee emp, String department) {
		// TODO Auto-generated method stub
		System.out.println("Dear " + emp.getFirstname() + " your generated credentials are as follows:");
		System.out.println("EMAIL  --> " + emailgenerator(emp, department));
		System.out.println("Password  --> " + passwordgenerator());
	}


}

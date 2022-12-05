package com.gl.emailapp.services;

import com.gl.emailapp.model.Employee;

public interface CredentialServices {
	
	public String passwordgenerator();
	
	public String emailgenerator(Employee employee, String department);
	
	public void displayCredentials(Employee emp, String department);

	
}

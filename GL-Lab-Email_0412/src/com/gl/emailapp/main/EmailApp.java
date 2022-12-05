package com.gl.emailapp.main;

import java.util.Scanner;

import com.gl.emailapp.model.Employee;
import com.gl.emailapp.services.CredentialServicesImpl;

public class EmailApp {

	public static void main(String[] args) {
		CredentialServicesImpl service = new CredentialServicesImpl();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the First Name");
		String firstName =sc.next();
		System.out.println("Enter the Last Name");
		String lastName =sc.next();
		Employee employee = new Employee(firstName, lastName);
		String deptartment = null;
		service.passwordgenerator();
		System.out.println("Please enter the department from the following ");
		System.out.println("1. Press 1 for Technical Department");
		System.out.println("2. Press 2 for Admin Department");
		System.out.println("3. Press 1 for Human Resource Department");
		System.out.println("4. Press 1 for Legal Department");
		System.out.println("----------------------------------------------------------");
		System.out.println("Please enter your Choice");
		int choice = sc.nextInt();
		switch (choice) {
		case 1:
			deptartment = "tech";
			service.displayCredentials(employee, deptartment);
			break;
		case 2:
			deptartment = "admin";
			service.displayCredentials(employee, deptartment);
			break;
		case 3:
			deptartment = "hr";
			service.displayCredentials(employee, deptartment);
			break;
		case 4:
			deptartment = "legal";
			service.displayCredentials(employee, deptartment);
			break;
		default:
			  System.out.println("Please enter Valid choice");			  
		}
	}
}

package com.capgemini.lab6;

public class EmployeeServiceImplementation implements Employee_Service {

	public String calculateInsuranceScheme(double salary, String designation) {
		if (salary > 5000 && salary < 2000 && designation.contentEquals("System associates")) {
			return "Scheme C";
		} else if (salary >= 20000 && salary < 40000 && designation.contentEquals("Manager")) {
			return "Scheme B";
		} else if (salary > 5000 && designation.contentEquals("Manager")) {
			return "Scheme A";
		} else if (salary <= 5000 && designation.contentEquals("Clerks")) {
			return "No Scheme";
		} else {
			return "No Scheme";
		}

	}

}

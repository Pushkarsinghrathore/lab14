package com.capgemini.lab6;


import java.util.Scanner;


public class EmployeeMain {
	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		System.out.println("\t\t\t********Enter Employee Detail********");
		System.out.println("Please Enter Id:");
		String id = scr.next();
		System.out.println("Please Enter Name:");
		String name = scr.next();
		System.out.println("Please Enter Salary:");
		String salary = scr.next();
		try {
			if (Integer.parseInt(salary) < 3000) {
				throw new SalaryException("salary of an employee is greater than 3000");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println("Please Enter Designation:");
		String designation = scr.next();

		Employee employee = new Employee();
		employee.setName(name);
		employee.setId(Integer.parseInt(id));
		employee.setSalary(Double.parseDouble(salary));
		employee.setDesignation(designation);

		EmployeeServiceImplementation employeeServiceImplementation = new EmployeeServiceImplementation();
		employee.setInsuranceScheme(
				employeeServiceImplementation.calculateInsuranceScheme(Double.parseDouble(salary), designation));
		employeeServiceImplementation.calculateInsuranceScheme(Double.parseDouble(salary), designation);
		System.out.println(employee);
	}

}

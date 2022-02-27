package com.blz;

public class Employee_Wage_Computation {
	static int wagePerHour = 20;
	static int empHrs = 0;
	static int empHrsf = 8;
	static int empHrsP = 4;
	static int workingDay = 20;

	public static void main(String[] args) {
		System.out.println("Welcome in Employee Wage Compution..!!!");
		useSwitchCase(); // Calling method
	}

	// Use static method to Solving using Switch Case

	static void useSwitchCase() {
		int randomNum = (int) (Math.random() * 3); // create random number using math function

		switch (randomNum) {
		case 0:

			int salary = wagePerHour * empHrs; // Employee Salary/Day
			System.out.println("Employee is Absent ,salary is :" + salary);
			break;
		case 1:

			int salaryf = wagePerHour * empHrsf * workingDay; // Employee full Salary/Month
			System.out.println("Employeeis Present full time full month, salary is :" + salaryf);
			break;
		case 2:

			int salaryp = wagePerHour * empHrsP * workingDay; // Employee Part time Salary/Month
			System.out.println("Employee is Present part time full month, salary is :" + salaryp);
			break;
		}
	}
}
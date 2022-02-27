package com.blz;

public class Employee_Wage_Computation {
	static int wagePerHour = 20;
	static int empHrs = 0;
	static int empHrsf = 8;
	static int empHrsP = 4;

	public static void main(String[] args) {
		System.out.println("Welcome in Employee Wage Compution..!!!");
		addPartTimeEmpage(); // Calling method
	}

	// Use static method to Calculate Employee Daily Wage.

	static void addPartTimeEmpage() {
		int randomNum = (int) (Math.random() * 2); // create random number using math function

		if (randomNum == 1) // Check Employee presence
		{
			System.out.println(" Employee is Present ");

			if (empHrsf == 8) {
				int salary = wagePerHour * empHrsf; // Employee Full timeSalary/Day
				System.out.println(" Employee salary of Full time is :" + salary);
			}
			if (empHrsP == 4) {
				int salary = wagePerHour * empHrsP; // Employee Part time Salary/Day
				System.out.println(" Employee salary of Part time is :" + salary);
			}
		} else {
			System.out.println(" Employee is Absent ");
			int salary = wagePerHour * empHrs; // Employee No Salary/Day
			System.out.println(" Employee salary is :" + salary);
		}
	}
}
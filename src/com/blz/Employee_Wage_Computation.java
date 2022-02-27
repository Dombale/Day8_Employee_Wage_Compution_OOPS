package com.blz;

public class Employee_Wage_Computation {

	public static void main(String[] args) {
		System.out.println("Welcome in Employee Wage Compution..!!!");
		calculateDailyWage(); // Calling method
	}

	// Use static method to Calculate Employee Daily Wage.

	static void calculateDailyWage() {
		int randomNum = (int) (Math.random() * 2); // create random number using math function
		int wagePerHour = 20;
		int empHrs = 0;
		int empHrsf = 8;

		if (randomNum == 1) // Check Employee presence
		{
			int salary = wagePerHour * empHrsf; // Employee Full timeSalary/Day
			System.out.println(" Employee is Present, salary of Full time is :" + salary);
		} else {
			int salary = wagePerHour * empHrs; // No Working , No Salary
			System.out.println(" Employeeis Absent, salary is :" + salary);
		}
	}
}
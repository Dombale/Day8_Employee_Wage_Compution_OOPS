package com.blz;

public class Employee_Wage_Computation {

	public static void main(String[] args) {
		System.out.println("Welcome in Employee Wage Compution..!!!");
		checkPresentOrNot();
	}

	// Use static method to check Employee present or not.

	static void checkPresentOrNot() {
		int randomNum = (int) (Math.random() * 2); // create random number using math function

		if (randomNum == 1) // Check Employee presence
		{
			System.out.println(" Employee is Present " + randomNum);
		} else
			System.out.println(" Employee is Absent " + randomNum);
	}
}
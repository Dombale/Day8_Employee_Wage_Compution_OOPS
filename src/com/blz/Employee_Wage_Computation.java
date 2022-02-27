package com.blz;

public class Employee_Wage_Computation {
	// Initialize and declare variables

	static int wagePerHour = 20;
	static int empHrs = 0;
	static int empHrsf = 8;
	static int empHrsP = 4;
	static int workingDay = 20;
	static int totalWage = 0;
	static int totalWorkingHour = 0;
	static int totalWorkingDay = 0;
	static int wagePerDay;

	public static void main(String[] args) {
		System.out.println("Welcome in Employee Wage Computation..!!!");
		calculateSalary(); // Calling method
	}

	// Use static method to Calculate Employee salary till 100hrs & 20 days

	static void calculateSalary() {
		for (int i = 1; i <= workingDay; i++) {
			if (totalWorkingHour <= 100 && totalWorkingDay <= 20) {
				int empCheck = (int) Math.floor((Math.random() * 10) % 3);

				if (empCheck == 2) {
					wagePerDay = (wagePerHour * empHrsf);
					totalWage = totalWage + wagePerDay;
					totalWorkingHour = totalWorkingHour + empHrsf;
					totalWorkingDay++;
				}

				else if (empCheck == 1) {

					wagePerDay = (wagePerHour * empHrsP);
					totalWage = totalWage + wagePerDay;
					totalWorkingHour = totalWorkingHour + empHrsP;
					totalWorkingDay++;
				} else {
					wagePerDay = 0;
					totalWage = totalWage + wagePerDay;
				}

			} else
				break;
		}

		System.out.println("Total working hour = " + totalWorkingHour);
		System.out.println("Toatl working day = " + totalWorkingDay);
		System.out.println("Total wage of the month = " + totalWage);
	}

}
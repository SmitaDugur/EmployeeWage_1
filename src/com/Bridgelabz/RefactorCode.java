package com.Bridgelabz;

public class RefactorCode {

		public static int MAX_WORKING_DAYS = 20;
		public static int MAX_HOURS = 100;
		public static void main(String[] args) {
			int workingDays = 0;
			while (workingDays < MAX_WORKING_DAYS  && EmpCalculation.totalHrs < MAX_HOURS) {
				workingDays++;
				System.out.println("For DAY"+workingDays);
				EmpCalculation emp = new EmpCalculation();
				emp.empCheck();
				DailyWage wage = new DailyWage();
				wage.dailyWageCalculation();
				wage.totalWage();
			}
			System.out.println("Employee's total working Hours = "+EmpCalculation.totalHrs);
			System.out.println("Total Wage of employee in a month = "+DailyWage.totalWage);
		}
	}
	class EmpCalculation 
	{
		public static final int IS_FULLTIME = 1;
		public static final int IS_PARTTIME = 2;
		public static int empHrs;
		public static int totalHrs = 0;
		public void empCheck() {
			int empCheck = (int)Math.floor(Math.random() * 10) % 3;
			switch(empCheck) {
			case IS_FULLTIME:
				System.out.println("Employee is present and worked full-time");
				empHrs = 8;
				break;
			case IS_PARTTIME:
				System.out.println("Employee is present and worked part-time");
				empHrs = 4;
				break;
				
			default:
				System.out.println("Employee is absent");
				empHrs = 0;
			}
			totalHrs = totalHrs + empHrs;
		}
	}
	class DailyWage{
		public static final int WAGE_PER_HOUR = 20;
		static int totalWage = 0;
		int totalDailyWage;
		public void dailyWageCalculation() {
		totalDailyWage = EmpCalculation.empHrs * WAGE_PER_HOUR;
		System.out.println("Daily employee wage is "+totalDailyWage);
		}
		public void totalWage() {
			totalWage = totalWage + totalDailyWage; 
		}
		
	}
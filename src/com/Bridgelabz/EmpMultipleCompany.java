package com.Bridgelabz;

public class EmpMultipleCompany {

		public static final int IS_FULLTIME = 1;
		public static final int IS_PARTTIME = 2;
		public static int TOTAL_WAGE = 0;
		public static void main(String[] args) {

				EmployeeWage emp = new EmployeeWage();
				emp.empCheck("D-MART",20,2,10);
				emp.empCheck("RELIANCE",10,4,20);
				
			}
		
		public void empCheck(String company, int empRatePerHour,int numOfWorkingDays,int maxHrsPerMonth) {
		    int	workingDays = 0,empHrs = 0,totalHrs=0,totalDailyWage=0;
			while (workingDays < numOfWorkingDays  && totalHrs < maxHrsPerMonth) {
				workingDays++;
				System.out.println("For DAY"+workingDays);
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
				totalDailyWage = empHrs * empRatePerHour;
				System.out.println("Daily employee wage is "+totalDailyWage);
				totalHrs = totalHrs + empHrs;
				TOTAL_WAGE = TOTAL_WAGE + totalDailyWage;
			}
		System.out.println("Total Wage of "+company+"'s employees in a month = "+TOTAL_WAGE);
			
		}
		
	}
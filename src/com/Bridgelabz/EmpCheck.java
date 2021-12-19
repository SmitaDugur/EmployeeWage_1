package com.Bridgelabz;

public class EmpCheck {

	public static void main(String[] args) {
			Attendence attendence = new Attendence();
			attendence.empCheck();
		}
}
class Attendence {
		public static final int IS_PRESENT = 1;
		public static final int IS_ABSENT = 0;
		public void empCheck() {
			int empCheck = (int)Math.floor(Math.random() * 10) % 2;
			switch(empCheck) {
			case IS_PRESENT: 
				System.out.println("Employee is present");
				break;
			case IS_ABSENT:
				System.out.println("Employee is absent");
				break;
			default:
				System.out.println("Welcome");
			}
		}
}
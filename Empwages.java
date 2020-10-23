package org.test;

import java.util.Random;
import java.util.Scanner;

public class Empwages {

	public static final int isFullTime = 1;
	public static final int isPartTime = 0;
	public static final int perHour = 20;
	public static final int FullDayHour = 8;
	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("---------Employee_Wages-----------");
		
		Empwages emp = new Empwages();
		emp.CalEmpWages();
	}

	public void CalEmpWages() {
		Random rn = new Random();
		int rand = rn.nextInt(2);
		if (rand == isFullTime) {
			System.out.println("Enter fullTimeDays Employee Worked : ");
			int day = in.nextInt();
			int TotalWages = perHour * (FullDayHour * day);
			System.out.println("Total_Salary for " + day + " days : " + TotalWages + " Rs.");
		} 
		else if(rand == isPartTime) {
			System.out.println("Enter partTimeDays Employee Worked : ");
			int day = in.nextInt();
			int TotalWages = perHour * ((FullDayHour/2) * day);
			System.out.println("Total_Salary for " + day + " days : " + TotalWages + " Rs.");
		}else
			System.out.println("Employee is absent..!!!");
		in.close();
	}
}

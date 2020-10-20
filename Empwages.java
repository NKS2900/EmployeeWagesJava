package org.emp;

import java.util.Random;
import java.util.Scanner;

public class EmpDailyWages {
	
	//Calculate Employee Daily Wages

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int isFullTime = 1;
		int perHour = 20;
		int FullDayHour = 8;
		Scanner in = new Scanner(System.in);
		System.out.println("-------Employee_Wages--------");

		Random rn=new Random();
		int rand=rn.nextInt(2);

		if (rand == isFullTime) {

			System.out.println("Enter no Days Employee Worked : ");
			int day = in.nextInt();
			int TotalWages = perHour * (FullDayHour * day);
			System.out.println("Total_Salary for " + day + " days : " + TotalWages + " Rs.");
		} 
		else
			System.out.println("Employee is absent..!!!");
		
		in.close();
	}

}

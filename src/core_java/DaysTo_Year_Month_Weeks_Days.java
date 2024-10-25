package core_java;

import java.util.Scanner;

public class DaysTo_Year_Month_Weeks_Days {

	public static void main(String[] args) {
		// TODO Auto-generated method stub\
		
		//
		int year,month,week,days,day;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Days :");
		days=sc.nextInt();
		
		year=days/365;
		System.out.println("Year = "+year);
		days=days%365;
		month=days/30;
		System.out.println("Month = "+month);
		month=days%30;
		week=month/7;
		System.out.println("weeks = "+week);
		day=month%7;
		System.out.println("Days are = "+day);

	}

}

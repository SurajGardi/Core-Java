package core_java;

import java.util.Scanner;

public class leap_year {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int year;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter year : ");
		year=sc.nextInt();
		
		if((year%4==0 && year%100!=0) || (year%400==0)) {
			System.out.println(+year+" is Leap Year");
		}
		else {
			System.out.println(+year+" is Not a Leap Year...");
		}
	}

}

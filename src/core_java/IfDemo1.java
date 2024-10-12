package core_java;

import java.util.Scanner;

public class IfDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num;
		System.out.println("Enter number :");
		Scanner sc=new Scanner(System.in);
		num=sc.nextInt();
		//System.out.println("age is ="+age);
		
	/*	if(age>=18) {
			System.out.println("Eligible for Voating..!");
		}
		else {
			System.out.println("Not eligible..!");
		}
	*/	
		if(num%2==0) {
			System.out.println("Even No");
		}
		else {
			System.out.println("Odd No");
		}
	}

}

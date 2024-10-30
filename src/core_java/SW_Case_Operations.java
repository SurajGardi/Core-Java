package core_java;

import java.util.Scanner;

public class SW_Case_Operations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a;
		int b;
		
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter 1st no : ");
		a=sc.nextInt();
		System.out.print("Enter 2nd No : ");
		b=sc.nextInt();
		System.out.println("select choice : ");
		System.out.println("1.add \n 2.sub \n 3.mult \n 4.div");
		
		int ch;
		System.out.print("Enter choice : ");
		ch=sc.nextInt();
		//int c;
		switch (ch) {
		case 1:
			ch=a+b;
			System.out.println("Addition is : "+ch);
			break;
			
		case 2:
			ch=a-b;
			System.out.println("Subtraction is : "+ch);
			break;
			
		case 3:
			ch=a*b;
			System.out.println("Mult is : "+ch);
			break;
			
		case 4:
			ch=a/b;
			System.out.println("Div is : "+ch);
			break;
			
		default :
			System.out.println("Invali Choice : ");
		
		}
	}

}

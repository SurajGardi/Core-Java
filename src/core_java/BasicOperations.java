package core_java;

import java.util.Scanner;

public class BasicOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//int a=20,b=10;
		int a,b;
		Scanner sc=new Scanner(System.in);
		
	    System.out.println("Enter the number :");
	    a=sc.nextInt();
		System.out.println("Enter the number :");
	    b=sc.nextInt();
		    
		System.out.println("Addition of two No: "+a+" & "+b+ " = "+(a+b));
		System.out.println("Subtraction of two No: "+a+" & "+b+ " = "+(a-b));
		System.out.println("Division of two No: "+a+" & "+b+ " = "+(a/b));
		System.out.println("Mutiplication of two No: "+a+" & "+b+ " = "+(a*b));

	}

}


//Scanner sc=new Scanner(System.in);
//System.out.println("Enter value of a :");
//a=sc.nextInt();
//System.out.println("Enter value of b :");
//b=sc.nextInt();

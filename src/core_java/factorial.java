package core_java;

import java.util.Scanner;

public class factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n,fact=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter No :");
		n=sc.nextInt();
		for(int i=1; i<=n; i++) {
			fact=fact*i;
		}
		System.out.println("Factorial is :"+fact);
	}

}

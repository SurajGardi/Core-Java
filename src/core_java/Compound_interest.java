package core_java;

import java.util.Scanner;

//COMPOUND INTEREST..

//Formula=p*(1+r/100)^t

public class Compound_interest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double p,r,t,amount;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter principle Amt :");
		p=sc.nextDouble();
		System.out.println("Enter rate of interest :");
		r=sc.nextDouble();
		System.out.println("Enter time period :");
		t=sc.nextDouble();
		amount=p*Math.pow((1+r/100), t);
		System.out.println("CompoundIInterest Is :"+amount);

	}

}

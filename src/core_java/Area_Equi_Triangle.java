package core_java;

import java.util.Scanner;

public class Area_Equi_Triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter the a :");
		
		int a;
		
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		
		double area=(1.73 * a * a)/4;
				
		System.out.println("Area Of Equilateral Triangle is :" +area);		
	
	}

}

package core_java;

import java.util.Scanner;

public class Area_Peri_of_Circle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//area=3.14*r*r
		//peri=2*3.14*r
		double r,area,peri;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter value of radious :");
		r=sc.nextDouble();
		
		area=3.14*r*r;
		peri=2*3.14*r;
		System.out.println("Area of Circle : "+area);
		System.out.println("Perimeter of circle :"+peri);
		
	}

}

package core_java;

import java.util.Scanner;

public class Area_Peri_Rect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		//Area of Rect = length*width;
		//Perimeter of Rect = 2*(length+width);
		
		double length,width,area,peri;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length:");
		length=sc.nextDouble();
		System.out.println("Enter the width:");
		width=sc.nextDouble();
		
		
		area=length*width;
		peri=2*(length+width);
		
		System.out.println("Area is :"+area);
		System.out.println("Peri is :"+peri);
		
		
	}

}

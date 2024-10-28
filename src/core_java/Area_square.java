package core_java;

import java.util.Scanner;

public class Area_square {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Area of Square
		//side*side

		int side;
		System.out.print("Enter the side :");
		Scanner sc=new Scanner(System.in);
		
		side=sc.nextInt();
		
		int area=side*side;
		System.out.println("\nArea of Square :" +area);
	}

}

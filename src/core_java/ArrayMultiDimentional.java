package core_java;

import java.util.Scanner;

public class ArrayMultiDimentional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		// int[][] a = { {10, 20, 30}, {40, 50, 60} };

	    // for (int i = 0; i < a.length; i++) {
	    //     for (int j = 0; j < a[i].length; j++) {
	    //         System.out.print(a[i][j] + " ");
	    //     }
	    //     System.out.println();
		
	        
		
		int[][] a=new int[3][2];
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array Values :");

		for(int i=0; i<3; i++) {
			for(int j=0; j<2; j++) {
				a[i][j]=sc.nextInt();
			}
		}
		
		System.out.println("Array is :");
		for(int i=0; i<3; i++) {
			for(int j=0; j<2; j++) {
				System.out.print(a[i][j]+ " ");
			}
			System.out.println();
		}
		
		
	// 	int[][] a=new int[2][3];
		
	// 	a[0][0]=10;
	// 	a[0][1]=20;
	// 	a[0][2]=30;
	// 	a[1][0]=40;
	// 	a[1][1]=50;
	// 	a[1][2]=60;
		
	// 	for(int i=0; i<a.length;i++) {
		
	// 		for(int j=0;j<a[i].length;j++) {
	// 			System.out.print(a[i][j]+ " ");
	// 		}
	//         System.out.println();
	// }

	}
}

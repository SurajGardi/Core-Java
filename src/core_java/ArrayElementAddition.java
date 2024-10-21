package core_java;

import java.util.Scanner;

public class ArrayElementAddition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int add=0;
//		
//		
//		a[0]=10;
//		a[1]=20;
//		a[2]=30;
//		a[3]=40;
//		a[4]=50;
//		
//		
//		//System.out.println(a[0]+a[1]+a[2]);
//		for(int i=0; i<5; i++) {
//			add+=a[i]; //add=a[i]+add;
//		}
//		System.out.println(add);
		int [] a=new int[5];
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Array Elements :");
	
		
		for(int i=0; i<5; i++) {
			a[i]=sc.nextInt();
		}
		
		for(int i=0; i<5; i++) {
			System.out.print(a[i]+" ");
			add+=a[i];
		}
		//System.out.println();
		System.out.println("\n Addition is :"+add);
	}

}

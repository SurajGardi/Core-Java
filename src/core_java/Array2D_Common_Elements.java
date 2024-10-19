package core_java;

import java.util.Scanner;

public class Array2D_Common_Elements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		int[] a= {10,20,30,40,50};
		int[] b= {10,40,70,30,80};
		
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a.length; j++) {
				if(a[i]==b[j]) {
					System.out.println("Common Elements :" + a[i]);
					break;
				}
			}
		}
		
	}

}

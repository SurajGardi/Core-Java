package core_java;

import java.util.Arrays;

public class ArrayAscending_Desending {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a = {20,60,50,80,20,90,10};
		System.out.println(Arrays.toString(a));
			
			Arrays.sort(a);		//here we use inbuild functon named as Arrays.sort() to sort array Ascendingly..
			System.out.println("Array in Ascending order :" + Arrays.toString(a));
 
	}

}

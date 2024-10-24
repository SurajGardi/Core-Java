package core_java;

import java.util.Scanner;

public class fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int count,a=0,b=1,c;
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter count:");
      count=sc.nextInt();
      for(int i=1;i<=count;i++)
      {
    	  System.out.print(a+" ");
    	  c=a+b;
    	  a=b;
    	  b=c;
    	  
    	  
      }
	}

}

package core_java;

import java.util.Scanner;

public class profit_loss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//prog for calculatig profit or loss..
		
		
//		int cp=100;
//		int sp=120;
//		
//		if(sp > cp) {
//			System.out.println("Profit");
//		}
//		else {
//			System.out.println("Loss");
//		}
		
		int cp,sp;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter Cost Price :");
		cp=sc.nextInt();
		System.out.print("Enter Selling Price :");
		sp=sc.nextInt();

		if(sp > cp) {
			int profit=sp-cp;
			System.out.println("Profit of : "+profit+" Rs ");
		}
		else {
			int loss=cp-sp;
			System.out.println("Loss of : "+loss+" Rs ");
		}
	}

}

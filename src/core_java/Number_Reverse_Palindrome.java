package core_java;

import java.util.Scanner;

public class Number_Reverse_Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num = scanner.nextInt();
		int originalNum = num;
		int reverse = 0;

		while (num > 0) {
			int digit = num % 10;	//123 % 10  //12%10	//1%10
			reverse = reverse * 10 + digit;	//0*10+3=0	//3*10+2=32	//32*10+1=321
			num /= 10;	//123/10=12	//12/10=1
		}

		System.out.println("Original Number is : " + originalNum);
		System.out.println("Reversed Number is : " + reverse);

		if (originalNum == reverse) {
			System.out.println("Number is Palindrome");
		} else {
			System.out.println("Number is NOT Palindrome");
		}

	}

}

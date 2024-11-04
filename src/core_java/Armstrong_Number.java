package core_java;

import java.util.Scanner;

public class Armstrong_Number {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        int originalNumber = number;
        int result = 0;
        int n = String.valueOf(number).length();  // Get the number of digits
        
        while (number != 0) {
            int digit = number % 10;
            result += Math.pow(digit, n);  // Raise the digit to the power of n and add to result
            number /= 10;
        }
        
        if (result == originalNumber) {
            System.out.println(originalNumber + " is an Armstrong number.");
        } else {
            System.out.println(originalNumber + " is not an Armstrong number.");
        }
        
        scanner.close();
    }
}

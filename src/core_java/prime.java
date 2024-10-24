package core_java;

import java.util.Scanner;

public class prime {

    public static void main(String[] args) {
        int n;
        boolean isPrime = true;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        n = sc.nextInt();

        if (n <= 1) {
            isPrime = false; // Numbers less than or equal to 1 are not prime
        } else {
            // Check divisibility from 2 to n-1
            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    isPrime = false; // n is divisible by i, so it's not prime
                    break;
                }
            }
        }

        if (isPrime) {
            System.out.println(n + " is a prime number.");
        } else {
            System.out.println(n + " is not a prime number.");
        }

        sc.close();
    }
}

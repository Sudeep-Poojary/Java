// Write a function that calculates the Greatest Common Divisor of 2 numbers

import java.util.Scanner;

public class Lecture8_3 {

    public static int calculateGcd(int n1, int n2) {
        int gcd = 1;

        for (int i = 1; i <= n1 && i <= n2; i++) {

            if (n1 % i == 0 && n2 % i == 0) {
                gcd = i;
            }
        }

        System.out.println("The GCD of " + n1 + " and " + n2 + " is: " + gcd);

        return gcd;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int n1 = sc.nextInt();

        System.out.print("Enter the second number: ");
        int n2 = sc.nextInt();

        calculateGcd(n1, n2);
    }
}

// Write a function to print the sum of all odd and even numbers from 1 to n

import java.util.Scanner;

public class Lecture8_5 {

    public static int oddSum(int n) {
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                sum = sum + i;
            }
        }

        System.out.println("The sum of all odd numbers from 1 to " + n + " is: " + sum);
        return sum;
    }

    public static int evenSum(int n) {
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                sum = sum + i;
            }
        }

        System.out.println("The sum of all odd numbers from 1 to " + n + " is: " + sum);
        return sum;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n numbers: ");
        int n = sc.nextInt();

        oddSum(n);
        evenSum(n);
    }
}

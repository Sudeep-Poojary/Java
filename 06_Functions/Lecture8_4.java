// Write a program to print Fibonacci series of n terms where n is input by user 

import java.util.Scanner;

public class Lecture8_4 {

    public static void calcFibonacci(int n) {
        int n1 = 0, n2 = 1, n3;
        System.out.print(n1 + " " + n2);

        for (int i = 2; i <= n; i++) {
            n3 = n1 + n2;
            System.out.print(" " + n3);

            n1 = n2;
            n2 = n3;
        }

        return;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of terms: ");
        int n = sc.nextInt();

        calcFibonacci(n);
    }
}
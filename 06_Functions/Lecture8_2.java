// Two numbers are entered by the user, x and n. Write a function to find the value of one number raised to the power of another

import java.util.Scanner;

public class Lecture8_2 {

    public static double calculateValue(double x, double n) {
        double value = Math.pow(x, n);
        System.out.println("The Value of " + x + " raised to the power " + n + " is: " + value);
        return value;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number (x): ");
        int x = sc.nextInt();

        System.out.print("Enter the power (n): ");
        int n = sc.nextInt();

        calculateValue(x, n);
    }
}

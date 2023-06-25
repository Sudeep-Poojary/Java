// Check if the  entered number is even

import java.util.*;

public class Lecture7_4 {

    public static void checkEven(int n) {
        if (n % 2 == 0) {
            System.out.println("It is an even number");
        } else {
            System.out.println("It is not an even number");
        }
        return;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        checkEven(n);
    }
}

import java.util.*;

public class Lecture7_3 {

    public static void printFactorial(int n) {
        if (n < 0) {
            System.out.println("Invalid Number");
            return;
        } else {
            int factorial = 1;

            for (int i = n; i >= 1; i--) {
                factorial = factorial * i;
            }

            System.out.println(factorial);
            return;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        printFactorial(n);
    }
}

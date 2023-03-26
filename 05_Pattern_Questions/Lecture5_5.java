import java.util.Scanner;

// Inverted half pyramid  (rotated by 180 deg)

public class Lecture5_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // outter loop
        for (int i = 1; i <= n; i++) {

            // inner loop --> print spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }

            // inner loop --> print stars
            for (int j = 1; j <= i; j++) {
                System.out.print(" *");
            }

            System.out.println();
        }
    }
}

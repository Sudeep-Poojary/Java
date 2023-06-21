// Palindromic Number Pyramid

public class Lecture5_12 {
    public static void main(String[] args) {

        int n = 5;

        // outter loop
        for (int i = 1; i <= n; i++) {

            // inner loop

            // spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }

            // first part
            for (int j = i; j >= 1; j--) {
                System.out.print(j + " ");
            }

            // second part
            for (int j = 2; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}

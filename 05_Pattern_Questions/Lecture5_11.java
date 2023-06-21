// Number Pyramid

public class Lecture5_11 {
    public static void main(String[] args) {
        int n = 5;

        // outter loop
        for (int i = 1; i <= n; i++) {

            // inner loop --> spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // inner loop --> stars
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}

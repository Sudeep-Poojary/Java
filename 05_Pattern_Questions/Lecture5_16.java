// Hollow Rhombus

public class Lecture5_16 {
    public static void main(String[] args) {
        int n = 5;

        // Outter Loop
        for (int i = 1; i <= n; i++) {

            // Inner Loop

            // Spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }

            // Stars
            for (int j = 1; j <= n; j++) {

                if (i == 1 || j == 1 || i == n || j == n) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }

            System.out.println();
        }
    }
}

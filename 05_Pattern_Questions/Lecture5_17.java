// Inverted half pyramid with numbers 2

public class Lecture5_17 {
    public static void main(String[] args) {
        int n = 4;

        // Outter Loop
        for (int i = 1; i <= n; i++) {

            // Inner Loop
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
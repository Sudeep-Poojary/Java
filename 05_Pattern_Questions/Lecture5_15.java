// Hollow Butterfly

public class Lecture5_15 {

    public static void main(String[] args) {
        int n = 5;

        // Upper Half

        for (int i = 1; i <= n; i++) {

            // 1st part
            for (int j = 1; j <= i; j++) {

                if (i == 1 || j == 1 || j == i) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }

            // Spaces
            int spaces = 2 * (n - i);
            for (int j = 1; j <= spaces; j++) {
                System.out.print("  ");
            }

            // 2nd part
            for (int j = 1; j <= i; j++) {
                if (i == 1 || j == 1 || j == i) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }

            System.out.println();
        }

        // Lower Half

        for (int i = n; i >= 1; i--) {

            // 1st part
            for (int j = 1; j <= i; j++) {

                if (i == 1 || j == 1 || j == i) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }

            // Spaces
            int spaces = 2 * (n - i);
            for (int j = 1; j <= spaces; j++) {
                System.out.print("  ");
            }

            // 2nd part
            for (int j = 1; j <= i; j++) {
                if (i == 1 || j == 1 || j == i) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }

            System.out.println();
        }

    }

}

import java.util.Scanner;

public class KeybRead {
    public static void main(String[] args) {

        // For Integer
        int a, b, c;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Two nos.");
        a = s.nextInt();
        b = s.nextInt();
        c = a + b;
        System.out.println("Sum is " +c);

    }
}

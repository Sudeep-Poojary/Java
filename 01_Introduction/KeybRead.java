import java.util.Scanner;

public class KeybRead {
    public static void main(String[] args) {

        // For Integer and String
        String name;
        int a, b, c;

        Scanner s = new Scanner(System.in);

        System.out.print("Enter Your Name: ");
        name = s.nextLine();
        

        System.out.print("Enter Two nos.: ");
        a = s.nextInt();
        b = s.nextInt();
        c = a + b;

        System.out.println("Welcome "+ name);
        System.out.println("Sum is " +c);

    }
}

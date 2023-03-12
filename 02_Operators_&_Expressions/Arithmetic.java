import java.util.Scanner;

public class Arithmetic {
    public static void main(String args[]) {
        int num1, num2, add, sub, mul, div, mod;

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the first no.: ");
        num1 = scan.nextInt();

        System.out.print("Enter the second no.: ");
        num2 = scan.nextInt();

        add = num1 + num2;
        sub = num1 - num2;
        mul = num1 * num2;
        div = num1 / num2;
        mod = num1 % num2;

        System.out.println("--------------------------------------------------");
        System.out.println("Addition of " +num1+ " and " +num2+ " is " +add);
        System.out.println("Subtraction of " +num1+ " and " +num2+ " is "+sub);
        System.out.println("Multiplication of " +num1+ " and " +num2+ " is "+mul);
        System.out.println("Division of " +num1+ " and " +num2+ " is " +div);
        System.out.println("Modulus of " +num1+ " and " +num2+ " is " +mod);

    }
}

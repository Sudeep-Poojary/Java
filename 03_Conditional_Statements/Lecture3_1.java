import java.util.Scanner;

public class Lecture3_1 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first no.: ");
        int a = sc.nextInt();

        System.out.print("Enter the second no.: ");
        int b = sc.nextInt();

        System.out.println("Choose any no.:-");
        System.out.println("Press 1 to calculate Addition.");
        System.out.println("Press 2 to calculate Subtraction.");
        System.out.println("Press 3 to calculate Multiplication.");
        System.out.println("Press 4 to calculate Division.");
        System.out.println("Press 5 to calculate Modulus.");

        int cal = sc.nextInt();
        switch(cal) {

            case 1 : System.out.println("Addition of " +a+ " and " +b+ " is " +(a+b));
            break;

            case 2 : System.out.println("Subtraction of " +a+ " and " +b+ " is " +(a-b));
            break;

            case 3 : System.out.println("Multiplicaton of " +a+ " and " +b+ " is " +(a*b));
            break;

            case 4 : System.out.println("Division of " +a+ " and " +b+ " is " +(a/b));
            break;

            case 5 : System.out.println("Modulus of " +a+ " and " +b+ " is " +(a%b));
            break;

            default : System.out.println("Invalid Choice");
        }
    }
}
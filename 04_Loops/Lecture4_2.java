import java.util.Scanner;

public class Lecture4_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("-----------------------------------------------");

        System.out.println("Select any one from 0 and 1:-");
        System.out.println("1. Enter Marks of a student outoff 100.");
        System.out.println("0. Terminate the process.");

        System.out.println("-----------------------------------------------");

        System.out.print("Enter your Choice: ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.print("Enter Marks of a student outoff 100: ");
                int marks = sc.nextInt();

                if (marks >= 90){
                    System.out.println("This is Good");
                }
                else if (89 >= marks && marks >= 60){
                    System.out.println("This is also Good");
                }
                else {
                    System.out.println("This is Good as well");
                }
                break;

            case 0:
                System.out.println("Thank You! You have successfully terminated the process");
                break;
        
            default:
                System.out.println("Invalid Choice");
                break;
        }
    }
}

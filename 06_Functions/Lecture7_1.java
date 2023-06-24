import java.util.*;

public class Lecture7_1 {

    public static void printMyName(String name) {
        System.out.println("Hello " + name);
        return;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = sc.next();

        printMyName(name);
    }
}
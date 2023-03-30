import java.util.Scanner;

// Inverted half pyramid with numbers

public class Lecture5_7 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        //outter loop
        for (int i = 1; i <= n; i++){

            //inner loop
            for (int j = 1; j <= (n-i+1); j++){
                System.out.print(j+" ");
            }

            System.out.println();
        }
    }
}

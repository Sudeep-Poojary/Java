import java.util.Scanner;

// Half pyramid with numbers

public class Lecture5_6 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        //outter loop
        for (int i=1; i<=n; i++){

            //inner loop
            for (int j=1; j<=i; j++){
                System.out.print(j+" ");
            }

        System.out.println();
        }
    }
}

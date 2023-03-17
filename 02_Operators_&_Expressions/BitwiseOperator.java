public class BitwiseOperator {
    public static void main(String[] args) {
        int x = 10, y = 6, z, a, b, c;

         z = x & y;
         a = x | y;
         b = x ^ y;
         c = ~ x;
         
         System.out.println(z);
         System.out.println(a);
         System.out.println(b);
         System.out.println(c);
    }
}

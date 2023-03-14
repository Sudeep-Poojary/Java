public class IncDec {
    public static void main(String[] args) {
        int x = 5, y, z, a = 10, b, c;

        y = x++;

        z = ++x;

        System.out.println(y);
        System.out.println(z);

        b = a--;

        c = --a;

        System.out.println(b);
        System.out.println(c);

    }
}

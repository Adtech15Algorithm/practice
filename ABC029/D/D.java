import java.util.Arrays;
import java.util.Scanner;

public class D {

    long[] pow;

    void run() {
        Scanner sc = new Scanner(System.in);
        long v = sc.nextInt();

        pow = new long[20];
        pow[0] = 1L;
        for (int i = 1; i < 20; i++) pow[i] = pow[i-1] * 10L;

        long c = 0;
        for (int i = 1; i < 15; i++) {
            c += countOne(i, v);
        }
        System.out.println(c);
    }

    long countOne(int i, long v) {
        long c = v / pow[i];
        long q = v % pow[i];

        if (q < pow[i-1]) return c * pow[i-1];
        if (q < 2 * pow[i-1]) return c * pow[i-1] + q - pow[i-1] + 1;
        return c * pow[i-1] + pow[i-1];
    }

    void debug(Object...os) {
        System.err.println(Arrays.deepToString(os));
    }

    public static void main(String[] args) {
        new D().run();
    }
}

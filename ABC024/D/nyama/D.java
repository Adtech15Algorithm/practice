import java.util.*;

import static java.util.Arrays.*;
import static java.util.Collections.*;
import static java.lang.Math.*;


public class Main {

    long MOD = (long)1e9 + 7;

    void run() {
        Scanner sc = new Scanner(System.in);

        long A = sc.nextInt(), B = sc.nextInt(), C = sc.nextInt();

        long c = ((B * C) % MOD - (A * B) % MOD + MOD) % MOD;

        long ci = (((A * C) % MOD - (B * C) % MOD + MOD) % MOD + (A * B) % MOD) % MOD;

        long r = ((B * C) % MOD - (A * C) % MOD + MOD) % MOD;

        long ri = (((A * B) % MOD - (B * C) % MOD + MOD) % MOD + (A * C) % MOD) % MOD;

        System.out.println((r * inv(ri)) % MOD + " " + (c * inv(ci)) % MOD);


    }

    long inv(long x) {
        long a = MOD - 2;
        long ret = 1;

        while (a > 0) {
            if (a % 2 == 0) {
                x = (x * x) % MOD;
                a /= 2;
            }
            else {
                ret = (ret * x) % MOD;
                a--;
            }
        }
        return ret;
    }

    void debug(Object...os) {
        System.err.println(deepToString(os));
    }

    public static void main(String[] args) {
        new Main().run();
    }
}

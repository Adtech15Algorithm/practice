
import java.util.*;

import static java.util.Arrays.*;
import static java.util.Collections.*;
import static java.lang.Math.*;

public class C {

    long N;

    void run() {
        Scanner sc = new Scanner(System.in);

        N = sc.nextLong();

        int depth = 0;
        for (long n = N; n > 0; n /= 2, depth++) {
            ;
        }

        long v = 1;
        long[] add = (depth % 2 == 0 ? new long[] {0, 1} : new long[] {1, 0});
        int l = 0;
        for (; v <= N; l++) {
            v = v * 2L + add[l % 2];
        }

        debug(depth, l);
        String[] ans = {"Takahashi", "Aoki"};
        System.out.println(ans[l % 2]);
    }

    void debug(Object... os) {
        System.err.println(deepToString(os));
    }

    public static void main(String[] args) {
        new C().run();
    }
}

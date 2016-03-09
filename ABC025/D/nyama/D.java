import java.util.*;

import static java.util.Arrays.*;

public class Main {
    int[] position;
    Map<Integer, Long> mem;
    static final long MOD = 1000000007L;

    void run() {
        Scanner sc = new Scanner(System.in);

        position = new int[25];

        fill(position, -1);
        mem = new HashMap<>();

        for (int i = 0; i < 25; i++) {
            int v = sc.nextInt() - 1;
            if (v >= 0) position[v] = i;
        }


        System.out.println(solve(0));
    }

    long solve(int S) {
//        debug(Integer.toString(S, 2));
        if (mem.containsKey(S)) return mem.get(S);

        int bc = Integer.bitCount(S);
        if (bc == 25) {
            return 1;
        }
        if (position[bc] >= 0) {
            mem.put(S, ok(S, position[bc]) ? solve(S|(1<< position[bc])) : 0);
            return mem.get(S);
        }

        long sum = 0;
        for (int i = 0; i < 25; i++) if (ok(S, i)) {
            sum = (sum + solve(S|(1<<i))) % MOD;
        }
        mem.put(S, sum);
        return sum;
    }

    boolean ok(int S, int k) {
        if (((S>>k)&1) == 1)
            return false;

        if (k % 5 != 0 && k % 5 != 4 && ((S>>(k-1))&1) != ((S>>(k+1))&1))
            return false;

        if (5 <= k && k < 20 && ((S>>(k-5))&1) != ((S>>(k+5))&1))
            return false;

        return true;
    }

    void debug(Object...os) {
        System.err.println(deepToString(os));
    }

    public static void main(String[] args) {
        new Main().run();
    }
}

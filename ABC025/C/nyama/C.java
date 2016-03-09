import java.util.*;

import static java.util.Arrays.*;
import static java.util.Collections.*;
import static java.lang.Math.*;


public class Main {

    int[][] b, c;
    int sum;

    void run() {
        Scanner sc = new Scanner(System.in);

        b = new int[3][2];
        c = new int[2][3];
        sum = 0;

        for (int i = 0; i < 2; i++)
            for (int j = 0; j < 3; j++) {
                b[j][i] = sc.nextInt();
                sum += b[j][i];
            }

        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 2; j++) {
                c[j][i] = sc.nextInt();
                sum += c[j][i];
            }

        int ans = negaMax(new int[3][3], -1, 0);
        System.out.println((sum - ans));
        System.out.println(ans);
    }

    int negaMax(int[][] m, int x, int p) {

        if (p == 9) {
            return calc(m);
        }
        int max = 0;
        for (int i = 0; i < 3; i++) for (int j = 0; j < 3; j++) if (m[i][j] == 0) {
            m[i][j] = x;
            max = max(max, negaMax(m, -1 * x, p + 1));
            m[i][j] = 0;
        }

        return sum - max;
    }

    int calc(int[][] m) {
        int ret = 0;
        for (int i = 0; i < 2; i++)
            for (int j = 0; j < 3; j++) {
                ret += m[i][j] == m[i + 1][j] ? b[j][i] : 0;
                ret += m[j][i] == m[j][i + 1] ? c[i][j] : 0;
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

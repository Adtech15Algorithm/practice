import java.util.*;
import java.io.*;
import static java.util.Arrays.*;
import static java.util.Collections.*;
import static java.lang.Math.*;

public class Main {

	int INF = 1 << 28;
	//long INF = 1L << 62;
	double EPS = 1e-10;

	void run() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), d = sc.nextInt(), k = sc.nextInt();
		int[] l = new int[d], r = new int[d];
		int[] s = new int[k], t = new int[k];

		for (int i = 0; i < d; i++) {
			l[i] = sc.nextInt(); r[i] = sc.nextInt();
		}

		for (int i = 0; i < k; i++) {
			s[i] = sc.nextInt(); t[i] = sc.nextInt();
		}

		for (int i = 0; i < k; i++) {
			int fr, to;
			fr = to = s[i];
			int j;
			for (j = 0; j < d; j++) {
				if (fr <= t[i] && t[i] <= to) break;
				if (to < l[j] || r[j] < fr) continue;
				fr = min(fr, l[j]);
				to = max(to, r[j]);
			}
			System.out.println(j);
		}
	}

	void debug(Object... os) {
		System.err.println(Arrays.deepToString(os));
	}

	public static void main(String[] args) {
		new Main().run();
	}
}

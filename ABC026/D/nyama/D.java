import java.util.*;
import java.io.*;
import static java.util.Arrays.*;
import static java.util.Collections.*;
import static java.lang.Math.*;

public class Main {

	int INF = 1 << 28;
	//long INF = 1L << 62;
	double EPS = 1e-8;
	double a, b, c;

	void run() {
		Scanner sc = new Scanner(System.in);
		a = sc.nextDouble(); b = sc.nextDouble(); c = sc.nextDouble();
		double d = 2.0 / c;

		double l = (100.0 / a);
		int x = (int)(l / d);

//		debug(f(l), f(d * x), f(d * (x + 1)));
		double t = max(max(binSearch(d * x, d * (x + 0.25)), binSearch(d * (x + 0.25), d * (x + 0.50))),
				max(binSearch(d * (x + 0.50), d * (x + 0.75)), binSearch(d * (x + 0.75), d * (x + 1.0))));
		System.out.println(t);
//		debug(f(t));

	}

	double binSearch(double l, double r) {
		if (f(l) - 100.0 < EPS && f(r) - 100.0 < EPS) return -1.0;
		if (f(l) - 100.0 > EPS && f(r) - 100.0 > EPS) return -1.0;
		if (f(l) - f(r) > 0) return binSearch(r, l);
		for (;abs(f(l) - 100.0) > EPS;) {
//			debug(f(l), f(r));
			double c = (l + r) / 2;
			if (f(c) - 100.0 > EPS) r = c;
			else l = c;
		}
//		debug(f(l));
		return l;
	}

	double f(double t) {
		return t * a + 1.0 * b * sin(t * c * PI);
	}

	void debug(Object... os) {
		System.err.println(Arrays.deepToString(os));
	}

	public static void main(String[] args) {
		new Main().run();
	}
}

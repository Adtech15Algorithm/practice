import java.util.LinkedList;
import java.util.Scanner;

import static java.util.Arrays.*;

public class C {

    public void run() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();
        long x = sc.nextLong(), y = sc.nextLong();
        long[] a = new long[n];
        long[] b = new long[m];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextLong();
        }

        for (int i = 0; i < m; i++) {
            b[i] = sc.nextLong();
        }

        int pa = 0, pb = 0;
        long t = 0, c = 0;

        for (;;) {
            while (pa < n && t > a[pa]) pa++;
            if (pa < n) {
                t = a[pa] + x;
                pa++;
            } else {
                break;
            }
            while (pb < m && t > b[pb]) pb++;
            if (pb < m) {
                t = b[pb] + y;
                pb++;
            } else {
                break;
            }
            c++;
        }

        System.out.println(c);

    }

    public void run2() {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(), m = sc.nextInt();
        int x = sc.nextInt(), y = sc.nextInt();

        LinkedList<Integer> a = new LinkedList<>(), b = new LinkedList<>();

        for (int i = 0; i < n; i++) a.add(sc.nextInt());
        for (int i = 0; i < m; i++) b.add(sc.nextInt());

        int t = 0, cnt = 0;
        for (;;) {
            while (!a.isEmpty() && a.getFirst() < t) a.remove();
            if (a.isEmpty()) break;
            t = a.removeFirst() + x;

            while (!b.isEmpty() && b.getFirst() < t) b.remove();
            if (b.isEmpty()) break;
            t = b.removeFirst() + y;

            cnt++;
        }
        System.out.println(cnt);
    }

    public void debug(Object...os) {
        System.out.println(deepToString(os));
    }

    public static void main(String[] args) {
        new C().run2();
    }
}

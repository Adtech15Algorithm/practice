import java.util.*;

import static java.util.Arrays.*;
import static java.util.Collections.*;


public class C {
    void run() {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[5];

        for (int i = 0; i < 5; i++) {
            a[i] = sc.nextInt();
        }

        Set<Integer> s = new HashSet<>();

        for (int i = 0; i < 5; i++) for (int j = i + 1; j < 5; j++) for (int k = j + 1; k < 5; k++)
            s.add(a[i] + a[j] + a[k]);

        List<Integer> b = new ArrayList<>(s);
        sort(b);
        System.out.println(b.get(b.size() - 3));
    }

    void debug(Object...os) {
        System.err.println(deepToString(os));
    }

    public static void main(String[] args) {
        new C().run();
    }
}

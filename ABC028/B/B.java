import java.util.*;

public class B {
    void run() {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        int[] a = new int[6];

        for (char c : s.toCharArray()) {
            a[c - 'A']++;
        }
        for (int i = 0; i < 6; i++) {
            System.out.print(a[i] + (i == 5 ? "\n" : " "));
        }
    }

    void debug(Object...os) {

    }

    public static void main(String[] args) {
        new B().run();
    }
}

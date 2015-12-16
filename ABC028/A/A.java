
import java.util.*;

import static java.util.Arrays.*;


public class A {
    void run() {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        debug(n);
        if (n < 60) {
            System.out.println("Bad");
        }
        else if (n < 90) {
            System.out.println("Good");
        }
        else if (n < 100) {

            System.out.println("Great");
        }
        else {
            System.out.println("Perfect");
        }
    }

    void debug(Object...os) {
        System.err.println(deepToString(os));
    }

    public static void main(String[] args) {
        new A().run();
    }
}

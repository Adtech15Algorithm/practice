import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static java.util.Arrays.*;
import static java.util.Collections.*;
import static java.lang.Math.*;
import static java.util.stream.Collectors.*;

public class Main {
    void run() {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextByte();

        Map<Integer, List<Integer>> collect = IntStream.range(1, n)
            .mapToObj(i -> i)
            .collect(groupingBy(i -> sc.nextInt() - 1, toList()));

        System.out.println(value(collect, 0));
    }

    private int value(final Map<Integer, List<Integer>> m, int p) {
        return Optional.ofNullable(m.get(p))
            .map(l -> l.stream()
                .map(i -> value(m, i))
                .collect(toList()))
            .map(l -> Collections.min(l) + Collections.max(l) + 1)
            .orElse(1);
    }

    void debug(Object...os) {
        System.err.println(deepToString(os));
    }

    public static void main(String[] args) {
        new Main().run();
    }
}

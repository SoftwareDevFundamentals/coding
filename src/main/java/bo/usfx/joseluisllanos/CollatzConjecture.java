package bo.usfx.joseluisllanos;

import java.util.stream.Stream;

public final class CollatzConjecture {
    private CollatzConjecture() {
    }

    public static int hotpo(final int n) {
        //iterate(seed, condition, Generated function)
        return (int) Stream.iterate(n, x -> x != 1, x -> (x % 2 == 0) ? x / 2 : 3 * x + 1).count();
    }
}



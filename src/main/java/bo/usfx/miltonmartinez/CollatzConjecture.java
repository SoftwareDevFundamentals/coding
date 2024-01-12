package bo.usfx.miltonmartinez;

public final class CollatzConjecture {

    private CollatzConjecture() {}

    public static int hotpo(final int initialN) {

        int n = initialN;
        int count = 0;

        while (n != 1) {
            if (n % 2 == 0) {
                n = n / 2;
            } else {
                n = 3 * n + 1;
            }
            count++;
        }

        return count;
    }
}

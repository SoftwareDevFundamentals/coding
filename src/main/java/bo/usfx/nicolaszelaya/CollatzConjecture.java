package bo.usfx.nicolaszelaya;

public final class CollatzConjecture {

    private CollatzConjecture() {

    }

    public static int hotpo(final int n) {
        int counter = 0;
        int temporal = n;
        while (temporal != 1) {
            if (temporal % 2 == 0) {
                temporal = temporal / 2;
            } else {
                temporal = 3 * temporal + 1;
            }
            counter++;
        }
        return counter;
    }
}

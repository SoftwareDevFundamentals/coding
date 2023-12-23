package bo.usfx.assignment3;

public final class  CollatzConjecture {
    private CollatzConjecture() {

    }
    public static int hotpo(final int n) {
        int steps = 0;
        int val = n;
        while (val != 1) {
            if (val % 2 == 0) {
                val = val / 2;
            } else {
                val = 3 * val + 1;
            }
            steps++;
        }
        return steps;
    }
}
package bo.usfx.waltervaquera;

public final class CollatzConjecture {

    private CollatzConjecture() {
    }

    public static int hotpo(final int n) {
        int num = n;
        int steps = 0;
        while (num != 1) {
            num = num % 2 == 0 ? num / 2 : 3 * num + 1;
            steps++;
        }
        return steps;
    }
}

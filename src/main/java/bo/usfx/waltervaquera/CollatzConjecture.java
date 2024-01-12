package bo.usfx.waltervaquera;

public final class CollatzConjecture {

    private CollatzConjecture() {
    }

    public static int steps(final int n) {
        int number = n;
        int steps = 0;
        while (number != 1) {
            number = number % 2 == 0 ? number / 2 : 3 * number + 1;
            steps++;
        }
        return steps;
    }
}

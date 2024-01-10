package bo.usfx.assignment03;

public final class CollatzC {

    private CollatzC() { }
    public static int hotpo(final int number) {

        int n = number;
        int steps = 0;

        while (n != 1) {
            if (n % 2 == 0) {
                n = n / 2;
            } else {
                n = 3 * n + 1;
            }
            steps++;
        }

        return steps;
    }

}

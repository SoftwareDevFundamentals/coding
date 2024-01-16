package bo.usfx.armando;

public final class Collatz {
    private Collatz() { }

    public static int hotpo(final int n) {
        int number = n;
        int count = 0;

        while (number != 1) {
            if (number % 2 == 0) {
                number = number / 2;
            } else {
                number = 3 * n + 1;
            }
            count++;
        }

        return count;
    }
}

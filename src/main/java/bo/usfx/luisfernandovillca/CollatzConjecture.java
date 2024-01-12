package bo.usfx.luisfernandovillca;

public final class CollatzConjecture {
    private CollatzConjecture() {
    }

    public static int collatz(final int n) {
        int count = 0;
        int number = n;
        while (number != 1) {
            if (number % 2 == 0) {
                number = number / 2;
            } else {
                number = 3 * number + 1;
            }
            count++;
        }
        return count;
    }
}

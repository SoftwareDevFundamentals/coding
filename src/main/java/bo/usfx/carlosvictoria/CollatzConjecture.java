package bo.usfx.carlosvictoria;

public final class CollatzConjecture {

    private CollatzConjecture() {

    }

    public static int hotpo(final int n) {

        int countOpe = 0;
        int number = n;

        while (number != 1) {
            if (number % 2 == 0) {
                number = number / 2;
                countOpe++;
            } else {
                number = 3 * number + 1;
                countOpe++;
            }
        }
        return countOpe;
    }
}

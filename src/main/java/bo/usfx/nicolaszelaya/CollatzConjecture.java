package bo.usfx.nicolaszelaya;

public final class CollatzConjecture {

    private CollatzConjecture() {

    }

    /**
     * Calculates the number of steps needed to reach 1 in the Collatz conjecture.
     *
     * @param n The starting number for the Collatz sequence.
     * @return The number of steps required to reach 1.
     */
    public static int hotpo(final int n) {
        int counter = 0;
        int temporalValue = n;
        while (temporalValue != 1) {
            if (temporalValue % 2 == 0) {
                temporalValue = temporalValue / 2;
            } else {
                temporalValue = 3 * temporalValue + 1;
            }
            counter++;
        }
        return counter;
    }
}

package bo.usfx.charlyterrazas;

public final class CollatzConjecture {

    private CollatzConjecture() {
    }

    public static int hotpo(final int number) {
        int steps = 0;
        int temp = number;

        while (temp > 1) {
            steps += 1;

            if (temp % 2 == 0) {
                temp = temp / 2;
            } else {
                temp = temp * 3 + 1;
            }
        }
        return steps;
    }
}

package bo.usfx.fernanda_flores;
public final class CollatzConjecture {
    private CollatzConjecture() {
    }

    public static int hotpo(final int num) {
        int count = 0;
        int n = num;
        while (n != 1) {
            if (n % 2 == 0) {
                n = n / 2;
                count++;
            } else {
                n = 3 * n + 1;
                count++;
            }
        }
        return count;
    }
}

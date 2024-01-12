package bo.usfx.samuelamonzabel;

public final class CollatzConjecture {

    private CollatzConjecture() {
    }

    public static int hotpo(final int n) {
        int count = 0;
        int id = n;
        while (id != 1) {
            id = id % 2 == 0 ? id / 2 : 3 * id + 1;
            count++;
        }
        return count;
    }
}

package bo.usfx.brayanzuniga;

public final class CollatzConjecture {
    private CollatzConjecture() {

    }

    public static int hotpo(final int n) {
        int temp = n;
        int cont = 0;
        while (temp > 1) {
            cont += 1;
            if (temp % 2 == 0) {
                temp = temp / 2;
            } else {
                temp = temp * 3 + 1;
            }

        }
        return cont;
    }
}

package bo.usfx.assignment03;

public final class CollatzC {
    private CollatzC() {

    }

    public static int hotpo(final int number) {

        int cont = 0;
        int n = number;
        boolean one = false;
        while (!one) {
            if (n == 1) {
                one = true;

            } else if (n % 2 == 0) {
                n = n / 2;
                cont++;
            } else {
                n = 3 * n + 1;
                cont++;
            }
        }
        return cont;
    }


}

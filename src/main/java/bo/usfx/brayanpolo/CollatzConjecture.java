package bo.usfx.brayanpolo;
public final class CollatzConjecture {
    private  CollatzConjecture() {

    }
    public static int hotpo(final int  n) {
        int numero = n;
        int times = 0;

        while (numero != 1) {
            if (numero % 2 == 0) {
                numero /= 2;
            } else {
                numero = numero * 3 + 1;
            }
            times += 1;
        }
        return times;
    }
}

package bo.usfx.exampletdd;

public final class GrassHopper {

    private GrassHopper() {

    }

    public static int summation(final int n) {
        int sumaTotal = 0;

        for (int i = 1; i <= n; i++) {
            sumaTotal += i;
        }

        return sumaTotal;
    }
}

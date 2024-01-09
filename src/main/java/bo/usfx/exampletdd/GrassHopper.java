package bo.usfx.exampletdd;

public final class GrassHopper {

    private GrassHopper() {

    }

    /**
     * Funcion que recibe un numero y devuelve la suma total.
     * @param n numero del que se hará la suma total
     * @return Resultado de la sumaTotal
     * */
    public static int summation(final int n) {
        int sumaTotal = 0;

        for (int i = 1; i <= n; i++) {
            sumaTotal += i;
        }

        return sumaTotal;
    }
}

/**
 * Este paquete contiene la clase Example,que
 * proporciona métodos para realizar operaciones de suma.
 */
package bo.usfx;

import java.util.stream.IntStream;

public final class Example {

    private Example() {

    }

    /**
     * Calcula la suma de los números desde 1 hasta n (inclusive).
     *
     * @param n El número hasta el cual se desea calcular la suma.
     * @return La suma de los números desde 1 hasta n.
     */
    public static int summation(final int n) {
        return IntStream.range(1, n + 1).sum();
    }
}

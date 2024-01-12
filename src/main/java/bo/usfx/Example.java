/**
 * Este paquete contiene la clase Example,que
 * proporciona métodos para realizar operaciones de suma.
 */
package bo.usfx;

import java.util.stream.IntStream;

public final class Example {

  private Example() {

  }

  public static int summation(final int n) {
    return IntStream.range(1, n + 1).sum();
  }
}

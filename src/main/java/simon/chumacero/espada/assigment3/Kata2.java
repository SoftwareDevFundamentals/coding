package simon.chumacero.espada.assigment3;

public final class Kata2 {

  /**
   * Constante de la conjetura Collatz.
   * */
  private static final int CONSTANT_3 = 3;




  private Kata2() {

  }

  /**
   * Calcula el numero de pasos en la secuencia para un numero dado.
   *
   * @param n es el numero de pasos para el que se calculará la secuencia
   * @return Número de pasos en la secuencia
   * */
  public static int hotpo(final int n) {
    int steps = 0;
    int currentNumber = n;

    while (currentNumber != 1) {
      if (currentNumber % 2 == 0) {
        currentNumber /= 2;
      } else {
        currentNumber = CONSTANT_3 * currentNumber + 1;
      }
      steps++;
    }

    return steps;
  }
}


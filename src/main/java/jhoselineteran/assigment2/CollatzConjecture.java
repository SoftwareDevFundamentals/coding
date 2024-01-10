package jhoselineteran.assigment2;

/**
 * Esta clase implementa la Conjetura de Collatz y proporciona un método para calcular
 * el número de pasos necesarios para llegar a 1 a partir de un número dado.
 */
public final class CollatzConjecture {

  private CollatzConjecture() {

  }
  /**
   * Calcula el número de pasos necesarios para llegar a 1 utilizando la Conjetura de Collatz.
   *
   * @param n El número de inicio.
   * @return El número de pasos necesarios.
     */

  private static int hotpo(int n) {
    int steps = 0;

    while (n != 1) {
      if (n % 2 == 0) {
        n /= 2;
      } else {
        n = 3 * n + 1;
      }
      steps++;
    }

    return steps;
  }

  /**
   * Método principal para probar la Conjetura de Collatz con algunos valores de inicio.
   *
   * @param args Los argumentos de la línea de comandos (no se utilizan en este caso).
   */
  public static void main(final String[] args) {
    System.out.println(hotpo(1));
    System.out.println(hotpo(5));
    System.out.println(hotpo(6));
    System.out.println(hotpo(23));
  }
}

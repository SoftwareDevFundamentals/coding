package bo.usfx.jhoselineteran;

/**
 * Esta clase implementa la Conjetura de Collatz
 * y proporciona un método para calcular
 * el número de pasos necesarios para
 * llegar a 1 a partir de un número dado.
 */
public final class CollatzConjecture {
  /**
   * Constante de la conjetura Collatz.
   */
  public static final int CONSTANT_3 = 3;

  /**
   * Logger para la clase CollatzConjecture.
   * Se utiliza para registrar mensajes y eventos.
   */
  private CollatzConjecture() {
    // Constructor privado para prevenir la instanciación de la clase.
  }

  /**
   * Calcula el número de pasos necesarios
   * para llegar a 1 utilizando la Conjetura de Collatz.
   *
   * @param n El número de inicio.
   * @return El número de pasos necesarios.
   */
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
    // Se utiliza format specifiers en lugar de concatenación
    return steps;
  }
}


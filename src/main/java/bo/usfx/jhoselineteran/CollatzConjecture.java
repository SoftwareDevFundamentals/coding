package bo.usfx.jhoselineteran;

import java.util.logging.Level;
import java.util.logging.Logger;

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
  public static final Logger LOGGER =
          Logger.getLogger(CollatzConjecture.class.getName());

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
    // Se utiliza format specifiers en lugar de concatenación
    LOGGER.log(Level.INFO, "Número de pasos para llegar a 1 desde {}: {}",
            new Object[]{n, steps});

    return steps;
  }

  /**
   * Método principal para probar la Conjetura
   * de Collatz con algunos valores de inicio.
   *
   * @param args Los argumentos de la
   *             línea de comandos (no se utilizan en este caso).
   */
  public static void main(final String[] args) {
    final int initialValue1 = 1;
    final int initialValue2 = 5;
    final int initialValue3 = 6;
    final int initialValue4 = 23;

    hotpo(initialValue1);
    hotpo(initialValue2);
    hotpo(initialValue3);
    hotpo(initialValue4);
  }
}

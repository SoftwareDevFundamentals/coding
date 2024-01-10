package jhoselineteran.assigment2;

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
  private static final int CONSTANT_3 = 3;

  // Se crea un logger para la clase CollatzConjecture
  private static final Logger logger = Logger.getLogger(CollatzConjecture.class.getName());

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

    // Se utiliza el logger en lugar de System.out
    logger.log(Level.INFO, String.valueOf(hotpo(initialValue1)));
    logger.log(Level.INFO, String.valueOf(hotpo(initialValue2)));
    logger.log(Level.INFO, String.valueOf(hotpo(initialValue3)));
    logger.log(Level.INFO, String.valueOf(hotpo(initialValue4)));
  }
}

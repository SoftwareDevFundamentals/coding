package simon.chumacero.espada.assigment2;

public final class Kata1 {
  /**
   * Apartir de esta cantidad se considera una serie.
   * */
  private static final int SMELL_SERIE = 3;
  /**
   * Con una cantidad entre 1 y 2, no se considera una serie.
   * */
  private static final int MIN_NUMBER = 1;
  /**
   * Con una cantidad entre 1 y 2, no se considera una serie.
   * */
  private static final int MAX_NUMBER = 2;


  private Kata1() {

  }

  /**
   * Metodo que verifica si una serie dada esta correcta para ser publicada.
   * @param x Recibe una lista de strings con una serie
   * @return Devuelve un string con la clasificación de la serie
   * */
  public static String well(final String[] x) {

    int count = 0;
    for (String word : x) {
      if ("good".equals(word)) {
        count = count + 1;
      }
    }
    if (count >= SMELL_SERIE) {
      return "I smell a series!";
    }
    if (count == MIN_NUMBER || count == MAX_NUMBER) {
      return "Publish!";
    }

    return "Fail!";
  }
}

package simon.chumacero.espada.assigment3;

public final class Kata1 {
  /**
   * Puntos otorgados por una victoria.
   * */
  private static final int WIN_POINTS = 3;

  /**
   * Puntos otorgados por un empate.
   * */
  private static final int TIE_POINTS = 1;

  private Kata1() {
  }

  /**
   * Recibe un String con el marcador de los juegos.
   * @param games un string con el puntaje o marcador de los juegos
   * @return entero con el resultado de total de puntos
   * */
  public static int points(final String[] games) {
    int totalPoints = 0;

    for (String result : games) {
      int ourScore = Character.getNumericValue(result.charAt(0));
      int opponentScore = Character.getNumericValue(result.charAt(2));

      if (ourScore > opponentScore) {
        // Win
        totalPoints += WIN_POINTS;
      } else if (ourScore == opponentScore) {
        // Tie
        totalPoints += TIE_POINTS;
      }
    }
    return totalPoints;
  }
}

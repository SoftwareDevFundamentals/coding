package simon.chumacero.espada.assigment3;

public final class Kata1 {

    private Kata1() {

    }

    public static int points(final String[] games) {
        int totalPoints = 0;

        for (String result : games) {
            int ourScore = Character.getNumericValue(result.charAt(0));
            int opponentScore = Character.getNumericValue(result.charAt(2));

            if (ourScore > opponentScore) {
                // Win
                totalPoints += 3;
            } else if (ourScore == opponentScore) {
                // Tie
                totalPoints += 1;
            }
        }
        return totalPoints;
    }
}

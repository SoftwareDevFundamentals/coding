package bo.usfx.brayan_zuniga;

public final class TotalPoints {
    private TotalPoints() {

    }

    public static int points(final String[] games) {
        int totalPoints = 0;
        for (String game : games) {
            String[] scores = game.split(":");
            int ourScore = Integer.parseInt(scores[0]);
            int opponentScore = Integer.parseInt(scores[1]);

            if (ourScore > opponentScore) {
                totalPoints += 3; // Win
            } else if (ourScore == opponentScore) {
                totalPoints += 1; // Tie
            }
        }

        return totalPoints;
    }
}

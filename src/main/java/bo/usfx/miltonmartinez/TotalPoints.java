package bo.usfx.miltonmartinez;

public final class TotalPoints {

    private TotalPoints() {}
    public static int points(final String[] games) {
        int totalPoints = 0;

        for (String matchResult : games) {
            String[] scores = matchResult.split(":");
            int ourScore = Integer.parseInt(scores[0]);
            int opponentScore = Integer.parseInt(scores[1]);

            if (ourScore > opponentScore) {
                totalPoints += 3;
            } else if (ourScore == opponentScore) {
                totalPoints += 1;
            }
        }

        return totalPoints;
    }
}

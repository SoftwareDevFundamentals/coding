package bo.usfx.assignment3;

public final class TotalPoints {

    private TotalPoints() {

    }
    public static int points(final String[] games) {
        int totalPoints = 0;

        for (String gameResult : games) {
            String[] scores = gameResult.split(":");
            int point = Integer.parseInt(scores[0]);
            int opponentPoint = Integer.parseInt(scores[1]);

            if (point > opponentPoint) {
                totalPoints += 3;
            } else if (point == opponentPoint) {
                totalPoints += 1;
            }
        }

        return totalPoints;
    }
}
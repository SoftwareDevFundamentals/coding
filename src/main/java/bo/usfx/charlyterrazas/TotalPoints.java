package bo.usfx.charlyterrazas;

public final class TotalPoints {
    private TotalPoints() {
    }

    public static int calculateTotalPoints(final String[] matchResults) {
        int totalPoints = 0;
        for (String matchResult : matchResults) {
            String[] scores = matchResult.split(":");
            int ourScore = Integer.parseInt(scores[0]);
            int opponentScore = Integer.parseInt(scores[1]);
            if (ourScore > opponentScore) {
                totalPoints += 3;
            } else if (ourScore == opponentScore) {
                totalPoints += 1;
            }
            if (totalPoints > 30) {
                totalPoints = 30;
            }
        }
        return totalPoints;
    }
}

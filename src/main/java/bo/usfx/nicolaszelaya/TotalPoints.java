package bo.usfx.nicolaszelaya;

public final class TotalPoints {

    private TotalPoints() {

    }

    public static int points(final String[] games) {
        int totalScore = 0;
        for (int i = 0; i < games.length; i++) {
            String[] parts = games[i].split(":");
            if (parts.length == 2) {
                int ourTeamScore = Integer.parseInt(parts[0]);
                int opponentScore = Integer.parseInt(parts[1]);

                if (opponentScore > ourTeamScore) {
                    totalScore += 0;
                } else if (opponentScore == ourTeamScore) {
                    totalScore += 1;
                } else {
                    totalScore += 3;
                }
            }
        }
        return totalScore;
    }
}

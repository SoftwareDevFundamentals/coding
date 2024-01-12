package bo.usfx.luis.fernando.villca;

public final class TotalPoints {
    private TotalPoints() {
    }

    public static int points(final String[] games) {
        int totalPoints = 0;
        for (String game : games) {
            String[] result = game.split(":");

            if (Integer.parseInt(result[0]) > Integer.parseInt(result[1])) {
                totalPoints += 3;
            } else if (Integer.parseInt(result[0]) == Integer.parseInt(result[1])) {
                totalPoints += 1;
            }
        }
        return totalPoints;
    }
}

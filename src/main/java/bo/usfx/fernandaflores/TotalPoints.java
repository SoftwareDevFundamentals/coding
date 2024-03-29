package bo.usfx.fernandaflores;
public final class TotalPoints {
    private TotalPoints() {
    }

    public static int points(final String[] games) {
        int totalPoints = 0;
        for (int i = 0; i < games.length; i++) {
            String[] game = games[i].split(":");
            int x = Integer.parseInt(game[0]);
            int y = Integer.parseInt(game[1]);
            if (x > y) {
                totalPoints += 3;
            } else if (x == y) {
                totalPoints += 1;
            }
        }
        return totalPoints;
    }
}

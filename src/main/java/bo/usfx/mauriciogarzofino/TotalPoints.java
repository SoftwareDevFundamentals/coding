package bo.usfx.mauriciogarzofino;

public final class TotalPoints {
    private TotalPoints() {
    }
    public static int points(final String[] games) {
        int totalPoints = 0;

        for (String game : games) {
            int x = Character.getNumericValue(game.charAt(0));
            int y = Character.getNumericValue(game.charAt(2));

            if (x > y) {
                totalPoints += 3;
            } else if (x == y) {
                totalPoints += 1;
            }
        }

        return totalPoints;
    }
}

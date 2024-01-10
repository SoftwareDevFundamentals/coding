package bo.usfx.waltervaquera;

public final class TotalPoints {

    private TotalPoints() {
    }

    public static int points(final String[] games) {
        int points = 0;
        for (String game : games) {
            if (game.charAt(0) > game.charAt(2)) {
                points += 3;
            } else if (game.charAt(0) == game.charAt(2)) {
                points += 1;
            }
        }
        return points;
    }
}

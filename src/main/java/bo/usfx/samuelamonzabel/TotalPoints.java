package bo.usfx.samuelamonzabel;

public final class TotalPoints {

    private TotalPoints() {
    }
    public static int points(final String[] games) {
        int totalPoints = 0;
        for (String result : games) {
            String[] scores = result.split(":");
            int x = Integer.parseInt(scores[0]);
            int y = Integer.parseInt(scores[1]);

            if (x > y) {
                totalPoints += 3;
            } else if (x == y) {
                totalPoints += 1;
            }
        }

        return totalPoints;
    }
}

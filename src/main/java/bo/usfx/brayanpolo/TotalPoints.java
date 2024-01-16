package bo.usfx.brayanpolo;
public final class TotalPoints {
     private TotalPoints() {

     }
    public static int points(final String[] gamesInt) {
        //implement me
        String[] games = gamesInt;


        int totalPointsX = 0;

        for (String game : games) {
            String[] points = game.split(":");
            int scoreX = Integer.parseInt(points[0]);
            int scoreY = Integer.parseInt(points[1]);

            if (scoreX > scoreY) {
                totalPointsX += 3;
            }
            if (scoreX < scoreY) {
                totalPointsX += 0;
            }
            if (scoreX == scoreY) {
                totalPointsX += 1;
            }
        }
        return totalPointsX;
    }
}

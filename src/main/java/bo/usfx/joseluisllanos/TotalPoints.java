package bo.usfx.joseluisllanos;

import java.util.Arrays;

public final class TotalPoints {

    private TotalPoints() {
    }

    public static int points(final String[] games) {
        return Arrays.stream(games).map(divide -> divide.split(":")).mapToInt(pair -> {
            int teamX = Integer.parseInt(pair[0]);
            int teamY = Integer.parseInt(pair[1]);
            if (teamX > teamY) {
                return 3;
            } else if (teamX == teamY) {
                return 1;
            } else {
                return 0;
            }
        }).sum();
    }
}

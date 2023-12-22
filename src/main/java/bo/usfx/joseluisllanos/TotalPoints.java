package bo.usfx.joseluisllanos;

import java.util.Arrays;

public final class TotalPoints {

    private TotalPoints() {
    }

    public static int points(final String[] games) {
        return Arrays.stream(games).map(divide -> divide.split(":")).mapToInt(pair -> {
            int x = Integer.parseInt(pair[0]);
            int y = Integer.parseInt(pair[1]);
            if (x > y) {
                return 3;
            } else if (x == y) {
                return 1;
            } else {
                return 0;
            }
        }).sum();
    }
}

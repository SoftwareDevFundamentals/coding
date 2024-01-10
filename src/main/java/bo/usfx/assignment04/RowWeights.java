package bo.usfx.assignment04;

public final class RowWeights {

    private RowWeights() {

    }

    public static int[] rowWeights(final int[] weights) {
        int team1Weight = 0;
        int team2Weight = 0;

        for (int i = 0; i < weights.length; i++) {
            if (i % 2 == 0) {
                // Person with even index goes to team 1
                team1Weight += weights[i];
            } else {
                // Person with odd index goes to team 2
                team2Weight += weights[i];
            }
        }
        return new int[]{team1Weight, team2Weight};
    }
}


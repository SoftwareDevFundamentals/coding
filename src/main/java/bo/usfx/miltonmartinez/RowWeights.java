package bo.usfx.miltonmartinez;

public final class RowWeights {

    private RowWeights() {}

    public static int[] rowWeights(final int[] weights) {
        int team1Weight = 0, team2Weight = 0;

        for (int i = 0; i < weights.length; i++) {
            if (i % 2 == 0) {
                team1Weight += weights[i];
            } else {
                team2Weight += weights[i];
            }
        }
        return new int[] {team1Weight, team2Weight};
    }
}

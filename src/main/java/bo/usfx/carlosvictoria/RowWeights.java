package bo.usfx.carlosvictoria;

public final class RowWeights {

    private RowWeights() {

    }

    public static int[] rowWeights(final int[] weights) {
        int teamOne = 0;
        int teamTwo = 0;

        if (weights.length == 1) {
            return new int[]{weights[0], 0};
        }

        for (int i = 0; i < weights.length; i++) {

            if ((i + 1) % 2 == 0) {
                teamTwo += weights[i];
            } else {
                teamOne += weights[i];
            }
        }
        return new int[]{teamOne, teamTwo};
    }
}

package bo.usfx.daviniasalguero.assignment04;

public final class RowWeight {

    private RowWeight() {

    }

    public static int[] rowWeights(final int[] weights) {
        int teamOne = 0;
        int teamTwo = 0;

        for (int i = 0; i < weights.length; i++) {
            if (i % 2 != 0) {
                teamTwo += weights[i];
            } else {
                teamOne += weights[i];
            }
        }

        return new int[]{teamOne, teamTwo};
    }
}




package bo.usfx.nicolaszelaya;

public final class RowWeights {

    private RowWeights() {

    }

    /**
     * Calculates the total weights for two teams based on the input array of weights,
     * where team one takes the weights at even indices, and team two takes the weights at odd indices.
     *
     * @param weights An array of weights.
     * @return An array containing the total weights for team one and team two.
     */

    public static int[] rowWeights(final int[] weights) {
        int teamOneTotalWeight = 0;
        int teamTwoTotalWeight = 0;

        for (int i = 0; i < weights.length; i += 2) {
            teamOneTotalWeight += weights[i];
            if (i + 1 < weights.length) {
                teamTwoTotalWeight += weights[i + 1];
            }
        }

        return new int[]{teamOneTotalWeight, teamTwoTotalWeight};
    }
}

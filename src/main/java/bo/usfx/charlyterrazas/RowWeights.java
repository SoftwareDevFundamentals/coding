package bo.usfx.charlyterrazas;

public final class RowWeights {

    private RowWeights() {
    }

    public static int[] calTeamWeights(final int[] weights) {
        int totalWeightTeam1 = 0;
        int totalWeightTeam2 = 0;
        int i = 0;

        while (i < weights.length) {
            totalWeightTeam1 += weights[i];
            i++;

            if (i < weights.length) {
                totalWeightTeam2 += weights[i];
                i++;
            }
        }

        return new int[]{totalWeightTeam1, totalWeightTeam2};
    }
}


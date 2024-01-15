package bo.usfx.fernandaflores;

public final class RowWeights {
    private RowWeights() {
    }
    public static int[] calWeights(final int[] weights) {
        int[] results = {0, 0};

        for (int i = 0; i < weights.length; i++) {
            if (i % 2 == 0) {
                results[0] += weights[i];
            } else {
                results[1] += weights[i];
            }
        }
        return results; // Do your magic!
    }
}

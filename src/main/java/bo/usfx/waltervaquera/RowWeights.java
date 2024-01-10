package bo.usfx.waltervaquera;

public final class RowWeights {

    private RowWeights() {
    }

    public static int[] rowWeights(final int[] weights) {
        int[] totalWeights = new int[2];
        for (int i = 0; i < weights.length; i++) {
            totalWeights[i % 2] += weights[i];
        }
        return totalWeights;
    }
}

package bo.usfx.samuelamonzabel;

public final class RowWeights {
    private RowWeights() {
    }

    public static int[] rowWeights(final int[] weights) {
        int one = 0;
        int two = 0;
        int index = 0;

        if (weights.length == 1) {
            return new int[]{weights[0], 0};
        }

        for (int weight : weights) {
            if (index % 2 == 0) {
                one += weight;
            } else {
                two += weight;
            }
            index++;
        }
        return new int[]{one, two};
    }
}

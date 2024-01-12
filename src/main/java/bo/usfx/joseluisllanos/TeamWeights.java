package bo.usfx.joseluisllanos;


public final class TeamWeights {
    private TeamWeights() {
    }

    public static int[] rowWeights(final int[] weights) {
        boolean canEnter = true;
        int[] listWeights = {0, 0};
        for (int weight : weights) {
            if (canEnter) {
                listWeights[0] += weight;
                canEnter = false;
            } else {
                listWeights[1] += weight;
                canEnter = true;
            }
        }
        return listWeights;
    }
}

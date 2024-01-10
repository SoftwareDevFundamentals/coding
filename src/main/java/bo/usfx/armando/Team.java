package bo.usfx.armando;



public final class Team {
    private Team() {
    }

    public static int[] rowWeights(final int[] weigth) {
        int counterTeam1 = 0;
        int counterTeam2 = 0;
        for (int i = 0; i < weigth.length; i++) {
            if ((i % 2) == 0) {

                counterTeam1 += weigth[i];
            } else {
                counterTeam2 += weigth[i];
            }
        }
        return new int[] { counterTeam1, counterTeam2 };
    }
}

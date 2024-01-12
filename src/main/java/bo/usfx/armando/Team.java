package bo.usfx.armando;



public final class Team {
    private Team() {
    }
    public static int[] rowWeights(final int[] e) {
        int counterTeam1 = 0;
        int counterTeam2 = 0;
        for (int i = 0; i < e.length; i++) {
            if ((i % 2) == 0) {

                counterTeam1 += e[i];
            } else {
                counterTeam2 += e[i];
            }
        }
        return new int[] {counterTeam1, counterTeam2};
    }
}

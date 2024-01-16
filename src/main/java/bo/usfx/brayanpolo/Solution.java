package bo.usfx.brayanpolo;

public final class Solution {
    private Solution() {

    }
    public static int[] rowWeights(final int[] weights) {
        int a = 0;
        int b = 0;
        for (int i = 0; i < weights.length; i++) {
            if (i % 2 == 0) {
                a += weights[i];
            } else {
                b += weights[i];
            }
        }
        return new int[] {a, b};
    }

}

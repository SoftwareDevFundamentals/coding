package simon.chumacero.espada.assigment2;

public final class Kata2 {

    private Kata2() {

    }

    public static int summation(final int n) {
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sum += i;
        }

        return sum;
    }
}

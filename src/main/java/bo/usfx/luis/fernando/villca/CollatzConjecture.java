package bo.usfx.luis.fernando.villca;

public class CollatzConjecture {
    public static int collatz(int n) {
        int count = 0;
        while (n != 1) {
            if (n % 2 == 0) {
                n = n / 2;
            } else {
                n = 3 * n + 1;
            }
            count++;
        }
        return count;
    }
}

package jhoselineteran.assigment2;

public class CollatzConjecture {
    public static int hotpo (int n) {
        int steps = 0;

        while (n != 1) {
            if (n % 2 == 0) {
                n /= 2;
            } else {
                n = 3 * n + 1;
            }
            steps++;
        }
        return steps;
    }

    public static void main(String[] args) {
        System.out.println(hotpo(1));   // Output: 0
        System.out.println(hotpo(5));   // Output: 5
        System.out.println(hotpo(6));   // Output: 8
        System.out.println(hotpo(23));  // Output: 15
    }
}



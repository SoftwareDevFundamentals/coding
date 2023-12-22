package bo.usfx.armandonuñez;


public class Collatz{
    public static void main(String[] args) {
        System.out.println(hotpo(1));
        System.out.println(hotpo(5));
        System.out.println(hotpo(6));
        System.out.println(hotpo(23));

    }

    public static int hotpo(int n) {
        int count=0;

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

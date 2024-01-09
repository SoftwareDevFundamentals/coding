package bo.usfx.daviniaSalguero;

import java.util.Scanner;

public class Task2 {
    public static int hotpo(int n) {

        int cont = 0;
        boolean one = false;
        while (!one) {
            if (n == 1) {
                one = true;

            } else if (n % 2 == 0) {
                n = n / 2;
                cont++;
            } else {
                n = 3 * n + 1;
                cont++;
            }
        }
        return cont;
    }


}

package bo.usfx.fernanda_flores;

import java.util.Scanner;

public class CollatzConjecture {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Ingrese un numero: ");
        int n = sc.nextInt();
        System.out.println("\n La cantidad de repeticiones necesarias es: " + hotpo(n));
    }

    public static int hotpo(int n) {
        int count = 0;
        System.out.print(n + " -> ");
        while (n != 1) {
            if (n % 2 == 0) {
                n = n / 2;
                count++;
            } else {
                n = 3 * n + 1;
                count++;
            }
            System.out.print(n + " -> ");
        }
        return count;
    }
}
package jhoselineteran.assigment2;


public class CollatzConjecture {

  private static int hotpo(int n) {
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
    System.out.println(hotpo(1));
    System.out.println(hotpo(5));
    System.out.println(hotpo(6));
    System.out.println(hotpo(23));
  }
}

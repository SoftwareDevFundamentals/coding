package bo.usfx.armandonuñez;


public class campeonato{


    public static void main(String[] args) {
        String[] results = {"1:1","2:2","3:3","4:4","2:2","3:3","4:4","3:3","4:4","4:4"};
        String[] resultsTwo={"1:0","2:0","3:0","4:0","2:1","1:3","1:4","2:3","2:4","3:4"};


            System.out.println("The points obtained are: " + points(results));
            System.out.println(("The points obtained are: " + points(resultsTwo))); }



    public static int points(String[] results) {
        int counter = 0;

        for (int i = 0; i < results.length; i++) {
            String[] parts = results[i].split(":");
            int x = Integer.parseInt(parts[0].trim());
            int y = Integer.parseInt(parts[1].trim());
            String indicator=" ";
            if (x > y) {
                counter += 3;indicator = "victory";
            } else if (x == y) {
                counter += 1;  indicator = "tie";
            }
            if(x<y){

                indicator = "loss";
            }
            System.out.println(("game " + (i + 1) + " results: " + results[i]+"----->"+indicator));
        }
        return counter;
    }


    public static class Collatz{
        public static void main(String[] args) {
            System.out.println(hotpo(1));
            System.out.println(hotpo(5));
            System.out.println(hotpo(6));
            System.out.println(hotpo(23));

        }

        public static int hotpo(int n) {
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
}

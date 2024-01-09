package bo.usfx.armandonuñez;


public class campeonato{




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



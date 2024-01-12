package bo.usfx.armando;

public final class Points {
    private Points(){

    }
    public static int points( final String[] results) {

        int counter = 0;

        for (String game:results) {
            String[] parts = game.split(":");
            int x = Integer.parseInt(parts[0]);
            int y = Integer.parseInt(parts[1]);

            if (x > y) {
                counter += 3;
            } else if (x == y) {
                counter += 1;
            }
            if(x<y){
                counter+=0;
            }

        }
        return counter;
    }
}

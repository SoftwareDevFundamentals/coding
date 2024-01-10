package bo.usfx.assignment04;

public final class TotalPoints {

    private TotalPoints() {

    }

    public static int points(final String[] games) {
        int totalPoints = 0;

        for (String resultado : games) {
            String[] partes = resultado.split(":");
            int x = Integer.parseInt(partes[0]);
            int y = Integer.parseInt(partes[1]);

            if (x > y) {

                totalPoints += 3;
            } else if (x == y) {

                totalPoints += 1;
            }

        }

        return totalPoints;
    }

}



package bo.usfx.carlosvictoria;

public final class TotalPoints {

    private TotalPoints() {

    }

    public static int points(final String[] games) {
        int count = 0;
        for (String element : games) {

            int x = element.charAt(0);
            int y = element.charAt(2);

            if (x > y) {
                count += 3;
            }
            if (x < y) {
                count += 0;
            }
            if (x == y) {
                count += 1;
            }
        }
        return count;
    }
}

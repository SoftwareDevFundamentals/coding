package bo.usfx.fernanda_flores;

public class TotalPoints {
    public static void main(String[] args) {
        String[] results = {"1:0", "2:0", "3:0", "4:0", "2:1", "3:1", "4:1", "3:2", "4:2", "4:3"};
        int totalPoints = points(results);

        System.out.println("Total Points: " + totalPoints);
    }

    public static int points(String[] games) {
        int totalPoints = 0;
        for (int i = 0; i < games.length; i++) {
            String[] game = games[i].split(":");
            int x = Integer.parseInt(game[0]);
            int y = Integer.parseInt(game[1]);
            if (x > y) {
                totalPoints += 3;
            } else if (x == y) {
                totalPoints += 1;
            }
        }
        return totalPoints;
    }
}
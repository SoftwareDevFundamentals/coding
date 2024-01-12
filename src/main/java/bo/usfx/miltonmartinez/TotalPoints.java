package bo.usfx.miltonmartinez;

public class TotalPoints {

    public static int points(String[] games) {
        int totalPoints = 0;

        for (String matchResult : games) {
            String[] scores = matchResult.split(":");
            int ourScore = Integer.parseInt(scores[0]);
            int opponentScore = Integer.parseInt(scores[1]);

            if (ourScore > opponentScore) {
                totalPoints += 3;
            } else if (ourScore == opponentScore){
                totalPoints += 1;
            }
        }

        return totalPoints;
    }
}

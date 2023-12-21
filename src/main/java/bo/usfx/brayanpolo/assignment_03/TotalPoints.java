package bo.usfx.brayanpolo.assignment_03;

public class TotalPoints {
     private TotalPoints(){

     }
    public static int points(String[] games) {
        //implement me
        int totalPointsX = 0;

        for(String game : games){
            String[] points = game.split(":");
            int scoreX = Integer.parseInt(points[0]);
            int scoreY = Integer.parseInt(points[1]);

            if(scoreX > scoreY){
                totalPointsX +=3;
            }
            if(scoreX < scoreY){
                totalPointsX +=0;
            }
            if(scoreX == scoreY){
                totalPointsX +=1;
            }
        }
        return totalPointsX;
    }
}
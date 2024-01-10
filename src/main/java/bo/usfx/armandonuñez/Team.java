package bo.usfx.armandonuñez;

import java.util.logging.*;
public class Team {
private static final Logger logger=Logger.getLogger(Team.class.getName());
    public static int[] rowWeights(int [] weigth ){
        int counterTeam1=0;
        int counterTeam2=0;
        for (int i=0;i<weigth.length;i++){
            if((i % 2)==0){

                counterTeam1+=weigth[i];
            }else{
                counterTeam2+=weigth[i];
            }
        }
        logger.info("[" +counterTeam1+","+ counterTeam2+"]");

return new int[]{counterTeam1,counterTeam2};
    }
}


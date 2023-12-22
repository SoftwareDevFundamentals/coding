package bo.usfx.brayanpolo.assignment_03;

public class CollatzConjecture {

    private  CollatzConjecture(){

    }
    public static int hotpo(int n) {
        int times =0;

        while(n != 1){
            if(n % 2 == 0){
                n /= 2;
            }else{
                n = n*3+1;
            }
            times +=1;

        }
        return times;
    }
}

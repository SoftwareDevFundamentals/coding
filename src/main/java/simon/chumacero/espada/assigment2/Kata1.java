package simon.chumacero.espada.assigment2;

public final class Kata1 {


    private Kata1(){

    }
    public static String well(final String[] x) {

        int count = 0;
        for (String word : x) {
            if ("good".equals(word)) {
                count = count + 1;
            }
        }
        if (count >= 3) {
            return "I smell a series!";
        }
        if (count == 1 || count == 2) {
            return "Publish!";
        }

        return "Fail!";
    }
}

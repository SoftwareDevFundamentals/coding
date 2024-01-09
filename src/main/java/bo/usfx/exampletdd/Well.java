package bo.usfx.exampletdd;

public final class Well {

    private Well() {

    }
    /**
     * Realiza un conteo de las ideas para su posterior clasificacion.
     * @param x recibe un array de strings
     * @return  devuelve un string  con el resultado basado en el conteo
     * */
    public static String well(final String[] x) {
        int buenasIdeas = 0;

        for (String idea : x) {
            if (idea.equals("good")) {
                buenasIdeas++;
            }
        }

        if (buenasIdeas == 1 || buenasIdeas == 2) {
            return "Publish!";
        } else if (buenasIdeas > 2) {
            return "I smell a series!";
        } else {
            return "Fail!";
        }
    }
}

package bo.usfx.daviniaSalguero;

public class Task1 {

        public static int points(String[] games) {
            int puntosTotales = 0;

            for (String resultado : games) {
                String[] partes = resultado.split(":");
                int x = Integer.parseInt(partes[0]);
                int y = Integer.parseInt(partes[1]);

                if (x > y) {

                    puntosTotales += 3;
                } else if (x == y) {

                    puntosTotales += 1;
                }

            }

            return puntosTotales;
        }

}

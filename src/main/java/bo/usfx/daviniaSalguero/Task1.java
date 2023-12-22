package bo.usfx.daviniaSalguero;

public class Task1 {
        public static void main(String[] args) {
            String[] resultados = {"3:1", "2:2", "0:1", "4:0", "1:2", "2:1", "0:0", "3:3", "1:0", "0:4"};

            int puntosTotales = points(resultados);
            System.out.println("Puntos totales del equipo: " + puntosTotales);
        }
        public static int points(String[] games) {
            int puntosTotales = 0;

            for (String resultado : games) {
                String[] partes = resultado.split(":");
                int x = Integer.parseInt(partes[0]);
                int y = Integer.parseInt(partes[1]);

                if (x > y) {
                    // Ganar
                    puntosTotales += 3;
                } else if (x == y) {
                    // Empate
                    puntosTotales += 1;
                }
                // No hay puntos para la pérdida, ya que se inicializa en 0 por defecto
            }

            return puntosTotales;
        }

}

import java.util.Scanner;

public class ControlEntregas {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        // Las funciones que voy a llamar.
        int cantidad = leerCantidad(scanner);

        int[] tiempos = new int[cantidad];

        cargarTiempos(scanner, tiempos);

        int total = calcularTotal(tiempos);
        int entregasRapidas = contarEnRango(tiempos, 10, 30);
        int entregasDemoradas = contarEnRango(tiempos, 60, 120);
        double promedio = calcularPromedio(tiempos);
        int mayor = buscarMayor(tiempos);

        mostrarResultados(entregasRapidas, entregasDemoradas, total, promedio, mayor);

        scanner.close();
    }

    public static int leerCantidad(Scanner scanner) {
        int cantidad = 0;

        do {
            System.out.println("Cantidad de entregas");
            cantidad = scanner.nextInt();

            if (cantidad <= 0) {
                System.out.println("La cantidad debe ser mayor que cero.");
            }
        } while (cantidad <= 0);

        return cantidad;
    }

    public static boolean esTiempoValido(int tiempo) {
        return tiempo >= 10 && tiempo <= 120;
    }

    public static void cargarTiempos(Scanner scanner, int[] tiempos) {
        int longTiempos = tiempos.length;
        for (int i = 0; i < longTiempos; i++) {
            do {
                System.out.println("Tiempo de entrega" + (i + 1) + ": ");
                tiempos[i] = scanner.nextInt();

                if (!esTiempoValido(tiempos[i])) {
                    System.out.println("Dato invalido. Ingrese un valor entre 10 y 120 minutos");
                }

            } while (!esTiempoValido(tiempos[i]));
        }
    }

    public static int calcularTotal(int[] tiempos) {
        int total = 0;
        int longTiempos = tiempos.length;
        for (int i = 0; i < longTiempos; i++) {
            total += tiempos[i];
        }
        return total;
    }

    public static int contarEnRango(int[] tiempos, int minimo, int maximo) {
        int contador = 0;
        int longTiempos = tiempos.length;
        for (int i = 0; i < longTiempos; i++) {
            if (tiempos[i] >= minimo && tiempos[i] <= maximo) {
                contador++;
            }
        }
        return contador;
    }

    public static double calcularPromedio(int[] tiempos) {
        int total = calcularTotal(tiempos);
        return (double) total / tiempos.length;
    }

    public static int buscarMayor(int[] tiempos) {
        int mayor = tiempos[0];
        int longTiempos = tiempos.length;
        for (int i = 1; i < longTiempos; i++) {
            if (tiempos[i] > mayor) {
                mayor = tiempos[i];
            }
        }
        return mayor;
    }

    public static void mostrarResultados(
            int entregasRapidas,
            int entregasDemoradas,
            int total,
            double promedio,
            int mayor) {

        System.out.println("RESUMEN DE LA JORNADA");
        System.out.println("Entregas rapidas: " + entregasRapidas);
        System.out.println("Entregas demoradas: " + entregasDemoradas);
        System.out.println("Tiempo total: " + total);
        System.out.println("Tiempo promedio: " + promedio);
        System.out.println("Mayor tiempo de entrega: " + mayor);
    }
}

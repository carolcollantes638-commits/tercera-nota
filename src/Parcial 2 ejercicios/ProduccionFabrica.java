
import java.util.Scanner;

public class ProduccionFabrica {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int cantOperarios;
        int produccionEntre10Y100 = 0;
        int produccionMayor100 = 0;
        int produccionTotal = 0;
        int i = 0;

        System.out.print("Ingrese la cantidad de operarios: ");
        cantOperarios = sc.nextInt();

        int produccion[] = new int[cantOperarios];

        while (i < cantOperarios) {

            System.out.print("Ingrese la producción del operario " + (i + 1) + ": ");
            produccion[i] = sc.nextInt();

            if (produccion[i] >= 10 && produccion[i] <= 200) {

                produccionTotal += produccion[i];

                if (produccion[i] <= 100) {
                    produccionEntre10Y100++;
                } else {
                    produccionMayor100++;
                }

                i++;

            } else {
                System.out.println("Producción inválida. Debe estar entre 10 y 200 unidades.");
            }
        }

        System.out.println("\nResultados:");
        System.out.println("Operarios que produjeron entre 10 y 100 unidades: " + produccionEntre10Y100);
        System.out.println("Operarios que produjeron más de 100 unidades: " + produccionMayor100);
        System.out.println("Producción total de la fábrica: " + produccionTotal);

        sc.close();
    }
}

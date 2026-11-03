
import java.util.Scanner;

public class GastosRestaurante {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int cantClientes;
        int gastosEntre20Y100 = 0;
        int gastosMayores100 = 0;
        double totalRecibido = 0;
        int i = 0;

        System.out.print("Ingrese la cantidad de clientes: ");
        cantClientes = sc.nextInt();

        double gastos[] = new double[cantClientes];

        while (i < cantClientes) {

            System.out.print("Ingrese el gasto del cliente " + (i + 1) + ": ");
            gastos[i] = sc.nextDouble();

            if (gastos[i] >= 20000 && gastos[i] <= 200000) {

                totalRecibido += gastos[i];

                if (gastos[i] <= 100000) {
                    gastosEntre20Y100++;
                } else {
                    gastosMayores100++;
                }

                i++;

            } else {
                System.out.println("Gasto inválido. Debe estar entre 20000 y 200000.");
            }
        }

        System.out.println("\nResultados:");
        System.out.println("Clientes que gastaron entre 20000 y 100000: " + gastosEntre20Y100);
        System.out.println("Clientes que gastaron más de 100000: " + gastosMayores100);
        System.out.println("Total recibido por el restaurante: $" + totalRecibido);

        sc.close();
    }
}

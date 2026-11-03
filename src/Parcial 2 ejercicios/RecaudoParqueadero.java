import java.util.Scanner;

public class RecaudoParqueadero {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n;
        int entre2000y20000 = 0;
        int mayores20000 = 0;
        double total = 0;
        int i = 0;

        System.out.print("Ingrese la cantidad de vehículos: ");
        n = sc.nextInt();

        double pagos[] = new double[n];

        while (i < n) {

            System.out.print("Ingrese el pago del vehículo " + (i + 1) + ": ");
            pagos[i] = sc.nextDouble();

            if (pagos[i] >= 2000 && pagos[i] <= 50000) {

                total = total + pagos[i];

                if (pagos[i] <= 20000) {
                    entre2000y20000++;
                } else {
                    mayores20000++;
                }

                i++;

            } else {
                System.out.println("Pago inválido. Debe estar entre 2000 y 50000.");
            }
        }

        System.out.println("\nRESULTADOS");
        System.out.println("Vehículos que pagaron entre 2000 y 20000: " + entre2000y20000);
        System.out.println("Vehículos que pagaron más de 20000: " + mayores20000);
        System.out.println("Total recaudado: $" + total);

        sc.close();
    }
}
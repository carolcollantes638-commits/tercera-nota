
import java.util.Scanner;

public class KilometrosVehiculos {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int cantVehiculos;
        int vehiculosEntre10Y300 = 0;
        int vehiculosMayores300 = 0;
        int totalKilometros = 0;
        int i = 0;

        System.out.print("Ingrese la cantidad de vehículos: ");
        cantVehiculos = sc.nextInt();

        int kilometros[] = new int[cantVehiculos];

        while (i < cantVehiculos) {

            System.out.print("Ingrese los kilómetros del vehículo " + (i + 1) + ": ");
            kilometros[i] = sc.nextInt();

            if (kilometros[i] >= 10 && kilometros[i] <= 500) {

                totalKilometros += kilometros[i];

                if (kilometros[i] <= 300) {
                    vehiculosEntre10Y300++;
                } else {
                    vehiculosMayores300++;
                }

                i++;

            } else {
                System.out.println("Kilómetros inválidos. Deben estar entre 10 y 500.");
            }
        }

        System.out.println("\nResultados:");
        System.out.println("Vehículos entre 10 y 300 km: " + vehiculosEntre10Y300);
        System.out.println("Vehículos mayores a 300 km: " + vehiculosMayores300);
        System.out.println("Total de kilómetros recorridos: " + totalKilometros + " km");

        sc.close();
    }
}

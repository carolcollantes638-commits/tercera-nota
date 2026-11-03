
import java.util.Scanner;

public class ConsumoAgua {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int cantApartamentos;
        int consumoEntre1Y50 = 0;
        int consumoMayor50 = 0;
        double consumoTotal = 0;
        int i = 0;

        System.out.print("Ingrese la cantidad de apartamentos: ");
        cantApartamentos = sc.nextInt();

        double consumos[] = new double[cantApartamentos];

        while (i < cantApartamentos) {

            System.out.print("Ingrese el consumo del apartamento " + (i + 1) + ": ");
            consumos[i] = sc.nextDouble();

            if (consumos[i] >= 1 && consumos[i] <= 100) {

                consumoTotal += consumos[i];

                if (consumos[i] <= 50) {
                    consumoEntre1Y50++;
                } else {
                    consumoMayor50++;
                }

                i++;

            } else {
                System.out.println("Consumo inválido. Debe estar entre 1 y 100.");
            }
        }

        System.out.println("\nResultados:");
        System.out.println("Apartamentos con consumo entre 1 y 50: " + consumoEntre1Y50);
        System.out.println("Apartamentos con consumo mayor a 50: " + consumoMayor50);
        System.out.println("Consumo total de agua: " + consumoTotal + " metros cubicos");

        sc.close();
    }
}

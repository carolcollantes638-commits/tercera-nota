
import java.util.Scanner;

public class PesoPaquetes {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int cantPaquetes;
        int paquetesEntre1Y20 = 0;
        int paquetesMayores20 = 0;
        double pesoTotal = 0;
        int i = 0;

        System.out.print("Ingrese la cantidad de paquetes: ");
        cantPaquetes = sc.nextInt();

        double pesos[] = new double[cantPaquetes];

        while (i < cantPaquetes) {

            System.out.print("Ingrese el peso del paquete " + (i + 1) + ": ");
            pesos[i] = sc.nextDouble();

            if (pesos[i] >= 1 && pesos[i] <= 50) {

                pesoTotal += pesos[i];

                if (pesos[i] <= 20) {
                    paquetesEntre1Y20++;
                } else {
                    paquetesMayores20++;
                }

                i++;

            } else {
                System.out.println("Peso inválido. Debe estar entre 1 y 50 kg.");
            }
        }

        System.out.println("\nResultados:");
        System.out.println("Paquetes entre 1 y 20 kg: " + paquetesEntre1Y20);
        System.out.println("Paquetes mayores a 20 kg: " + paquetesMayores20);
        System.out.println("Peso total transportado: " + pesoTotal + " kg");

        sc.close();
    }
}

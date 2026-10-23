
import java.util.Scanner;
//El programa guarda las temperaturas de la mañana y la tarde durante 3 días.
public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double[][] temperaturas = new double[3][2];
        double suma = 0;
        double mayor = -1000;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                if (j == 0) {
                    System.out.print("Temperatura de la manana, dia " + (i + 1) + ": ");
                } else {
                    System.out.print("Temperatura de la tarde, dia " + (i + 1) + ": ");
                }

                temperaturas[i][j] = teclado.nextDouble();
                suma = suma + temperaturas[i][j];

                if (temperaturas[i][j] > mayor) {
                    mayor = temperaturas[i][j];
                }
            }
        }

        System.out.println("\nTemperaturas registradas:");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(temperaturas[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Promedio: " + (suma / 6));
        System.out.println("Temperatura mas alta: " + mayor);

        teclado.close();
    }
}


import java.util.Scanner;
//Calcular cuánto debe pagar un vehículo según las horas de permanencia.
public class Parqueadero {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        String placa;
        int horas;
        double total;

        System.out.print("Ingrese la placa: ");
        placa = entrada.nextLine();

        System.out.print("Ingrese las horas: ");
        horas = entrada.nextInt();

        if (horas <= 1) {
            total = 3000;
        } else {
            total = 3000 + (horas - 1) * 2000;
        }

        if (horas > 8) {
            total = total - (total * 0.10);
        }

        System.out.println("Placa: " + placa);
        System.out.println("Total a pagar: $" + total);

        entrada.close();
    }
}

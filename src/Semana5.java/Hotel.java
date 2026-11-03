
import java.util.Scanner;
//Calcular el precio de una reserva según el tipo de habitación y las noches.
public class Hotel {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        String nombre;
        int tipo, noches;
        double precio, total;

        System.out.print("Nombre del cliente: ");
        nombre = entrada.nextLine();

        System.out.println("1. Habitacion sencilla");
        System.out.println("2. Habitacion doble");

        System.out.print("Seleccione el tipo: ");
        tipo = entrada.nextInt();

        System.out.print("Cantidad de noches: ");
        noches = entrada.nextInt();

        if (tipo == 1) {
            precio = 80000;
        } else if (tipo == 2) {
            precio = 130000;
        } else {
            System.out.println("Tipo de habitacion no valido");
            entrada.close();
            return;
        }

        total = precio * noches;

        if (noches > 5) {
            total = total - (total * 0.12);
        }

        System.out.println("\n--- RESERVA ---");
        System.out.println("Cliente: " + nombre);
        System.out.println("Noches: " + noches);
        System.out.println("Total a pagar: $" + total);

        entrada.close();
    }
}


import java.util.Scanner;
//Crear un programa que inicie con un saldo de $200.000 y
//permita consultar el saldo, depositar dinero o retirar dinero mediante un menú. El programa debe repetirse hasta que el usuario elija salir.
public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double saldo = 200000;
        double cantidad;
        int opcion;

        do {
            System.out.println("\n--- CAJERO AUTOMATICO ---");
            System.out.println("1. Consultar saldo");
            System.out.println("2. Depositar dinero");
            System.out.println("3. Retirar dinero");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opcion: ");
            opcion = teclado.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Saldo: " + saldo);
                    break;

                case 2:
                    System.out.print("Cantidad a depositar: ");
                    cantidad = teclado.nextDouble();

                    if (cantidad > 0) {
                        saldo = saldo + cantidad;
                        System.out.println("Deposito realizado");
                    } else {
                        System.out.println("Cantidad no valida");
                    }
                    break;

                case 3:
                    System.out.print("Cantidad a retirar: ");
                    cantidad = teclado.nextDouble();

                    if (cantidad > 0 && cantidad <= saldo) {
                        saldo = saldo - cantidad;
                        System.out.println("Retiro realizado");
                    } else {
                        System.out.println("Cantidad no valida");
                    }
                    break;

                case 4:
                    System.out.println("Gracias por utilizar el cajero");
                    break;

                default:
                    System.out.println("Opcion incorrecta");
            }

        } while (opcion != 4);

        teclado.close();
    }
}

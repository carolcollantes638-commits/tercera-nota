
import java.util.Scanner;
//Este programa permite consultar el saldo y retirar dinero sin superar el dinero disponible.
public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double saldo = 500000;
        int opcion;

        System.out.println("1. Consultar saldo");
        System.out.println("2. Retirar dinero");
        System.out.print("Seleccione una opcion: ");
        opcion = teclado.nextInt();

        if (opcion == 1) {
            System.out.println("Su saldo es: " + saldo);
        } else if (opcion == 2) {
            System.out.print("Ingrese el valor a retirar: ");
            double retiro = teclado.nextDouble();

            if (retiro > 0 && retiro <= saldo) {
                saldo = saldo - retiro;
                System.out.println("Retiro exitoso");
                System.out.println("Saldo restante: " + saldo);
            } else {
                System.out.println("Valor no valido o saldo insuficiente");
            }
        } else {
            System.out.println("Opcion incorrecta");
        }

        teclado.close();
    }
}

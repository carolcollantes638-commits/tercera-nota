
import java.util.Scanner;
//Una tienda ofrece un descuento del 15 % si la compra
//supera los $100.000. Solicitar el valor de la compra y mostrar cuánto debe pagar el cliente.
public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double compra, descuento, total;

        System.out.print("Valor de la compra: ");
        compra = teclado.nextDouble();

        if (compra > 100000) {
            descuento = compra * 0.15;
        } else {
            descuento = 0;
        }

        total = compra - descuento;

        System.out.println("Descuento: " + descuento);
        System.out.println("Total a pagar: " + total);

        teclado.close();
    }
}

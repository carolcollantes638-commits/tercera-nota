
import java.util.Scanner;
//Registrar las ventas de una tienda durante 7 días y calcular el 
//total vendido y el día con mayores ventas. Si hay empate, mostrar el primer día con ese valor.
public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double[] ventas = new double[7];
        double total = 0;
        double mayor;

        for (int i = 0; i < 7; i++) {
            System.out.print("Ventas del dia " + (i + 1) + ": ");
            ventas[i] = teclado.nextDouble();
            total = total + ventas[i];
        }

        mayor = ventas[0];
        int diaMayor = 1;

        for (int i = 1; i < 7; i++) {
            if (ventas[i] > mayor) {
                mayor = ventas[i];
                diaMayor = i + 1;
            }
        }

        System.out.println("Total vendido: " + total);
        System.out.println("Mayor venta: " + mayor);
        System.out.println("Dia con mayor venta: " + diaMayor);

        teclado.close();
    }
}

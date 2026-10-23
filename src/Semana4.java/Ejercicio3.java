
import java.util.Scanner;
//Este programa registra los gastos de los 7 días de la semana, calcula el total, el promedio y el día con mayor gasto.
public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double[] gastos = new double[7];
        double total = 0;
        double promedio;
        double mayor;

        for (int i = 0; i < 7; i++) {
            System.out.print("Ingrese el gasto del dia " + (i + 1) + ": ");
            gastos[i] = teclado.nextDouble();

            total = total + gastos[i];
        }

        promedio = total / 7;
        mayor = gastos[0];
        int diaMayor = 1;

        for (int i = 1; i < 7; i++) {
            if (gastos[i] > mayor) {
                mayor = gastos[i];
                diaMayor = i + 1;
            }
        }

        System.out.println("Gasto total: " + total);
        System.out.println("Promedio diario: " + promedio);
        System.out.println("Mayor gasto: " + mayor);
        System.out.println("Dia de mayor gasto: " + diaMayor);

        teclado.close();
    }
}


import java.util.Scanner;
//Una fábrica tiene 3 máquinas que trabajan durante 4 días. 
//Registrar la cantidad de productos fabricados por cada máquina y calcular el total producido por cada una.
public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int[][] produccion = new int[3][4];
        int total;

        for (int fila = 0; fila < 3; fila++) {
            System.out.println("Maquina " + (fila + 1));

            for (int columna = 0; columna < 4; columna++) {
                System.out.print("Produccion del dia "
                        + (columna + 1) + ": ");

                produccion[fila][columna] = teclado.nextInt();
            }
        }

        for (int fila = 0; fila < 3; fila++) {
            total = 0;

            for (int columna = 0; columna < 4; columna++) {
                total = total + produccion[fila][columna];
            }

            System.out.println("Total de la maquina "
                    + (fila + 1) + ": " + total);
        }

        teclado.close();
    }
}

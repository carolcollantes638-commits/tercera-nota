
//Problema 5. Suma de una matriz
//Realice un programa en Java que permita llenar una matriz de 3 × 3 con números enteros.
 //El programa debe mostrar la matriz y calcular la suma de todos sus elementos.
public class Ejercicio5 {
    public static void main(String[] args) {

        try (Scanner teclado = new Scanner(System.in)) {
            int[][] matriz = new int[3][3];
            int suma = 0;

            System.out.println("Ingrese los valores de la matriz:");

            for (int fila = 0; fila < 3; fila++) {

                for (int columna = 0; columna < 3; columna++) {

                    System.out.print("Fila " + fila + ", columna " + columna + ": ");
                    matriz[fila][columna] = teclado.nextInt();

                    suma = suma + matriz[fila][columna];
                }
            }

            System.out.println("\nMatriz:");

            for (int fila = 0; fila < 3; fila++) {

                for (int columna = 0; columna < 3; columna++) {
                    System.out.print(matriz[fila][columna] + " ");
                }

                System.out.println();
            }

            System.out.println("La suma de todos los elementos es: " + suma);
        }
    }
}
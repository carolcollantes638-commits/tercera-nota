
//Problema 2. Ventas de una tienda
//Una tienda registra las ventas de 4 productos durante 5 días. La información debe almacenarse en una matriz de 4 × 5.
//El programa debe:
//- Solicitar las ventas de cada producto durante cada día.
//- Mostrar la matriz de ventas.
//- Calcular el total vendido por cada producto.
//- Calcular el total vendido por cada día.
public class Ejercicio2 {
    public static void main(String[] args) {

        try (Scanner teclado = new Scanner(System.in)) {
            int[][] ventas = new int[4][5];

            
            for (int producto = 0; producto < 4; producto++) {

                for (int dia = 0; dia < 5; dia++) {

                    System.out.print("Ingrese ventas del producto "
                            + (producto + 1) + " del dia "
                            + (dia + 1) + ": ");

                    ventas[producto][dia] = teclado.nextInt();
                }
            }

            
            System.out.println("\nVentas:");

            for (int producto = 0; producto < 4; producto++) {

                for (int dia = 0; dia < 5; dia++) {
                    System.out.print(ventas[producto][dia] + "\t");
                }

                System.out.println();
            }

            
            System.out.println("\nTotal vendido por producto:");

            for (int producto = 0; producto < 4; producto++) {

                int total = 0;

                for (int dia = 0; dia < 5; dia++) {
                    total = total + ventas[producto][dia];
                }

                System.out.println("Producto " + (producto + 1) + ": " + total);
            }

            System.out.println("\nTotal vendido por dia:");

            for (int dia = 0; dia < 5; dia++) {

                int total = 0;

                for (int producto = 0; producto < 4; producto++) {
                    total = total + ventas[producto][dia];
                }

                System.out.println("Dia " + (dia + 1) + ": " + total);
            }
        }
    }
}
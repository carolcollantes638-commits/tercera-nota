
import java.util.Scanner;
//Registrar cinco medicamentos y calcular el valor del inventario.
public class Farmacia {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        String[] nombres = new String[5];
        double[] precios = new double[5];
        int[] cantidades = new int[5];

        double total = 0;
        int mayor = 0;

        for (int i = 0; i < 5; i++) {
            System.out.println("\nMedicamento " + (i + 1));

            System.out.print("Nombre: ");
            nombres[i] = entrada.nextLine();

            System.out.print("Precio: ");
            precios[i] = entrada.nextDouble();

            System.out.print("Cantidad: ");
            cantidades[i] = entrada.nextInt();

            entrada.nextLine();

            total = total + (precios[i] * cantidades[i]);

            if (cantidades[i] > cantidades[mayor]) {
                mayor = i;
            }
        }

        System.out.println("\n--- INVENTARIO ---");

        for (int i = 0; i < 5; i++) {
            System.out.println(nombres[i] +
                " - Valor: $" + (precios[i] * cantidades[i]));
        }

        System.out.println("Mayor cantidad: " + nombres[mayor]);
        System.out.println("Valor total: $" + total);

        entrada.close();
    }
}

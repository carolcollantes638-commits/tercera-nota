import java.util.Scanner;

public class VentasTiendas {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int cantVendedores;
        int ventasEntre50Y500 = 0;
        int ventasMayores500 = 0;
        double totalVendido = 0;
        int i = 0;

        System.out.print("Ingrese la cantidad de vendedores: ");
        cantVendedores = sc.nextInt();

        double ventas[] = new double[cantVendedores];

        while (i < cantVendedores) {

            System.out.print("Ingrese la venta del vendedor " + (i + 1) + ": ");
            ventas[i] = sc.nextDouble();

            if (ventas[i] >= 50 && ventas[i] <= 1000) {

                totalVendido += ventas[i];

                if (ventas[i] <= 500) {
                    ventasEntre50Y500++;
                } else {
                    ventasMayores500++;
                }

                i++;

            } else {
                System.out.println("Venta inválida. Debe estar entre 50 y 1000.");
            }
        }

        System.out.println("\nResultados:");
        System.out.println("Ventas entre 50 y 500: " + ventasEntre50Y500);
        System.out.println("Ventas mayores a 500: " + ventasMayores500);
        System.out.println("Total vendido por la tienda: " + totalVendido);

        sc.close();
    }
}
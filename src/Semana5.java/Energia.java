
import java.util.Scanner;
//Calcular el costo del consumo eléctrico según los kilovatios.
public class Energia {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        String nombre;
        double consumo, total;

        System.out.print("Nombre del cliente: ");
        nombre = entrada.nextLine();

        System.out.print("Kilovatios consumidos: ");
        consumo = entrada.nextDouble();

        if (consumo <= 100) {
            total = consumo * 500;
        } else if (consumo <= 200) {
            total = consumo * 650;
        } else {
            total = consumo * 800;
        }

        System.out.println("Cliente: " + nombre);
        System.out.println("Total del recibo: $" + total);

        entrada.close();
    }
}


import java.util.Scanner;
//El programa genera un número aleatorio entre 1 y 50 y permite intentar adivinarlo.
public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int secreto = (int)(Math.random() * 50) + 1;
        int numero;
        int intentos = 0;

        do {
            System.out.print("Adivine el numero (1-50): ");
            numero = teclado.nextInt();
            intentos++;

            if (numero < secreto) {
                System.out.println("El numero secreto es mayor");
            } else if (numero > secreto) {
                System.out.println("El numero secreto es menor");
            } else {
                System.out.println("Correcto, adivino el numero");
            }

        } while (numero != secreto);

        System.out.println("Intentos realizados: " + intentos);

        teclado.close();
    }
}

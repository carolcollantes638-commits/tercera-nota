
import java.util.Scanner;
//Solicitar 8 números y contar cuántos son positivos,
// cuántos negativos y cuántos son iguales a cero.
public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int numero;
        int positivos = 0;
        int negativos = 0;
        int ceros = 0;

        for (int i = 1; i <= 8; i++) {
            System.out.print("Ingrese un numero: ");
            numero = teclado.nextInt();

            if (numero > 0) {
                positivos++;
            } else if (numero < 0) {
                negativos++;
            } else {
                ceros++;
            }
        }

        System.out.println("Positivos: " + positivos);
        System.out.println("Negativos: " + negativos);
        System.out.println("Ceros: " + ceros);

        teclado.close();
    }
}

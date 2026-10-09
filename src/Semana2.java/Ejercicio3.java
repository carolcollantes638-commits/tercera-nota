import java.util.Scanner;
//Pedir un número y mostrar su tabla de multiplicar del 1 al 10.
public class Ejercicio3 {
    public static void main(String[] args) {
        try (Scanner teclado = new Scanner(System.in)) {
            int numero;
            
            System.out.print("Ingrese un numero: ");
            numero = teclado.nextInt();
            
            for (int i = 1; i <= 10; i++) {
                System.out.println(numero + " x " + i + " = " + (numero * i));
            }
        }
    }
}

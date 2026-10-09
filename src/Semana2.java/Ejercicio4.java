import java.util.Scanner;
//Solicitar diez números, guardarlos en un arreglo y calcular su suma.
public class Ejercicio4 {
    public static void main(String[] args) {
        try (Scanner teclado = new Scanner(System.in)) {
            int[] numeros = new int[10];
            int suma = 0;
            
            for (int i = 0; i < 10; i++) {
                System.out.print("Ingrese un numero: ");
                numeros[i] = teclado.nextInt();
                
                suma = suma + numeros[i];
            }
            
            System.out.println("La suma total es: " + suma);
        }
    }
}

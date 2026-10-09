import java.util.Scanner;
//Solicitar cinco notas, calcular el promedio e indicar si el estudiante aprobó. 
// Se aprueba con una nota de 3.0 o superior.
public class Ejercicio2 {
    public static void main(String[] args) {
        try (Scanner teclado = new Scanner(System.in)) {
            double nota, suma = 0, promedio;
            for (int i = 1; i <= 5; i++) {
                System.out.print("Ingrese la nota " + i + ": ");
                nota = teclado.nextDouble();
                suma = suma + nota;
            }   promedio = suma / 5;
            System.out.println("El promedio es: " + promedio);
            if (promedio >= 3.0) {
                System.out.println("Estudiante aprobado");
            } else {
                System.out.println("Estudiante no aprobado");
            }
        }
    }
}
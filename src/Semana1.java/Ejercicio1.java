import java.util.Scanner;
//Problema 1. Promedio de notas
//Realice un programa en Java que permita ingresar las 5 notas de un estudiante. 
//El programa debe calcular el promedio de las notas y mostrar si el estudiante
//aprobó o no aprobó, teniendo en cuenta que se aprueba con un promedio igual o superior a 3.0.
public class Ejercicio1 {
    public static void main(String[] args) {

        try (Scanner teclado = new Scanner(System.in)) {
            double[] notas = new double[5];
            double suma = 0;
            double promedio;

            for (int i = 0; i < 5; i++) {
                System.out.print("Ingrese la nota " + (i + 1) + ": ");
                notas[i] = teclado.nextDouble();

                suma = suma + notas[i];
            }

            promedio = suma / 5;

            System.out.println("El promedio es: " + promedio);

            if (promedio >= 3.0) {
                System.out.println("El estudiante aprobo.");
            } else {
                System.out.println("El estudiante no aprobo.");
            }
        }
    }
}

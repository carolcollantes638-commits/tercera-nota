import java.util.Scanner;
//Problema 4. Notas de estudiantes
//Una institución necesita registrar las notas de 4 estudiantes en 3 materias. La información debe almacenarse en una matriz de 4 × 3.
//El programa debe:
//- Solicitar las 3 notas de cada estudiante.
//- Calcular el promedio de cada estudiante.
//- Mostrar el promedio.
//- Indicar si el estudiante está APROBADO o NO APROBADO.
public class Ejercicio4 {
    public static void main(String[] args) {

        try (Scanner teclado = new Scanner(System.in)) {
            double[][] notas = new double[4][3];

      
            for (int estudiante = 0; estudiante < 4; estudiante++) {

                System.out.println("\nEstudiante " + (estudiante + 1));

                for (int materia = 0; materia < 3; materia++) {

                    System.out.print("Ingrese nota de la materia "
                            + (materia + 1) + ": ");

                    notas[estudiante][materia] = teclado.nextDouble();
                }
            }

            
            System.out.println("\nResultados:");

            for (int estudiante = 0; estudiante < 4; estudiante++) {

                double suma = 0;

                for (int materia = 0; materia < 3; materia++) {
                    suma = suma + notas[estudiante][materia];
                }

                double promedio = suma / 3;

                System.out.println("Estudiante " + (estudiante + 1));
                System.out.println("Promedio: " + promedio);

                if (promedio >= 3.0) {
                    System.out.println("Estado: APROBADO");
                } else {
                    System.out.println("Estado: NO APROBADO");
                }
            }
        }
    }
}
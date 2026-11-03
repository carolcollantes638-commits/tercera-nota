
import java.util.Scanner;

public class NotasEstudiantes {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int cantEstudiantes;
        int notasEntre3Y4 = 0;
        int notasMayores4 = 0;
        double sumaNotas = 0;
        int i = 0;

        System.out.print("Ingrese la cantidad de estudiantes: ");
        cantEstudiantes = sc.nextInt();

        double notas[] = new double[cantEstudiantes];

        while (i < cantEstudiantes) {

            System.out.print("Ingrese la nota del estudiante " + (i + 1) + ": ");
            notas[i] = sc.nextDouble();

            if (notas[i] >= 0 && notas[i] <= 5) {

                sumaNotas += notas[i];

                if (notas[i] >= 3 && notas[i] <= 4) {
                    notasEntre3Y4++;
                } else if (notas[i] > 4) {
                    notasMayores4++;
                }

                i++;

            } else {
                System.out.println("Nota inválida. Debe estar entre 0 y 5.");
            }
        }

        System.out.println("\nResultados:");
        System.out.println("Estudiantes con notas entre 3.0 y 4.0: " + notasEntre3Y4);
        System.out.println("Estudiantes con notas mayores a 4.0: " + notasMayores4);
        System.out.println("Suma total de las notas: " + sumaNotas);

        sc.close();
    }
}

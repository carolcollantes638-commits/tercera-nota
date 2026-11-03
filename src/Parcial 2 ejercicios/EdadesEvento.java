
import java.util.Scanner;

public class EdadesEvento {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;
        int mayores18a30 = 0;
        int mayores30 = 0;
        int suma = 0;

        System.out.print("Ingrese la cantidad de personas: ");
        n = sc.nextInt();

        int edades[] = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese la edad de la persona " + (i + 1) + ":");
            edades[i] = sc.nextInt();

            if (edades[i] >= 18 && edades[i] <= 30){
                mayores18a30++;
            }
            if (edades[i] > 30) {
                mayores30++;
            }
            suma = suma + edades[i];
        }

        System.out.println("Personas entre 18 y 30 años: " + mayores18a30);
        System.out.println("Personas mayores de 30 años: " + mayores30);
        System.out.println("Suma total de las edades: " + suma);
        }
}

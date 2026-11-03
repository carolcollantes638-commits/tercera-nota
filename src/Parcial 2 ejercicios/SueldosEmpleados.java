
import java.util.Scanner;

public class SueldosEmpleados {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n;
        int entre100y300 = 0;
        int mayores300 = 0;
        int total = 0;

        System.out.print("Ingrese la cantidad de empleados: ");
        n = sc.nextInt();

        int sueldos[] = new int[n];

        for (int i = 0; i < n; i++) {

            System.out.print("Ingrese el sueldo del empleado " + (i + 1) + ": ");
            sueldos[i] = sc.nextInt();

            if (sueldos[i] >= 100 && sueldos[i] <= 300) {
                entre100y300++;
            }

            if (sueldos[i] > 300) {
                mayores300++;
            }

            total = total + sueldos[i];
        }

        System.out.println("Empleados que cobran entre 100 y 300: " + entre100y300);
        System.out.println("Empleados que cobran más de 300: " + mayores300);
        System.out.println("Total gastado en sueldos: " + total);

        sc.close();
    }
}

import java.util.Scanner;
//Crear un programa que solicite tres números e indique cuál es el mayor
public class Ejercicio1 {
    public static void main(String[] args) {
        try (Scanner teclado = new Scanner(System.in)) {
            int num1, num2, num3;
            System.out.print("Ingrese el primer numero: ");
            num1 = teclado.nextInt();
            System.out.print("Ingrese el segundo numero: ");
            num2 = teclado.nextInt();
            System.out.print("Ingrese el tercer numero: ");
            num3 = teclado.nextInt();
            if (num1 >= num2 && num1 >= num3) {
                System.out.println("El mayor es: " + num1);
            } else if (num2 >= num1 && num2 >= num3) {
                System.out.println("El mayor es: " + num2);
            } else {
                System.out.println("El mayor es: " + num3);
            }
        }
    }
}
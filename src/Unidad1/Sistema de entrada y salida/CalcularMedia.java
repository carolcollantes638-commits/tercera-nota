import java.util.Scanner;

public class CalcularMedia {
    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- Calculadora de Media de Tres Números ---");

        
        System.out.print("Introduce el primer número: ");
        double numero1 = scanner.nextDouble();

        System.out.print("Introduce el segundo número: ");
        double numero2 = scanner.nextDouble();

        System.out.print("Introduce el tercer número: ");
        double numero3 = scanner.nextDouble();

       
        double media = (numero1 + numero2 + numero3) / 3.0;

    
        System.out.println("\nEl resultado de la media es: " + media);

       
        scanner.close();
    }
}
import java.util.Scanner;

public class DatosUsuario {
    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- Registro de Datos Personales ---");

        
        System.out.print("Introduce tu nombre: ");
        String nombre = scanner.nextLine();

        
        System.out.print("Introduce tu edad: ");
        int edad = scanner.nextInt();

        
        System.out.print("Introduce tu altura en metros (ej. 1.75): ");
        double altura = scanner.nextDouble();

        
        System.out.println("\n¡Hola, " + nombre + "!");
        System.out.println("Tus datos registrados son los siguientes:");
        System.out.println("- Edad: " + edad + " años");
        System.out.println("- Altura: " + altura + " metros");

        
        scanner.close();
    }
}
//Declara y asigna valores a variables que representen la edad, altura, 
//inicial del nombre, y si una persona es mayor de edad o no.
public class Constates {
    public static void main(String[] args) {
    
        int edad = 25;
        double altura = 1.68;         
        char inicial = 'N';
        boolean esMayorDeEdad = edad >= 18;

        System.out.println("Edad: " + edad);
        System.out.println("Altura: " + altura + " m");
        System.out.println("Inicial: " + inicial);
        System.out.println("¿Es mayor de edad? " + esMayorDeEdad);
    }
}
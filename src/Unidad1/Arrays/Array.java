public class Array {
    public static void main(String[] args) {
        
        int[] numeros = {10, 20, 30, 40, 50};

        
        System.out.println("El primer número es: " + numeros[0]); // Imprime 10
        System.out.println("El segundo número es: " + numeros[1]); // Imprime 20

        
        numeros[2] = 100;
        System.out.println("El tercer número ahora es: " + numeros[2]); // Imprime 100
    }
}
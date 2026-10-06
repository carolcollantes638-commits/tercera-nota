
//Problema 3. Número mayor y menor
//Realice un programa en Java que solicite 5 números enteros. El programa debe 
//almacenarlos en un arreglo y determinar cuál es el número mayor y cuál es el número menor.
public class Ejercicio3 {
    public static void main(String[] args) {

        try (Scanner teclado = new Scanner(System.in)) {
            int[] numeros = new int[5];

            for (int i = 0; i < 5; i++) {
                System.out.print("Ingrese el numero " + (i + 1) + ": ");
                numeros[i] = teclado.nextInt();
            }

            int mayor = numeros[0];
            int menor = numeros[0];

            for (int i = 1; i < 5; i++) {

                if (numeros[i] > mayor) {
                    mayor = numeros[i];
                }

                if (numeros[i] < menor) {
                    menor = numeros[i];
                }
            }

            System.out.println("El numero mayor es: " + mayor);
            System.out.println("El numero menor es: " + menor);
        }
    }
}
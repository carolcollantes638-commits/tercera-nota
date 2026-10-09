import java.util.Scanner;
//Una fábrica tiene 3 máquinas y registra la producción durante 4 días. 
// Guardar los datos en una matriz y calcular la producción total de cada máquina.
public class Ejercicio5 {
    public static void main(String[] args) {
        try (Scanner teclado = new Scanner(System.in)) {
            int[][] produccion = new int[3][4];
            int suma;
            
            for (int i = 0; i < 3; i++) {
                System.out.println("Maquina " + (i + 1));
                
                for (int j = 0; j < 4; j++) {
                    System.out.print("Produccion del dia " + (j + 1) + ": ");
                    produccion[i][j] = teclado.nextInt();
                }
            }
            
            for (int i = 0; i < 3; i++) {
                suma = 0;
                
                for (int j = 0; j < 4; j++) {
                    suma = suma + produccion[i][j];
                }
                
                System.out.println("Total de la maquina " + (i + 1) + ": " + suma);
            }
        }
    }
}

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int candidato1 = 0;
        int candidato2 = 0;
        int candidato3 = 0;
        int voto;

        for (int i = 1; i <= 10; i++) {
            System.out.println("\nEstudiante " + i);
            System.out.println("1. Candidato 1");
            System.out.println("2. Candidato 2");
            System.out.println("3. Candidato 3");
            System.out.print("Ingrese su voto: ");
            voto = teclado.nextInt();

            switch (voto) {
                case 1:
                    candidato1++;
                    break;
                case 2:
                    candidato2++;
                    break;
                case 3:
                    candidato3++;
                    break;
                default:
                    System.out.println("Voto no valido");
                    i--;
                    break;
            }
        }

        System.out.println("\nResultados:");
        System.out.println("Candidato 1: " + candidato1 + " votos");
        System.out.println("Candidato 2: " + candidato2 + " votos");
        System.out.println("Candidato 3: " + candidato3 + " votos");

        if (candidato1 > candidato2 && candidato1 > candidato3) {
            System.out.println("Gano el candidato 1");
        } else if (candidato2 > candidato1 && candidato2 > candidato3) {
            System.out.println("Gano el candidato 2");
        } else if (candidato3 > candidato1 && candidato3 > candidato2) {
            System.out.println("Gano el candidato 3");
        } else {
            System.out.println("Hay un empate");
        }

        teclado.close();
    }
}


import java.util.Scanner;
//Registrar los votos de tres candidatos y determinar el ganador.
public class Votacion {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int candidato1 = 0;
        int candidato2 = 0;
        int candidato3 = 0;
        int voto;

        do {
            System.out.println("\n--- SISTEMA DE VOTACION ---");
            System.out.println("1. Candidato Juan");
            System.out.println("2. Candidato Maria");
            System.out.println("3. Candidato Pedro");
            System.out.println("0. Finalizar votacion");

            System.out.print("Ingrese su voto: ");
            voto = entrada.nextInt();

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
                case 0:
                    System.out.println("Votacion finalizada");
                    break;
                default:
                    System.out.println("Voto no valido");
            }

        } while (voto != 0);

        System.out.println("\n--- RESULTADOS ---");
        System.out.println("Juan: " + candidato1);
        System.out.println("Maria: " + candidato2);
        System.out.println("Pedro: " + candidato3);

        if (candidato1 > candidato2 && candidato1 > candidato3) {
            System.out.println("Ganador: Juan");
        } else if (candidato2 > candidato1 && candidato2 > candidato3) {
            System.out.println("Ganador: Maria");
        } else if (candidato3 > candidato1 && candidato3 > candidato2) {
            System.out.println("Ganador: Pedro");
        } else {
            System.out.println("Hay un empate");
        }

        entrada.close();
    }
}

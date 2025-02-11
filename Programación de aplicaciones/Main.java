import java.util.*;
public class Main {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int[] votos = new int[10];
    int totalVotos = 0;

    System.out.println("Ingrese el número del candidato (ingrese 0 para terminar):");
        while (true) {
            int voto = scanner.nextInt();
            if (voto == 0) {
                break;
            }
            if (voto > 0 && voto < votos.length) {
                votos[voto]++;
                totalVotos++;
            } else {
                System.out.println("Número de candidato inválido. Intente de nuevo.");
            }
        }

        System.out.println("Resultados:");
        for (int i = 1; i < votos.length; i++) {
            if (votos[i] > 0) {
                double porcentaje = (votos[i] / (double) totalVotos) * 100;
                System.out.printf("Candidato %d: %d votos (%.2f%%)\n", i, votos[i], porcentaje);
            }       
        } 
        scanner.close();
    }
}
package metodos1atividade;

import java.util.Scanner;

public class Atividade3 {
    
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o valor de início: ");
        int inicio = scanner.nextInt();
        
        System.out.print("Digite o valor de fim: ");
        int fim = scanner.nextInt();
        
        System.out.println("Números primos no intervalo de " + inicio + " a " + fim + ":");
        encontrarPrimosIntervalo(inicio, fim);

        scanner.close();
    }

    public static void encontrarPrimosIntervalo(int inicio, int fim) {
        for (int num = inicio; num <= fim; num++) {
            if (ePrimo(num)) {
                System.out.print(num + " ");
            }
        }
        System.out.println(); 
    }

    public static boolean ePrimo(int num) {
        if (num <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }
}









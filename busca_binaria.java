package metodos_de_busca;

import java.util.Scanner;

public class busca_binaria {
    public static void buscaBinaria(int vetor[],int valor){
        int inicio = 0;
        int fim =  vetor.length-1;
        int posicao = -1;
        int contagem = 0;
        long tempoInicial = System.nanoTime();
        while (inicio<=fim) {
            int meio = (inicio+fim)/2;
            contagem++;
            if(vetor[meio] == valor){
                posicao = meio;
                break;
            }else if(vetor[meio] < valor){
                inicio = meio + 1;
            }
            else if(vetor[meio] > valor){
                fim = meio - 1;
            }
        }
        long tempoFinal = System.nanoTime();
        long tempo = tempoFinal-tempoInicial;
        double segundo = (double) tempo / 1_000_000_000.0;
        System.out.println("o tempo em segundos é " + segundo + " segundos");
        System.out.println("a posicao é " + posicao);
        System.out.println("a quantidade de comparaceos foi " + contagem);
    }

public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int vetor[] = new int[10];
        for(int i = 0 ; i < vetor.length;i++){
            vetor[i]=(int)(Math.random()*10);
            System.out.print(" "+vetor[i]+" ");
        }
        System.out.println();
        quickSort.quickSort(vetor, 0, vetor.length-1);
        for(int i = 0 ; i < vetor.length;i++){
            System.out.print(" "+vetor[i]+" ");
        } 
        System.out.println();
        System.out.println("Digite o numero desejado");
        int valor = ler.nextInt();
        buscaBinaria(vetor, valor);
    }
}

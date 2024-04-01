package metodos_de_busca;
import java.util.Scanner;
import metodos_de_busca.quickSort;
public class busca_sequencial {
    public static void buscaSequencial(int vetor[],int valor){
        int posicao = -1;
        int contagem =0 ;
        long tempoInicial = System.nanoTime();
        if(valor < vetor[0] || valor > vetor[vetor.length-1]){
            for(int i = 0; i < vetor.length;i++){
                contagem++;
                if(valor==vetor[i]){
                    posicao = i;
                    break;
                }
            }
        long tempoFinal = System.nanoTime();
        long tempo = tempoFinal-tempoInicial;
        double segundo = (double) tempo / 1_000_000_000.0;
        System.out.println("o tempo em segundos é" + segundo);
        }
        System.out.println("a posicao é a "+posicao);
        System.err.println("a quatidade de comparações é " + contagem );
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
        buscaSequencial(vetor, valor);
    }
}

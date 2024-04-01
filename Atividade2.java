package metodos1atividade;
import java.util.Scanner;
public class Atividade2 {
    public static int sequenciaFibonacci(int escolha){
        int resultadoEsperado = 0,primeiroN = 0, segundoN = 1, resultado = 0;
        for(int i = 1; i < escolha-1; i++){

            resultado = primeiroN + segundoN;
            primeiroN = segundoN;
            segundoN = resultado;
            resultadoEsperado = resultado;
        }    
        return resultado;
    }
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

    System.out.println("informe um valor");
        int escolha = ler.nextInt();
        sequenciaFibonacci(escolha);
        System.out.println(sequenciaFibonacci(escolha));
        ler.close();
    }
}

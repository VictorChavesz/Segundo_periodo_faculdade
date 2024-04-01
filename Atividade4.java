package metodos1atividade;
import java.util.Scanner;

public class Atividade4 {
     public static int calcularPotencia(int base, int expoente){
        
        double resultado = Math.pow(base, expoente);
        int resultadoInt = (int) resultado;

        return resultadoInt;
     }

     public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("digite o valor da base");
        int base = ler.nextInt();
        System.out.println("digite o valor do expoente");
        int expoente = ler.nextInt();

        System.out.println("o valor de " + base + " elevado á "+ expoente + " é "+calcularPotencia(base, expoente));
        
        ler.close();
      }
}

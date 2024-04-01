package metodos;

import java.util.Scanner;

public class Atividade2 {
    
    public static void numParImpar(int num){
        if(num%2==0){
            System.out.printf("%d é par",num);
        }else{
           System.out.printf("%d é impar",num); 
        }
    }
    public static void main(String[] args) {
    Scanner ler = new Scanner(System.in); 
     
    System.out.println("informe um numero inteiro positivo");
    numParImpar(ler.nextInt());

    }
}

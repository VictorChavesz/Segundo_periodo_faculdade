package metodos1atividade;

import java.util.Scanner;
public class Atividade1 {
    public static boolean verficarPalindromo(String nome){
        int contador = 0;
        for(int i = 0; i < nome.length();i++){
            if(nome.charAt((nome.length()-i)-1)==nome.charAt(i)){
                contador++;
            }
        }
        if(contador==nome.length()){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Escreva uma palavra");
        String nome = ler.nextLine();
        if(verficarPalindromo(nome)){
            System.out.println("é palindromo");
        }else{
            System.out.println("não é palindromo");
        }
        ler.close();
    }
}

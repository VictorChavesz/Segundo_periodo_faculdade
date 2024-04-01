package atividadesRevisao;
import java.util.Scanner;
public class atividade1FP {
    public static void imprimirMatriz(String matriz[][]){
        for(int i = 0 ; i < matriz.length ; i++){
            for(int j = 0 ; j < matriz.length ; j++){
                if(matriz[i][j].toLowerCase().charAt(0)=='a' || matriz[i][j].toLowerCase().charAt(0)=='e'
                || matriz[i][j].toLowerCase().charAt(0)=='i' || matriz[i][j].toLowerCase().charAt(0)=='o'
                || matriz[i][j].toLowerCase().charAt(0)=='u'
                ){
                    System.out.printf(" %s ",matriz[i][j]);
                }else{
                    System.out.printf(" null ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        String matriz[][] = new String[2][2];
        Scanner ler = new Scanner(System.in);
        for(int i = 0 ; i < matriz.length; i++){
            for(int j = 0 ; j < matriz.length;j++){
                System.out.println("digite uma palavra");
                matriz[i][j] = ler.nextLine();
            }
        }
        imprimirMatriz(matriz);
    }
}

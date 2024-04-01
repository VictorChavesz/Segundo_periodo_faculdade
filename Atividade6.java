package metodos1atividade;

public class Atividade6 {
    
    public static void exbirMatriz(int matriz[][]){
        for(int i = 0; i < matriz.length;i++){
            for(int j = 0; j < matriz.length;j++){
                System.out.printf(" %d ", matriz[i][j]);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int tamanho = (int)(Math.random()*10);
        int matriz[][] = new int[tamanho][tamanho];

        for(int i = 0 ; i < tamanho ; i++){
            for(int j = 0 ; j < tamanho ; j++){
                matriz[i][j]=(int)(Math.random()*10);
            }
        }
        exbirMatriz(matriz);
    }
}

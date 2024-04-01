package atividadesRevisao;

public class atividade2VM {
    public static void main(String[] args) {
        int matriz[][] = new int[7][7];
        for(int i = 0 ; i < matriz.length;i++){
            for(int j = 0; j < matriz.length;j++){
                if(i==j){
                    matriz[i][j]=1;
                }else if(j==0){
                    matriz[i][j]=1;
                }
            }
        }
        for (int i = 2; i < matriz.length; i++) {
            for (int j = 1; j < i; j++) {
                matriz[i][j] = matriz[i - 1][j - 1] + matriz[i - 1][j];
            }
        }
        for(int i = 0 ; i < matriz.length;i++){
            for(int j = 0 ; j < matriz.length;j++){
                System.out.printf(" %d ", matriz[i][j]);
            }
            System.out.println();
        }
    }
}

package tarefa2509;
public class tarefa1dia25 {
    public static void main(String[] args) {
        int matriz[][] = new int[3][3];
        int vet[] = new int[9];

        for(int k = 0 ; k < 9 ; ){
             for(int i = 0 ; i < 3 ; i++){
                for(int j = 0 ; j < 3 ; j++){
                matriz[i][j]=(int)(Math.random()*10);
                vet[k]=matriz[i][j];
                k++;
                System.out.printf(" %d ",matriz[i][j]);
                }
                System.out.println();
            }
        }
        int aux;
        for (int i = 1; i < vet.length; i++) {
            for (int j = 0; j < vet.length-1; j++) {
                if (vet[j] > vet[j + 1]) {
                    aux = vet[j];
                    vet[j] = vet[j + 1];
                    vet[j + 1] = aux;
                }
            }
      	 }
        
         System.out.println("------------------------------------");

         for(int k = 0 ; k < 9 ; ){
             for(int i = 0 ; i < 3 ; i++){
                for(int j = 0 ; j < 3 ; j++){
                matriz[i][j]=vet[k];
                k++;
                System.out.printf(" %d ",matriz[i][j]);
                }
                System.out.println();
            }
        }
    }
}

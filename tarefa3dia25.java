package tarefa2509;

public class tarefa3dia25 {
    public static void main(String[] args) {
        int matriz[][] = new int[5][5];
        int vet[] = new int[25];

        for(int k = 0 ; k < 25 ; ){
            for(int i = 0 ; i < 5 ; i++){
               for(int j = 0 ; j < 5; j++){
               matriz[i][j]=(int)(Math.random()*10);
               vet[k]=matriz[i][j];
               k++;
               System.out.printf(" %d ",matriz[i][j]);
               }
               System.out.println();
           }
       }
       int min,aux;
       for (int i = 0; i <vet.length - 1; i++) {
        min = i;
         for (int j = i + 1; j < vet.length; j++) {

            if (vet[j] < vet[min]) {
                min = j;
            }
        }
        aux = vet[min];
        vet[min] = vet[i];
        vet[i] = aux;
    }
    System.out.println("o menor valor é "+vet[0]);
    }

}

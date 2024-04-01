package tarefa2509;

public class tarefa4dia25 {
    public static void main(String[] args) {
        int matriz[][] = new int[4][4];
        int vet[] = new int[4];
        int k = 0;

        for(int i = 0 ; i < 4 ; i++){
            for(int j = 0 ; j < 4; j++){
            matriz[i][j]=(int)(Math.random()*10);
                if(i==j){vet[k]=matriz[i][j];
                k++;
                }
            System.out.printf(" %d ",matriz[i][j]);
            }
            System.out.println();
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
            System.out.println("-----------------");
            System.out.println("matriz ordenada");
            k=0;
        for(int i = 0 ; i < 4 ; i++){
            for(int j = 0 ; j < 4; j++){
                if(i==j){
                matriz[i][j]=vet[k];
                k++;
                }
            System.out.printf(" %d ",matriz[i][j]);
            }
            System.out.println();
           }

    }
}

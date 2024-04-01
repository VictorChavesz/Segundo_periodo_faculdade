package atividadesRevisao;

public class atividade1VM {
public static void main(String[] args) {
        int vetor[] = new int[20];
            for(int i = 0; i < vetor.length;i++ ){
                if(i == 0){
                vetor[i]=0;
                System.out.println(vetor[i]);
                }else if(i == 1){
                vetor[i]=0;
                System.out.println(vetor[i]);
                }else if(i == 2){
                    vetor[i]=1;
                    System.out.println(vetor[i]);
                }else{
                    vetor[i]=vetor[i-1]+vetor[i-2]+vetor[i-3];
                    System.out.println(vetor[i]);
                }
        }
    }
}

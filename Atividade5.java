package metodos1atividade;

public class Atividade5 {
    
    public static void exbirVetor( int vetor[]){
        for(int i = 0 ; i < vetor.length;i++){
            System.out.println(vetor[i]);
        }
    }
    public static void main(String[] args) {
        int vetor[] = new int[(int)(Math.random()*10)];

        for(int i = 0 ; i < vetor.length;i++){
            vetor[i]=(int)(Math.random()*100);
        }
        exbirVetor(vetor);
    }
}

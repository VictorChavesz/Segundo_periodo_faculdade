package tarefa2509;

public class tarefa2dia25{

    public static void ordenacao(int vet[]) {
        int j, chave;
        for (int i = 1; i < vet.length; i++) {
            chave = vet[i];
            j = i - 1;
            while (j >= 0 && chave < vet[j]) {
                vet[j + 1] = vet[j];
                j--;
            }
            vet[j + 1] = chave;
        }
        for(int t : vet){
            System.out.print(t);
        }
    }

    public static void main(String[] args) {
        int tamanho = 4;
        int matriz[][] = new int[tamanho][tamanho];
        int vet0[] = new int[tamanho];
        int vet1[] = new int[tamanho];
        int vet2[] = new int[tamanho];
        int vet3[] = new int[tamanho];

        int k = 0;

        for (int i = 0; i < tamanho; i++) {
            for (int j = 0; j < tamanho; j++) {
                matriz[i][j] = (int) (Math.random() * 100);
                if (j == 0) {
                    vet0[k] = matriz[i][j];
                } else if (j == 1) {
                    vet1[k] = matriz[i][j];
                } else if (j == 2) {
                    vet2[k] = matriz[i][j];
                } else {
                    vet3[k] = matriz[i][j];
                }
                System.out.printf(" %d ", matriz[i][j]);
            }
            System.out.println();
            k++;
        }
        for(int d : vet0){
            System.out.println(d);
        }

        ordenacao(vet0);
        System.out.println();
        ordenacao(vet1);
        System.out.println();
        ordenacao(vet2);
        System.out.println();
        ordenacao(vet3);

        System.out.println();
        System.out.println("----------------------------");

        k = 0;
        for (int i = 0; i < tamanho; i++) {
            for (int j = 0; j < tamanho; j++) {
                if (j == 0) {
                    matriz[i][j] = vet0[k];
                } else if (j == 1) {
                    matriz[i][j] = vet1[k];
                } else if (j == 2) {
                    matriz[i][j] = vet2[k];
                } else {
                    matriz[i][j] = vet3[k];
                }
                System.out.printf(" %d ", matriz[i][j]);
            }
            System.out.println();
            k++;
        }
    }
}

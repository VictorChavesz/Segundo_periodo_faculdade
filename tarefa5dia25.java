package tarefa2509;

public class tarefa5dia25 {
    public static void imprimirMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
    
    public static void ordenarLinhasBubble(int[][] matriz) {
        int linhas = matriz.length;
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < linhas - 1; j++) {
                if (matriz[j][0] > matriz[j + 1][0]) {
                    int[] temp = matriz[j];
                    matriz[j] = matriz[j + 1];
                    matriz[j + 1] = temp;
                }
            }
        }
    }
    
    public static void ordenarColunasInsertion(int[][] matriz) {
        int linhas = matriz.length;
        int colunas = matriz[0].length;
        for (int col = 0; col < colunas; col++) {
            for (int i = 1; i < linhas; i++) {
                int chave = matriz[i][col];
                int j = i - 1;
                while (j >= 0 && chave < matriz[j][col]) {
                    matriz[j + 1][col] = matriz[j][col];
                    j--;
                }
            }
        }
    }
    
    public static void ordenarDiagonalPrincipalSelection(int[][] matriz) {
        int n = matriz.length;
        for (int i = 0; i < n - 1; i++) {
            int indiceMin = i;
            for (int j = i + 1; j < n; j++) {
                if (matriz[j][j] < matriz[indiceMin][indiceMin]) {
                    indiceMin = j;
                }
            }
            if (indiceMin != i) {
                int temp = matriz[i][i];
                matriz[i][i] = matriz[indiceMin][indiceMin];
                matriz[indiceMin][indiceMin] = temp;
            }
        }
    }
    
    public static void main(String[] args) {
        int[][] matriz = new int[3][3];
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j] = (int) (Math.random() * 100);
            }
        }
        
        System.out.println("Matriz original:");
        imprimirMatriz(matriz);
        
        ordenarLinhasBubble(matriz);
        ordenarColunasInsertion(matriz);
        ordenarDiagonalPrincipalSelection(matriz);
        
        System.out.println("Matriz ordenada");
        imprimirMatriz(matriz);
    }
        
    }


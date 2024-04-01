package atividadesRevisao;

public class atividade2FP {
    public static boolean primo(int numero) {
        if (numero <= 1) {
            return false;
        }
        if (numero <= 3) {
            return true;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static int contarNumerosPrimos(int[][] matriz) {
        int count = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (primo(matriz[i][j])) {
                    count++;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int matriz[][] = new int[3][3];
        for(int i = 0 ; i < matriz.length ; i++ ){
            for(int j = 0 ; j < matriz.length ; j++){
                matriz[i][j]=(int)(Math.random()*10);
                System.out.printf(" %d ", matriz[i][j]);
            }
            System.out.println();
        }
        int resultado = contarNumerosPrimos(matriz);
        System.out.println("a matriz possui "+ resultado + " numeros primos");
    }
}

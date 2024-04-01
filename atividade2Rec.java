package atividadesRevisao;

public class atividade2Rec {
    public static boolean primoo(int numero) {
        if (numero <= 1) {
            return false;
        }
        return primoReccursivo(numero, 2);
    }
    
    public static boolean primoReccursivo(int numero, int divisor) {
        if (divisor > Math.sqrt(numero)) {
            return true;
        }
        if (numero % divisor == 0) {
            return false;
        }
        return primoReccursivo(numero, divisor + 1);
    }
    public static void main(String[] args) {
        int num = 4;
        boolean resultado = primoo(num);
        if(resultado==true)
        System.out.println(num + " é primo");
        else
        System.out.println(num + " não é primo");
    }
}

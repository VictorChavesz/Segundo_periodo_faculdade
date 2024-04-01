package atividadesRevisao;

public class atividade1Rec {
    public static int pares(int num){
       if(num%2==0)
       return num;
       else
       return 0;
    }
    public static void main(String[] args) {
        int num = 4;
        pares(num);
        if(pares(num)!=0){
            System.out.printf("%d é par",num);
        }else{
           System.out.printf("%d é impar",num); 
        }
    }
}

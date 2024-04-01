package metodos;

public class Atividade1 {
    public static void exibirNum(){
        
        for(int i = 1; i <=10;i++){
            System.out.println(i);
        }
    }
    public static void separacao(){
        System.out.println("---------------------------------------------------");
    }
    public static void numPar(){
        for(int i = 0; i <=100;i++){
            if(i%2==0){
                System.out.println(i);
            }
        }
    }
    public static void tabuada5(){
        int resultado=0;
        for(int i = 0; i <=10; i++){
            resultado=5*i;
            System.out.printf("5x%d=%d \n",i,resultado);
        }
    }
    public static void main(String[] args) {
        System.out.println("contagem de 1 a 10");
        exibirNum();
        
        separacao();

        System.out.println("os pares são");
        numPar();
        
        separacao();
        
        System.out.println("a tabuada de 5 é");
        tabuada5();

        separacao();
    }
}

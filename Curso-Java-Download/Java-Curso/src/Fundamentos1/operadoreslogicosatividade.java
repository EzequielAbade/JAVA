package Fundamentos1;
public class operadoreslogicosatividade {
    public static void main(String[] args) {

    boolean trabalho1 = false;
    boolean trabalho2 = false;

    boolean comproutv50 = trabalho1 && trabalho2;
    boolean comproutv32 = trabalho1 ^ trabalho2;
    boolean comprousorvete = trabalho1 || trabalho2;

    boolean maissaudavel = !comprousorvete;

    System.out.println("Comprou Tv 50\"?" + comproutv50);
    System.out.println("Comprou Tv 50\"?" + comproutv32);
    System.out.println("Comprou Tv 32\"Sorvete ?" + comprousorvete);

    System.out.println("Mais Saudável? " + maissaudavel); 
           
    }
    
}

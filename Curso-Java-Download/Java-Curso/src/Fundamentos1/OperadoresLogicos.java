package Fundamentos1;
public class OperadoresLogicos {
    
    public static void main(String[] args) {

        boolean condicao1 = true;
        boolean condicao2 = 3 > 7;

        System.out.println(condicao1 && condicao2);
        System.out.println(condicao1 && !condicao2);
        System.out.println(condicao1 || condicao2);
        System.out.println(condicao1 ^ condicao2);
        System.out.println(!condicao1);
        System.out.println(!!condicao1);
        System.out.println(!condicao2);

        System.out.println("\n Tabela Verdade E");
        System.out.println(true && true );
        System.out.println(true && false);
        System.out.println(false && true);
        System.out.println(false && false);

        System.out.println("\n Tabela Verdade ou (or) ");
        System.out.println(true || true);
        System.out.println(true || false);
        System.out.println(false || true);
        System.out.println(false || false);

        System.out.println("\n Tabela verdade OU Exclusivo (XOR) ");
        System.out.println(true ^ true );
        System.out.println(true ^ false);
        System.out.println(false ^ true);
        System.out.println(false ^ false);
        
        System.out.println("\n Tabela verdade NOT ");
        System.out.println(!true);
        System.out.println(!false);
        


    }
}

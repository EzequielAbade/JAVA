package Fundamentos1;
import java.util.Scanner;

public class Relacionais {
    public static void main(String[] args) {    
        Scanner leitor = new Scanner(System.in);
        // = igual
        // > maior
        // >= maior ou igual
        // < menor
        // <= menor ou igual
        // != diferente 
        
        int a = 97;
        int b = 'a';

        System.out.println(a == b);
        System.out.println(3 > 4);
        System.out.println(3 >= 4);
        System.out.println(3 < 7);
        System.out.println(30 <= 7);
        System.out.println(30 != 7);
        System.out.println("digite a nota: ");
        double nota = leitor.nextDouble();
        boolean bomcompartamento = true;
        boolean passoupormédia = nota >= 7;
        boolean temdesconto = bomcompartamento && passoupormédia;
        
        System.out.println("Tem desconto? " + temdesconto);
         leitor.close();
         
    }
    
}

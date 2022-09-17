package Estruturas_de_controle2;

import java.util.Scanner;

public class whileee_indeterminado {
   
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        String valor = "";
        
        while(!valor.equalsIgnoreCase("sair")) {
            System.out.println(" Você diz: ");
            valor = leitor.nextLine();
        }

        leitor.close();
    
    }
    

}

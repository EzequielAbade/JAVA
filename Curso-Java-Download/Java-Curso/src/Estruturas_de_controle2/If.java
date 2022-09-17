package Estruturas_de_controle2;

import java.util.Scanner;

// Não usar ; em estruturas de controles.

public class If {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        System.out.print("Informe a média: ");
        String notaaluno =  leitor.nextLine().replace(",", ".");
        double media = Double.parseDouble(notaaluno);
        

        if(media <= 10 && media >= 7){ 
        System.out.print("Aprovado! ");
        System.out.println("Parabéns.");}

        if(media < 7 && media >= 5 ) {
         System.out.print(" Não está Aprovado. Recuperação."); } 

         
        if(media < 5)
        { System.out.println("Aluno está reprovado."); }
        


        leitor.close();

    }
}

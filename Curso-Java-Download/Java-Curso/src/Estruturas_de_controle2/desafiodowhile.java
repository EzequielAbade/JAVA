package Estruturas_de_controle2;

import java.util.Scanner;

public class desafiodowhile {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        int quantidadenotas = 0;
        double nota = 0;
        double total = 0;

        while(nota != -1) {
            System.out.println("Informe a nota: ");
            nota = leitor.nextDouble();

            if(nota <= 10 && nota >= 0){
            total += nota;
            quantidadenotas++;}

            else if(nota != -1)
             {System.out.println("nota inválida!!! ;D");}
        }

        double media = total/quantidadenotas;
        System.out.println("média = " + media);
        leitor.close();
        
    }
    
}

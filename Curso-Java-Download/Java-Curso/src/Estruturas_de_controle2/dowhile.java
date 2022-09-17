package Estruturas_de_controle2;

import java.util.Scanner;

public class dowhile {
    public static void main(String[] args) {

        //if é necessário uma setença de codigo ou um bloco de codigos, ele define se executa ou n um determinado de codigo 
        //while é necessário uma senteça ou um bloco de codigos, o while só repete se for verdadeiro 
        //for é necessário 3 partes (inicialização da variavel; expressão; modificaçãodavariavel) pode ter uma senteça ou bloco de codigo
        //do + while necessita de ";" no final para ser executado

        Scanner leitor = new Scanner(System.in);

        String texto = "";

        do {
            System.out.println("Você precisa falar as palavras mágicas...");
            System.out.print("Quer sair ? ");
            texto = leitor.nextLine();


        } while(!texto.equalsIgnoreCase("por favor"));

        System.out.println("ta me devendo 20 conto!");



        leitor.close();
    }
    
}

package Estruturas_de_controle2;

import java.util.Scanner;

public class desafioif {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        System.out.println("Informe o dia da semana: ");
        String data = leitor.next();

        if(data.equalsIgnoreCase("domingo")) {System.out.println(1);}
        else if(data.equalsIgnoreCase("segunda")) {System.out.println(2);}
        else if(data.equalsIgnoreCase("terça")) {System.out.println(3);}
        else if(data.equalsIgnoreCase("quarta")) {System.out.println(4);}
        else if(data.equalsIgnoreCase("quinta")) {System.out.println(5);}
        else if(data.equalsIgnoreCase("sexta")) {System.out.println(6);}
        else if(data.equalsIgnoreCase("sabado")) {System.out.println(7);}
        else {System.out.println("dia Inválido!");}
        
       leitor.close();


    }
    
}

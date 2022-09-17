package Estruturas_de_controle2;

import java.util.Scanner;

public class switchsembreak {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite a cor de sua faixa de karatê: ");
        String faixa = leitor.nextLine().toLowerCase();

        switch (faixa.toLowerCase()) {
            case "preta": System.out.println("Sei o Bassai-Dai...");
            case "marrom": System.out.println("Sei o Tekki Shodan");
            case "rosa": System.out.println("Sei o Heian Godan");
            case "verde": System.out.println("Sei o Heian Yodan");
            case "laranja": System.out.println("Sei o Heian Sandan");
            case "vermelha": System.out.println("Sei o Heian Nidan");
            case "amarela": System.out.println("Sei o Heian Shodan");
            break;
            default: System.out.println("não sei nada");
        }
        System.out.println("Digite sua idadea até 3: ");
        int idade = leitor.nextInt();
        switch (idade) {
            case 3: System.out.println("Sabe programar!");
            case 2: System.out.println("Sabe falar!");
            case 1: System.out.println("Sabe Andar");
            case 0: System.out.println("Sabe respirar!");
        }
        leitor.close();
    }
    
}

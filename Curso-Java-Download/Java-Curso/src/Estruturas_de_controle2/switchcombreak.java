package Estruturas_de_controle2;

import java.util.Scanner;

public class switchcombreak {
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);

        System.out.println("Informe a nota: ");
        String conceito = leitor.next();
        int nota = 7;

        switch(nota) {
            case 10: case 9: conceito = "A";
            break;
            case 8: case 7: conceito = "B";
            break;
            case 6: case 5: conceito = "C";
            break;
            case 4: case 3: conceito = "D";
            break;
            case 2: case 1: conceito = "E";
            break;
            case 0: conceito = "F";
            break;
            default: conceito = "Não Informado!!";

        } System.out.println("conceito é " +  conceito) ;
     
        leitor.close();
    }
    
}

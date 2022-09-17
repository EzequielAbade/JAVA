package Fundamentos1;
import java.util.Scanner;

public class console {

    public static void main(String[] args) {
        
        //sysout.print serve para imprimir sem ser em linha
        //sysout.println é impresso por linha
        //sysout.printf mostra os dados na saída formatados
        // Scanner serve para escanear algo

         System.out.print("bom");
         System.out.print("dia\n");

         System.out.println("bom");
         System.out.println("dia");

         System.out.printf("Megasena: %d %d %d %d %d %d\n", 1,2,3,4,5,6);

         System.out.printf("Salário:  %.1f%n", 1234.5678);

         Scanner entrada = new Scanner(System.in);

         System.out.println("Digite o seu nome: ");
         String nome = entrada.nextLine();

         System.out.println("Digite o seu Sobrenome: ");
         String sobrenome = entrada.nextLine();

         System.out.println("Digite a sua idade: ");
         int idade = entrada.nextInt();


        System.out.println("\n Nome: " + nome + "\n Sobrenome: " + sobrenome + "\n Idade: " + idade);

        //System.out.printf("%s %s tem %d anos.%n", nome, sobrenome, idade);

        entrada.close();





    }
}
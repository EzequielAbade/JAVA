package Fundamentos1;
import java.util.Scanner;

public class atividadeconversão {
    public static void main(String[] args) {
    
    //.parse serve para fazer conversões, no caso fizemos a conversão de uma String para double
    //.replace serve  para substituir algum caracterer digitado por outro, no caso utilizamos o caractere "," que não é reconhecido no java pelo "."
   
    Scanner leitor = new Scanner(System.in);


    System.out.print("Informe o seu primeiro salario: ");
    String salario1 = leitor.nextLine().replace(",", ".");
    double valor1 = Double.parseDouble(salario1);
    
    System.out.print("informe o seu segundo salário: ");
    String salario2 = leitor.nextLine().replace(",", ".");
    double valor2 = Double.parseDouble(salario2);

    System.out.print("Informe o seu terceiro salário ");
    String salario3 = leitor.nextLine().replace(",", ".");
    double valor3 = Double.parseDouble(salario3);

    double resultado = valor1 + valor2 + valor3 / 3;
    System.out.println("A sua média Salarial é: " + resultado);


    leitor.close();


    }
    
}

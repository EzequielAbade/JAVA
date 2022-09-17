package Fundamentos1;
import java.util.Scanner;

public class DesafioCalculadora {
    public static void main(String[] args) {
        
     Scanner leitor = new Scanner (System.in);

     System.out.print("Qual é o seu primeiro Valor ? ");
     double valor1 = leitor.nextDouble();

     System.out.print("Informe a Operação? ");
     String op = leitor.next();

     System.out.print("Qual é o seu segundo Valor ? ");
     double valor2 = leitor.nextDouble();
     

     
     //Lógica do calculo
     double resultado = "+".equals(op) ? valor1 + valor2 : 0;
     resultado = "-".equals(op) ? valor1 - valor2 : resultado;
     resultado = "*".equals(op) ? valor1 * valor2 : resultado;
     resultado = "/".equals(op) ? valor1 / valor2 : resultado;
     resultado = "%".equals(op) ? valor1 % valor2 : resultado;
     
     System.out.printf("%.2f %s %.2f = %.2f", valor1, op, valor2, resultado);
     
     leitor.close();
     
    }
    
}

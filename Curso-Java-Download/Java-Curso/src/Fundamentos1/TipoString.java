package Fundamentos1;


public class TipoString {
    public static void main(String[] args) {
        
        //.charAt serve para demonstra qual indice que está nas linhas, por exemplo a letra no indice 2 é o "á"
        //.concat serve para adicionar algum caracteres na sua String
        //.startswith serve para demonstra se o indice inicia com o que está descrito nos parentêses 
        //.toLowerCase serve para diminuir as letras
        //.endsWith é parecido com o startwith, porem buscando as palavras finais
        //.length mostra o tamanho da String. Por exemplo a String "JAVA", o length dela será 4, que é o numero de caracteres(letras) dentro da String. 
        //.equals serve para comparar as igualdades
        //.equalsIgnoreCase ignora as letras maiusculas e minusculas
        // \n serve para quebra linha
        // %s serve substituir os valores
        // %d serve para substituir um valor inteiro

        System.out.println("olá, pessoal.".charAt(2));

        String s = "boa tarde";
        System.out.println(s.concat("!!!"));
        System.out.println(s + " boa tarde ");
        System.out.println(s.startsWith("boa"));
        System.out.println(s.startsWith("Boa"));
        System.out.println(s.toLowerCase().startsWith("boa"));
        System.out.println(s.endsWith("tarde"));
        System.out.println(s.length());
        System.out.println(s.equals("Boa Tarde"));
        System.out.println(s.equalsIgnoreCase("bOa taRde"));

        var nome = "pedro";
        var sobrenome = "santos";
        var idade = "33";
        var salario = 12345.987;

        System.out.println("Nome: " + nome + "\nSobrenome: " + sobrenome + "\nIdade: " + idade + "\nSalário: " + salario);

        System.out.printf("O senhor %s %s tem %s anos e ganha %s.", nome, sobrenome, idade, salario);

        String frase = String.format("\nO senhor %s %s tem %s anos e ganha %s.", nome, sobrenome, idade, salario);
        System.out.println(frase);


    }
    
}



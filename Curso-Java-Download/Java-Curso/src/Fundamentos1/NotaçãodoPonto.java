package Fundamentos1;
public class NotaçãodoPonto {
    
    public static void main(String[] args) {

        // Quando tivermos um tipo que não são primitivos, podemos utilizar as funções do ponto "."
        // .replace serve para altera algum dado como no exemplo o "X" foi alterado para Senhora
        // .toUppercase serve para aumentar todas as letras
        // .concat serve para adicionar algo como caracteres ou palavras juntamente da String principal


        String x = "Bom Dia X";
        x = x.replace("X", "Senhora");
        x = x.toUpperCase();
        x = x.concat("! Agradecemos a preferência.");

        System.out.println(x);

        //também para fazer a junção dos codigos diretamente na spring, por exemplo:

        String a = "bom dia x".replace("x", "senhora").toUpperCase().concat(". Agradecemos a preferência!");

        System.out.println(a);

        //além de poder colocar diretamente em uma String, é possivel fazer-la ficar mais dinamica e visivel, por exemplo:
        // OBs: sempre separe no "." para ser mais visivel o que está sendo feito.
        
        String b = "bom dia x".replace("x", "Senhora").toUpperCase().concat(". Agradecemos a preferência!");

        System.out.println(b);
        
        //tipos primitivos não tem como utilizar a função "."
        //Retire as barras para ver o erros

        int c = 3;
        //c = c.toUpperCase;

        System.out.println(c);

      


    }
}

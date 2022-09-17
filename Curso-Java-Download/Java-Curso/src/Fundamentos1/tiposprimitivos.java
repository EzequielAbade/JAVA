package Fundamentos1;
public class tiposprimitivos {
    public static void main(String[] args) {

        //dados de um funcionário: 
        //tipos numéricos inteiros

        byte AnosDeEmpresa = 23;
        short NumeroDeVoos = 542;
        int ID = 56789;
        long PontosAcumulados = 3_234_845_223L;

        //tipos númericos reais

        float Salário = 11_445.44F;
        double VendasAcumuladas = 2_991_797_103.01;

        //tipo booleano

         boolean EstaDeFerias = false; // true

         // tipo caracteres

         char status = 'A'; // A de ativo

         // dias de empresas calculo
        
         System.out.println("Dias na Empresa = " + AnosDeEmpresa * 365);
          
         // numero de viagens

         System.out.println("Quantidade de Voos = " + NumeroDeVoos / 2);

         // pontos acumulados e vendas acumuladas

         System.out.println("Pontos por Real = " + PontosAcumulados / VendasAcumuladas);

         // demonstrando salário e ID do usuário

         System.out.println("ID = " + ID + " GANHA = " + Salário);

         // está de férias o usuário ?

         System.out.println("Está de Férias? " + EstaDeFerias);

         // O Funcionário está ativo ?

         System.out.println("Status = " + status);

         

    }
    
}

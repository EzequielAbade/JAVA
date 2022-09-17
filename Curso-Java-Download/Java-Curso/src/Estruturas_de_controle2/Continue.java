package Estruturas_de_controle2;

public class Continue {
    public static void main(String[] args) {
        
        // continue serve para interromper apenas a interação e continua repentido as linhas, aqui no caso ele continuara repetindo o for
        // break serve para interromper as linhas de codigos e para as proximas

        for (int i = 0; i < 10; i++) {
            if (i % 2 == 1) {
                continue;
            }
            System.out.println(i);
        }
        // neste caso o Continue irá interromper o que será pedido, que no caso é o numero 5, e pulara direto para o numero 6 dando sequencia ao codigo

        for (int i = 1; i <= 10; i++) {
            if(i == 5) continue;
            System.out.println(i);
        }
}
}
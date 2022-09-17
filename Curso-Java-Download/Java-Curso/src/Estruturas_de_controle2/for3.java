package Estruturas_de_controle2;

public class for3 {
    public static void main(String[] args) {
        
        
        int i = 0;
        for(; i < 10; i++){
            System.out.println(i);
        }
        System.out.println("saiu do for: ");
        System.out.println(i);


        for(int l = 0; l < 10; l++){
            for(int j = 0; j < 10; j++) {
                System.out.printf("[%d %d]", l, j);
               
            }
            System.out.println();
        }
    }
    
}

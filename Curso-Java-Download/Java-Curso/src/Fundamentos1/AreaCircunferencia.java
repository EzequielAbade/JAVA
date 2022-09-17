package Fundamentos1;
public class AreaCircunferencia {
    public static void main(String[] args) {
    
        //final serve para constantes

        double raio = 3.4;
         final double PI = 3.14159;
        Double area = PI * raio * raio;

        System.out.println(area);

        raio = 10;
        area = PI * raio * raio;

        System.out.println(area);
        System.out.println("Área = "+ area + "m2");
        
    }
}

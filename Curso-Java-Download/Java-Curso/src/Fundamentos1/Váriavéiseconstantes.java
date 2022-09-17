package Fundamentos1;
public class Váriavéiseconstantes {
    public static void main(String[] args) {
        // (°F - 32) x 5/9 = °C
        final double constante1 = 32;
        final double constante2 = 5/9.0;

        double resultado;
        double farenheint;
        
        farenheint = 86;
        resultado = (farenheint - constante1) * constante2;

        System.out.println("O resultado das variáveis é = " + resultado + "°C");
        
        farenheint = 150;
        resultado = (farenheint - constante1) * constante2;
        
        System.out.println("O resultado das variáveis é = " + resultado + "°C");
         
        // alt mais as teclas de setas servem pra mover a linha


    }
    
}

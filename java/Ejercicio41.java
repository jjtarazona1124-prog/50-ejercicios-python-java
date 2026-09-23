import java.util.Scanner;


public class Ejercicio41 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        

        System.out.print("Ingrese el volumen del gas (L): ");
        double volumen = sc.nextDouble();

          System.out.print("Ingrese la temperatura del gas (K): ");
        double temperatura = sc.nextDouble();

        System.out.print("Ingrese la cantidad de sustancias en moles  (mol): ");
        double n = sc.nextDouble();

        final double r= 0.0821;
        
        double presion = n * r * temperatura/volumen;  

        System.out.println("La presion es: " + presion + " atm");

        sc.close();
    }
}
import java.util.Scanner;


public class Ejercicio21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        

        System.out.print("Ingrese la masa del primer objeto (kg): ");
        double masa_1 = sc.nextDouble();

          System.out.print("Ingrese la masa del segundo objeto (kg): ");
        double masa_2 = sc.nextDouble();

        System.out.print("Ingrese la distancia del objeto (m): ");
        double distancia = sc.nextDouble();

        final double gravedad = 6.674e-11;
        
        double fuerza_gravitacional = gravedad * masa_1 * masa_2 / Math.pow(distancia,2);  

        System.out.println("La fuerza gravitacional es: " + fuerza_gravitacional + " Newtons");

        sc.close();
    }
}
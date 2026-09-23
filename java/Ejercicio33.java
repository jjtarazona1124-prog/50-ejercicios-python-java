import java.util.Scanner;

public class Ejercicio33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        

        System.out.print("Ingrese la masa del objeto (kg): ");
        double masa = sc.nextDouble();

        System.out.print("Ingrese la velocidad_tangencial del objeto (m/s): ");
        double velocidad_tangencial = sc.nextDouble();

         System.out.print("Ingrese el radio (m): ");
        double radio = sc.nextDouble();


        double fuerza_centripeta =   masa * Math.pow(velocidad_tangencial, 2)/radio;

        System.out.println("La fuerza centripeta es: " + fuerza_centripeta + " newton");

        sc.close();
    }
}
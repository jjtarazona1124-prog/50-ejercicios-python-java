import java.util.Scanner;

public class Ejercicio17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        

        System.out.print("Ingrese la masa del objeto (kg): ");
        double masa = sc.nextDouble();

        System.out.print("Ingrese la velocidad del objeto (m/s): ");
        double velocidad = sc.nextDouble();

        double energiaCinetica = 0.5 * masa * Math.pow(velocidad, 2);

        System.out.println("La energía cinética es: " + energiaCinetica + " Joules");

        sc.close();
    }
}
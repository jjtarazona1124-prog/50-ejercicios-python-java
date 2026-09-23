import java.util.Scanner;


public class Ejercicio46 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        

        final double G = 6.674e-11;

        System.out.print("Ingrese la masa del planeta (kg): ");
        double masaPlaneta = sc.nextDouble();

        System.out.print("Ingrese el radio del planeta (m): ");
        double radioPlaneta = sc.nextDouble();

        double velocidadEscape = Math.sqrt(2 * G * masaPlaneta / radioPlaneta);

        System.out.println("La velocidad de escape es: " + velocidadEscape + " m/s");

        sc.close();
    }
}
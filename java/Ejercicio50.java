import java.util.Scanner;


public class Ejercicio50 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    

        final double c = 3e8;

        System.out.print("Ingrese la longitud propia del objeto (m): ");
        double longitudPropia = sc.nextDouble();

        System.out.print("Ingrese la velocidad del objeto (m/s): ");
        double velocidad = sc.nextDouble();

        double longitudContraida = longitudPropia * Math.sqrt(1 - (Math.pow(velocidad, 2) / Math.pow(c, 2)));

        System.out.println("La longitud contraída es: " + longitudContraida + " m");

        sc.close();
    }
}
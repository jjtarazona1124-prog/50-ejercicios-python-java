import java.util.Scanner;

public class Ejercicio43 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        

        System.out.print("Ingrese el momento de la inercia (kg*m**2): ");
        double i = sc.nextDouble();

        System.out.print("Ingrese la velocidad angular (rad/s): ");
        double velocidad = sc.nextDouble();

        double m = i * velocidad;

     System.out.println("El momento angular es: " + m + " kg*m**2/s");

        sc.close();
    }
}

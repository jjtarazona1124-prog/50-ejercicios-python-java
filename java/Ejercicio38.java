import java.util.Scanner;

public class Ejercicio38 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        

        System.out.print("Ingrese el ángulo recorrido (radianes): ");
        double angulo = sc.nextDouble();

        System.out.print("Ingrese el tiempo transcurrido (s): ");
        double tiempo = sc.nextDouble();

        double velocidadAngular = angulo / tiempo;

        System.out.println("La velocidad angular es: " + velocidadAngular + " rad/s");

        sc.close();
    }
}
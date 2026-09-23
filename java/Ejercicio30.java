import java.util.Scanner;

public class Ejercicio30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Ingrese la velocidad inicial (m/s): ");
        double velocidadInicial = sc.nextDouble();

        System.out.print("Ingrese la aceleración (m/s²): ");
        double aceleracion = sc.nextDouble();

        System.out.print("Ingrese el tiempo transcurrido (s): ");
        double tiempo = sc.nextDouble();

        double velocidadFinal = velocidadInicial + aceleracion * tiempo;

        System.out.println("La velocidad final es: " + velocidadFinal + " m/s");

        sc.close();
    }
}

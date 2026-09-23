import java.util.Scanner;

public class Ejercicio27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        

        System.out.print("Ingrese la fuerza aplicada (N): ");
        double fuerza = sc.nextDouble();

        System.out.print("Ingrese la distancia recorrida (m): ");
        double distancia = sc.nextDouble();

        double trabajo = fuerza * distancia;

        System.out.println("El trabajo realizado es: " + trabajo + " Joules");

        sc.close();
    }
}
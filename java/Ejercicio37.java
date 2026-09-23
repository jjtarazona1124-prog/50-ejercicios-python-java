import java.util.Scanner;


public class Ejercicio37 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        

        System.out.print("Ingrese la distancia focal de la lente (m): ");
        double distanciaFocal = sc.nextDouble();

        double potencia = 1 / distanciaFocal;

        System.out.println("La potencia de la lente es: " + potencia + " Dioptrías");

        sc.close();
    }
}
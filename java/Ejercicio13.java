import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese la longitud del cubo: ");
        double longitud = sc.nextDouble();

        double volumen = longitud * longitud * longitud;

        System.out.println("El volumen del cubo es: " + volumen);

        sc.close();
    }
}
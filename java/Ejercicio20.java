import java.util.Scanner;

public class Ejercicio20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        

        System.out.print("Ingrese el ángulo en radianes: ");
        double radianes = sc.nextDouble();

        double grados = radianes * (180 / Math.PI);

        System.out.println("El ángulo en grados es: " + grados);

        sc.close();
    }
}
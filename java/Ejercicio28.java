import java.util.Scanner;


public class Ejercicio28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    

        System.out.print("Ingrese el radio (r): ");
        double radio = sc.nextDouble();

        System.out.print("Ingrese el ángulo en grados (θ): ");
        double anguloGrados = sc.nextDouble();

        double anguloRadianes = Math.toRadians(anguloGrados);

        double x = radio * Math.cos(anguloRadianes);
        double y = radio * Math.sin(anguloRadianes);

        System.out.println("Las coordenadas cartesianas son: (" + x + ", " + y + ")");

        sc.close();
    }
}
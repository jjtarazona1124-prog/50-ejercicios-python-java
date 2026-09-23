import java.util.Scanner;

public class Ejercicio36 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
  

        System.out.print("Ingrese el radio (r): ");
        double radio = sc.nextDouble();

        System.out.print("Ingrese el ángulo theta en grados (desde el eje Z): ");
        double thetaGrados = sc.nextDouble();

        System.out.print("Ingrese el ángulo phi en grados (en el plano XY): ");
        double phiGrados = sc.nextDouble();

        double theta = Math.toRadians(thetaGrados);
        double phi = Math.toRadians(phiGrados);

        double x = radio * Math.sin(theta) * Math.cos(phi);
        double y = radio * Math.sin(theta) * Math.sin(phi);
        double z = radio * Math.cos(theta);

        System.out.println("Las coordenadas cartesianas son: (" + x + ", " + y + ", " + z + ")");

        sc.close();
    }
}
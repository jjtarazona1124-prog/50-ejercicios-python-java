import java.util.Scanner;


public class Ejercicio44 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        

        System.out.print("Ingrese la parte real (a): ");
        double a = sc.nextDouble();

        System.out.print("Ingrese la parte imaginaria (b): ");
        double b = sc.nextDouble();

        double r = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
        double thetaRadianes = Math.atan2(b, a);
        double thetaGrados = Math.toDegrees(thetaRadianes);

        System.out.println("La forma polar es: r = " + r + ", θ = " + thetaGrados + " grados");

        sc.close();
    }
}

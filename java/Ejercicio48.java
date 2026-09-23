import java.util.Scanner;


public class Ejercicio48 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       

        System.out.print("Ingrese el elemento (fila 1, columna 1) de la matriz: ");
        double r11 = sc.nextDouble();

        System.out.print("Ingrese el elemento (fila 1, columna 2) de la matriz: ");
        double r12 = sc.nextDouble();

        System.out.print("Ingrese el elemento (fila 2, columna 1) de la matriz: ");
        double r21 = sc.nextDouble();

        System.out.print("Ingrese el elemento (fila 2, columna 2) de la matriz: ");
        double r22 = sc.nextDouble();

        double anguloRadianes = Math.atan2(r21, r11);
        double anguloGrados = Math.toDegrees(anguloRadianes);

        System.out.println("El ángulo de rotación es: " + anguloGrados + " grados");

        sc.close();
    }
}
import java.util.Scanner;


public class Ejercicio26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        

        System.out.print("Ingrese el primer término (a1): ");
        double primerTermino = sc.nextDouble();

        System.out.print("Ingrese la diferencia común (d): ");
        double diferencia = sc.nextDouble();

        System.out.print("Ingrese la posición del término que desea calcular (n): ");
        int n = sc.nextInt();

        double terminoN = primerTermino + (n - 1) * diferencia;

        System.out.println("El término " + n + " de la progresión es: " + terminoN);

        sc.close();
    }
}
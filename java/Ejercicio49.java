import java.util.Scanner;


public class Ejercicio49{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    

        final double mu0 = 4 * Math.PI * 1e-7;

        System.out.print("Ingrese el número de vueltas de la bobina: ");
        int nVueltas = sc.nextInt();

        System.out.print("Ingrese el área de la sección transversal (m²): ");
        double area = sc.nextDouble();

        System.out.print("Ingrese el radio medio del toroide (m): ");
        double radio = sc.nextDouble();

        double inductancia = (mu0 * Math.pow(nVueltas, 2) * area) / (2 * Math.PI * radio);

        System.out.println("La inductancia es: " + inductancia + " Henrios");

        sc.close();
    }
}

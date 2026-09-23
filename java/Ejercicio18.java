import java.util.Scanner;


public class Ejercicio18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    

        System.out.print("Ingrese la coordenada X del primer punto: ");
        double x1 = sc.nextDouble();

        System.out.print("Ingrese la coordenada Y del primer punto: ");
        double y1 = sc.nextDouble();

        System.out.print("Ingrese la coordenada X del segundo punto: ");
        double x2 = sc.nextDouble();

        System.out.print("Ingrese la coordenada Y del segundo punto: ");
        double y2 = sc.nextDouble();

        double xMedio = (x1 + x2) / 2;
        double yMedio = (y1 + y2) / 2;

        System.out.println("El punto medio es: (" + xMedio + ", " + yMedio + ")");

        sc.close();
    }
}
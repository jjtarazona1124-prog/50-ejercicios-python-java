import java.util.Scanner;

public class Ejercicio22 {
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

        double distancia = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

        System.out.println("La distancia entre los dos puntos es: " + distancia);

        sc.close();
    }
}
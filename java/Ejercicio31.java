import java.util.Scanner;

public class Ejercicio31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese los lados del poligono regular: ");
        double lados = sc.nextInt();

        System.out.print("Ingrese la longitud del perimetro regular: ");
        double longitud = sc.nextDouble();

        double perimetro = lados * longitud;

        System.out.println("El perímetro del poligono regular es: " + perimetro);

        sc.close();
    }
}
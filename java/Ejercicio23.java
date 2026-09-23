import java.util.Scanner;

public class Ejercicio23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese la base mayor del trapecio: ");
        double baseMayor = sc.nextDouble();


        System.out.print("Ingrese la base menor del trapecio: ");
        double basemenor = sc.nextDouble();

        System.out.print("Ingrese la altura del trapecio: ");
        double altura = sc.nextDouble();

        double area = (baseMayor + basemenor * altura) /2;

        System.out.println("El área del trapecio es: " + area);

        sc.close();
    }
}
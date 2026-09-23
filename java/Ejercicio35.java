import java.util.Scanner;


public class Ejercicio35{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        

        final double k = 8.99e9;

        System.out.print("Ingrese la carga puntual (C): ");
        double carga = sc.nextDouble();

        System.out.print("Ingrese la distancia desde la carga (m): ");
        double radio = sc.nextDouble();

        double campoElectrico = k * carga / Math.pow(radio, 2);

        System.out.println("El campo eléctrico es: " + campoElectrico + " N/C");

        sc.close();
    }
}
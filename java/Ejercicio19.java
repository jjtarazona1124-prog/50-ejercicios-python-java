import java.util.Scanner;


public class Ejercicio19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    

        System.out.print ("Ingrese el radio del cilindro: ");
        double radio = sc.nextDouble();

        System.out.print("Ingrese la altura del cilindro: ");
        double altura = sc.nextDouble();

        double volumen = Math.PI * Math.pow(radio, 2) * altura;

        System.out.println("El volumen del cilindro es: " + volumen);

        sc.close();
    }
}
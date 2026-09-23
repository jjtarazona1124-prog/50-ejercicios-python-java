import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el primer numero: ");
        double numero1 = sc.nextDouble();

        System.out.print("Ingrese el segundo numero: ");
        double numero2 = sc.nextDouble();

        System.out.print("Ingrese el tercer numero: ");
        double numero3 = sc.nextDouble();
        
        double promedio= (numero1 + numero2 + numero3)/3;

        System.out.println("El promedio de los tres numeros es : " + promedio);

        sc.close();
    }
}
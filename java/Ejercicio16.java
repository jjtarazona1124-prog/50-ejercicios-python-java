import java.util.Scanner;

public class Ejercicio16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de kilometros por hora: ");
        double kilometros_hora = sc.nextDouble();

        double metros_segundos = kilometros_hora / 3.6;
        

        System.out.println("Equivale a metros/segundos "+ metros_segundos  );

        sc.close();
    }
}

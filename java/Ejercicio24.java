import java.util.Scanner;

public class Ejercicio24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        

        System.out.print("Ingrese la masa en lb: ");
        double  masalb = sc.nextDouble();

        double masakg = masalb / 2.205;

        System.out.println("La masa en kg es: " + masakg);

        sc.close();
    }
}
import java.util.Scanner;

public class exe8 {
    // Exercice 8 : Comparaison de deux nombres
    public static void comparerNombres() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez le premier nombre (a) : ");
        double a = scanner.nextDouble();

        System.out.print("Entrez le deuxième nombre (b) : ");
        double b = scanner.nextDouble();

        if (a > b) {
            System.out.println("a est supérieur à b");
        } else if (a < b) {
            System.out.println("a est inférieur à b");
        } else {
            System.out.println("a est égal à b");
        }
        scanner.close();
    }
}

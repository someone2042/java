import java.util.Scanner;

public class exe11 {
    // Exercice 11 : Calcul des racines carrées
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double nombre;

        do {
            System.out.print("Donnez un nombre positif (0 pour quitter) : ");
            nombre = scanner.nextDouble();

            if (nombre < 0) {
                System.out.println("SVP positif");
            } else if (nombre != 0) {
                double racine = Math.sqrt(nombre);
                System.out.println("Sa racine carrée est : " + racine);
            }
        } while (nombre != 0);
        scanner.close();
        System.out.println("Au revoir");
    }
}

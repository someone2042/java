import java.util.Scanner;

public class exe13 {
    // Exercice 13 : Somme des nombres impairs
    public static void sommeNombresImpairs() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez un entier positif (n) : ");
        int n = scanner.nextInt();

        int somme = 0;
        for (int i = 1; i <= n; i += 2) {
            somme += i;
        }
        scanner.close();
        System.out.println("La somme des nombres impairs inférieurs à " + n + " est: " + somme);
    }

    public static void main(String[] args) {
        sommeNombresImpairs();
    }
}

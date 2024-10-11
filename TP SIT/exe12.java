import java.util.Scanner;

public class exe12 {
    // Exercice 12 : Multiplication par additions successives
    public static void multiplicationParAddition() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez le premier entier positif (p): ");
        int p = scanner.nextInt();

        System.out.print("Entrez le deuxième entier positif (q): ");
        int q = scanner.nextInt();

        int produit = 0;
        for (int i = 0; i < q; i++) {
            produit += p;
        }
        scanner.close();
        System.out.println("Le produit de " + p + " et " + q + " est: " + produit);
    }
}

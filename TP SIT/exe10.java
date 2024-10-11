import java.util.Scanner;

public class exe10 {
    // Exercice 10 : Somme de n entiers
    public static void calculerSommeEntiers() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Combien d'entiers voulez-vous saisir ? ");
        int n = scanner.nextInt();

        int somme = 0;
        for (int i = 1; i <= n; i++) {
            System.out.print("Entrez l'entier n°" + i + " : ");
            int entier = scanner.nextInt();
            somme += entier;
        }
        scanner.close();
        System.out.println("La somme des entiers est : " + somme);
    }
}

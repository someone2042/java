import java.util.Scanner;

public class exe9 {
    public static void afficherEntierTexte() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez un entier entre 0 et 4: ");
        int nombre = scanner.nextInt();

        String texte = switch (nombre) {
            case 0 -> "Zéro";
            case 1 -> "Un";
            case 2 -> "Deux";
            case 3 -> "Trois";
            case 4 -> "Quatre";
            default -> "Nombre invalide";
        };
        scanner.close();
        System.out.println("Vous avez saisi : " + texte);
    }
}

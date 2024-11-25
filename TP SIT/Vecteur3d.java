import java.util.Scanner;

public class Vecteur3d {
    private double x;
    private double y;
    private double z;

    // Constructeurs
    public Vecteur3d(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public Vecteur3d() {
        this(0, 0, 0); // Initialisation par défaut
    }

    // Méthode afficher()
    public void afficher() {
        System.out.println("(" + x + ", " + y + ", " + z + ")");
    }

    // Méthode norme()
    public double norme() {
        return Math.sqrt(x * x + y * y + z * z);
    }

    // Méthode statique somme()
    public static Vecteur3d somme(Vecteur3d v1, Vecteur3d v2) {
        return new Vecteur3d(v1.x + v2.x, v1.y + v2.y, v1.z + v2.z);
    }

    // Méthode produitScalaire()
    public double produitScalaire(Vecteur3d autreVecteur) {
        return this.x * autreVecteur.x + this.y * autreVecteur.y + this.z * autreVecteur.z;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez la taille du tableau de vecteurs : ");
        int taille = scanner.nextInt();

        Vecteur3d[] vecteurs = new Vecteur3d[taille];

        for (int i = 0; i < taille; i++) {
            System.out.println("Entrez les composantes du vecteur " + (i + 1) + " (x y z):");
            double x = scanner.nextDouble();
            double y = scanner.nextDouble();
            double z = scanner.nextDouble();
            vecteurs[i] = new Vecteur3d(x, y, z);
        }

        scanner.close(); // Fermer le scanner après utilisation

        System.out.println("\nVecteurs du tableau :");
        for (Vecteur3d vecteur : vecteurs) {
            vecteur.afficher();
        }

        // Exemple d'utilisation de somme() et produitScalaire() (ajouter au main) :
        if (taille >= 2) { // Vérifiez qu'il y a au moins deux vecteurs
            Vecteur3d somme = Vecteur3d.somme(vecteurs[0], vecteurs[1]);
            System.out.println("\nSomme des deux premiers vecteurs:");
            somme.afficher();

            double produit = vecteurs[0].produitScalaire(vecteurs[1]);
            System.out.println("\nProduit scalaire des deux premiers vecteurs : " + produit);

        }

    }
}
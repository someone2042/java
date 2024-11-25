import java.util.ArrayList;
import java.util.List;

abstract class Forme {
    public abstract void display();

    public abstract double surface();

    public abstract double perimetre();

    public abstract String toString(); // Already implicitly inherited from Object, but good to be explicit
}

class Cercle extends Forme {
    private double rayon;

    public Cercle(double rayon) {
        this.rayon = rayon;
    }

    public double getRayon() {
        return rayon;
    }

    public void setRayon(double rayon) {
        this.rayon = rayon;
    }

    @Override
    public void display() {
        System.out.println("Cercle de rayon " + rayon);
    }

    @Override
    public double surface() {
        return Math.PI * rayon * rayon;
    }

    @Override
    public double perimetre() {
        return 2 * Math.PI * rayon;
    }

    @Override
    public String toString() {
        return "Cercle [rayon=" + rayon + "]";
    }
}

class Rectangle extends Forme {
    private double largeur;
    private double hauteur;

    public Rectangle(double largeur, double hauteur) {
        this.largeur = largeur;
        this.hauteur = hauteur;
    }

    public double getLargeur() {
        return largeur;
    }

    public void setLargeur(double largeur) {
        this.largeur = largeur;
    }

    public double getHauteur() {
        return hauteur;
    }

    public void setHauteur(double hauteur) {
        this.hauteur = hauteur;
    }

    @Override
    public void display() {
        System.out.println("Rectangle de largeur " + largeur + " et hauteur " + hauteur);
    }

    @Override
    public double surface() {
        return largeur * hauteur;
    }

    @Override
    public double perimetre() {
        return 2 * (largeur + hauteur);
    }

    @Override
    public String toString() {
        return "Rectangle [largeur=" + largeur + ", hauteur=" + hauteur + "]";
    }

}

class Carre extends Forme {
    private double cote;

    public Carre(double cote) {
        this.cote = cote;
    }

    public double getCote() {
        return cote;
    }

    public void setCote(double cote) {
        this.cote = cote;
    }

    @Override
    public void display() {

        System.out.println("Carré de côté " + cote);

    }

    @Override
    public double surface() {

        return cote * cote;
    }

    @Override
    public double perimetre() {
        return 4 * cote;
    }

    @Override
    public String toString() {
        return "Carré [côté=" + cote + "]";
    }
}

interface Resizable {
    void resize(int pourcentage);
}

class ResizableCercle extends Cercle implements Resizable {

    public ResizableCercle(double rayon) {
        super(rayon);
    }

    @Override
    public void resize(int pourcentage) {
        setRayon(getRayon() * (1 + pourcentage / 100.0));
    }

}

class ListeDeFormes {
    private List<Forme> formes = new ArrayList<>(); // Use ArrayList for dynamic sizing

    public void ajouterForme(Forme forme) {
        formes.add(forme);

    }

    public double surfaceTotale() {
        double surfaceTotale = 0;
        for (Forme forme : formes) {
            surfaceTotale += forme.surface();

        }

        return surfaceTotale;

    }

    public double perimetreTotal() {
        double perimetreTotal = 0;

        for (Forme forme : formes) {
            perimetreTotal += forme.perimetre();
        }

        return perimetreTotal;

    }

    public void displayAll() {

        for (Forme forme : formes) {
            forme.display();
            System.out.println("Surface: " + forme.surface());
            System.out.println("Périmètre: " + forme.perimetre());
            System.out.println(forme); // Calls toString() implicitly
            System.out.println(); // Add a newline for better readability
        }

        System.out.println("Surface totale: " + surfaceTotale());
        System.out.println("Périmètre total: " + perimetreTotal());

    }

}

public class Main5 {
    public static void main(String[] args) {
        ListeDeFormes liste = new ListeDeFormes();
        liste.ajouterForme(new Cercle(5));
        liste.ajouterForme(new Rectangle(4, 6));
        liste.ajouterForme(new Carre(3));
        liste.ajouterForme(new ResizableCercle(2));

        liste.displayAll();

        // Test resizing:
        ResizableCercle resizableCercle = new ResizableCercle(10);
        resizableCercle.resize(50); // Increase by 50%
        System.out.println("Rayon après redimensionnement : " + resizableCercle.getRayon()); // Output: 15.0

    }
}
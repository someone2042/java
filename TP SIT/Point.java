import java.util.Scanner;

public class Point {
    private char nom;
    private double x;
    private double y;

    // Constructeurs
    public Point(char nom, double x, double y) {
        this.nom = nom;
        this.x = x;
        this.y = y;
    }

    public Point() {
        this(' ', 0, 0); // Initialisation par défaut
    }

    // Getters et Setters
    public char getNom() {
        return nom;
    }

    public void setNom(char nom) {
        this.nom = nom;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double[] getXY() {
        return new double[] { x, y };
    }

    public void setXY(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // Méthodes de distance
    public double distance(double x, double y) {
        return Math.sqrt(Math.pow(this.x - x, 2) + Math.pow(this.y - y, 2));
    }

    public double distance(Point another) {
        return distance(another.x, another.y);
    }

    public double distance() {
        return distance(0, 0); // Distance à l'origine
    }

    public static double distance(Point a, Point b) {
        return a.distance(b);
    }

    // Méthode afficher()
    public void afficher() {
        System.out.println(toString());
    }

    // Méthode translater()
    public void translater(double dx, double dy) {
        this.x += dx;
        this.y += dy;
    }

    // Redéfinition de toString()
    @Override
    public String toString() {
        return nom + "(" + x + "," + y + ")";
    }

    // Méthode equals()
    public boolean equals(Point another) {
        return this.x == another.x && this.y == another.y;
    }

    // Méthode equals() avec précision
    public boolean equals(Point another, double precision) {
        return Math.abs(this.x - another.x) < precision && Math.abs(this.y - another.y) < precision;
    }

    // Méthode homothetie()
    public void homothetie(double facteur) {
        this.x *= facteur;
        this.y *= facteur;
    }

    public static void main(String[] args) {
        // Test avec tableau de 10 points initialisés
        Point[] points1 = new Point[10];
        for (int i = 0; i < 10; i++) {
            points1[i] = new Point((char) ('A' + i), i + 1, i + 1);
        }

        System.out.println("Tableau initialisé:");
        for (Point p : points1) {
            p.afficher(); // or System.out.println(p);
        }

        // Test avec tableau rempli par l'utilisateur

        Scanner scanner = new Scanner(System.in);
        Point[] points2 = new Point[10];

        for (int i = 0; i < 10; i++) {
            System.out.println("Entrez les coordonnées du point " + (i + 1) + " (nom x y):");
            char nom = scanner.next().charAt(0); // Read char
            double x = scanner.nextDouble();
            double y = scanner.nextDouble();
            points2[i] = new Point(nom, x, y);
        }
        scanner.close();

        System.out.println("\nTableau saisi par l'utilisateur:");
        for (Point p : points2) {
            p.afficher();
        }

    }
}
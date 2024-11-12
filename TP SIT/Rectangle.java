class Rectangle {
    private double largeur;
    private double hauteur;

    // 2. Constructeurs
    public Rectangle() {
        this(0, 0); // Appel du constructeur avec paramètres
    }

    public Rectangle(double largeur, double hauteur) {
        this.largeur = largeur;
        this.hauteur = hauteur;
    }

    // 3. Getters et Setters
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

    // 4. Redéfinition de toString
    @Override
    public String toString() {
        return "Rectangle: " + largeur + " X " + hauteur;
    }

    // 5. Méthode surface
    public double surface() {
        return largeur * hauteur;
    }

    // 6. Méthode périmètre
    public double perimetre() {
        return 2 * (largeur + hauteur);
    }

    // 7. Redéfinition de equals

    public boolean equals(Rectangle rectangle) {

        return this.largeur == rectangle.largeur && this.hauteur == rectangle.hauteur;
    }

    // 8. Méthode d'instance pour comparer deux rectangles (par surface)
    public boolean comparer(Rectangle autre) {
        return this.equals(autre);
    }

    // 9. Méthode statique pour comparer deux rectangles (par surface)
    public static int comparer(Rectangle r1, Rectangle r2) {
        if (r1.surface() < r2.surface()) {
            return -1;
        } else if (r1.surface() > r2.surface()) {
            return 1;
        } else {
            return 0; // Surfaces égales
        }
    }

    // 10. Methode qui return le rectangle le plus grand
    public static Rectangle plusGrand(Rectangle r1, Rectangle r2) {
        if (comparer(r1, r2) == -1) {
            return r2;
        } else {
            return r1;
        }
    }

    public static void main(String[] args) {
        Rectangle a = new Rectangle();
        Rectangle b = new Rectangle(10, 10);

        a.setHauteur(21);
        a.setLargeur(89);

        System.out.println(a);
        System.out.println(b);

        System.out.println(b.perimetre());

        System.out.println(b.surface());

        System.out.println(a.comparer(b));

    }

}
class Rectangle {
    private double largeur;
    private double hauteur;

    public Rectangle() {
        this(0, 0);
    }

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
    public String toString() {
        return "Rectangle: " + largeur + " X " + hauteur;
    }

    public double surface() {
        return largeur * hauteur;
    }

    public double perimetre() {
        return 2 * (largeur + hauteur);
    }

    public boolean equals(Rectangle rectangle) {

        return this.largeur == rectangle.largeur && this.hauteur == rectangle.hauteur;
    }

    public boolean comparer(Rectangle autre) {
        return this.equals(autre);
    }

    public static int comparer(Rectangle r1, Rectangle r2) {
        if (r1.surface() < r2.surface()) {
            return -1;
        } else if (r1.surface() > r2.surface()) {
            return 1;
        } else {
            return 0;
        }
    }

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
class Fruit {
    String nom;

    public Fruit(String nom) {
        this.nom = nom;
    }

    public void decrire() {
        System.out.println("Je suis un " + nom + ".");
    }
}

class Agrume extends Fruit {
    boolean zeste;

    public Agrume(String nom, boolean zeste) {
        super(nom);
        this.zeste = zeste;
    }

    @Override
    public void decrire() {
        System.out.println(
                "Je suis un " + nom + " et j'" + (zeste ? "" : "n'") + "ai " + (zeste ? "un" : "pas de") + " zeste.");
    }
}

public class Main7 {
    public static void main(String[] args) {
        // a) Instance anonyme d'Agrume
        Agrume citronAnonyme = new Agrume("Citron", true) {
            // b) Redéfinition de decrire() dans l'instance anonyme
            @Override
            public void decrire() {
                super.decrire(); // Appel à decrire de la classe parent if needed
                System.out.println("Je suis un Citron et j'ai un zeste très parfumé !");
            }

        };

        // c) Appel de decrire() sur l'instance anonyme
        citronAnonyme.decrire();

        Fruit fruit = new Fruit("Pomme");
        fruit.decrire();

        Agrume orange = new Agrume("Orange", true);
        orange.decrire();

    }
}
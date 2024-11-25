class Amere {
    public void afficher() {
        System.out.println("Je suis un objet de Amere");
    }
}

class Anonyme extends Amere {
    @Override
    public void afficher() {
        System.out.println("Je suis un anonyme derivé de Amere");
    }
}

public class Main6 {
    public static void main(String[] args) {
        Amere a1 = new Amere();
        a1.afficher(); // Output: Je suis un objet de Amere

        Anonyme a2 = new Anonyme();
        a2.afficher(); // Output: Je suis un anonyme derivé de Amere

        // Using an anonymous class:
        Amere a3 = new Amere() {
            @Override
            public void afficher() {
                System.out.println("Je suis un objet anonyme derivé de Amere (inline)");
            }
        };
        a3.afficher(); // Output: Je suis un objet anonyme derivé de Amere (inline)

        // Illustrating polymorphism
        Amere a4 = new Anonyme(); // Polymorphism: Anonyme object referenced by Amere variable
        a4.afficher(); // Output: Je suis un anonyme derivé de Amere (because of overriding)

    }
}
// 1. Interface Criable
interface Criable {
    void crier();
}

interface Mangeable {
    void manger();
}

// 6. Classe abstraite Animal
abstract class Animal {
    public abstract void manger();
}

// 2. Classes Chat, Chien, et Lapin (implementing Criable and extending Animal)
class Chat extends Animal implements Criable, Mangeable {
    @Override
    public void crier() {
        System.out.println("Miaou !");
    }

    @Override
    public void manger() {
        System.out.println("Le chat mange des croquettes.");
    }
}

class Chien extends Animal implements Criable, Mangeable {
    @Override
    public void crier() {
        System.out.println("Woof !");
    }

    @Override
    public void manger() {
        System.out.println("Le chien mange des os.");
    }
}

class Lapin extends Animal { // Lapin n'implémente pas Criable

    @Override
    public void manger() {
        System.out.println("Le lapin mange des carottes.");
    }

    public void sauter() {
        System.out.println("Le lapin saute !");
    }
}

public class Main9 {
    public static void main(String[] args) {
        // 4. Tableau d'animaux qui savent crier
        Criable[] animauxCriants = new Criable[2];
        animauxCriants[0] = new Chien();
        animauxCriants[1] = new Chat();

        // Faire crier tous les animaux
        for (Criable animal : animauxCriants) {
            animal.crier();
        }

        Lapin lapin = new Lapin();
        lapin.sauter(); // Appel de la méthode sauter() spécifique au Lapin
        lapin.manger();

        // Polymorphisme et classes abstraites
        Animal[] animaux = new Animal[3];
        animaux[0] = new Chat();
        animaux[1] = new Chien();
        animaux[2] = new Lapin();

        for (Animal animal : animaux) {
            animal.manger(); // Appelera la méthode manger() appropriée pour chaque animal
        }

    }
}
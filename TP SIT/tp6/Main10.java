import java.util.ArrayList;

interface AfficheType {
    void afficherType();
}

class Vehicule {
    private String marque;
    private String couleur;
    private int vitesse;
    private int etat;

    public Vehicule() {
    }

    public Vehicule(String marque, String couleur) {
        this.marque = marque;
        this.couleur = couleur;
    }

    public Vehicule(String marque, String couleur, int vitesse, int etat) {
        this.marque = marque;
        this.couleur = couleur;
        this.vitesse = vitesse;
        this.etat = etat;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public String getCouleur() {
        return couleur;
    }

    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }

    public int getVitesse() {
        return vitesse;
    }

    public void setVitesse(int vitesse) {
        this.vitesse = vitesse;
    }

    public int getEtat() {
        return etat;
    }

    public void setEtat(int etat) {
        this.etat = etat;
    }

    public void demarrer() {
        this.etat = 1;
    }

    public void arreter() {
        this.etat = 0;
    }

    public void afficher() {
        System.out.println("Marque : " + this.marque);
        System.out.println("Couleur : " + this.couleur);
    }

    @Override
    public String toString() {
        return "Marque : " + marque + "\n" +
                "Couleur : " + couleur + "\n" +
                "Vitesse: " + vitesse + " Km\n" +
                "Etat : " + (etat == 1 ? "en marche" : "arrêt");
    }
}

class Voiture extends Vehicule implements AfficheType {
    private String modele;
    private int nbrePortes;

    public Voiture() {
    }

    public Voiture(String marque) {
        super(marque, null); // Appel du constructeur de Vehicule avec 2 paramètres
    }

    @Override
    public void afficher() {
        super.afficher();
        System.out.println("Modele : " + this.modele);
        System.out.println("Nombre de portes : " + this.nbrePortes);
    }

    @Override
    public void afficherType() {
        System.out.println("Je suis une voiture");
    }

}

class Parking {
    private int places;
    private ArrayList<Voiture> voituresGarees;

    public Parking(int places) {
        this.places = places;
        this.voituresGarees = new ArrayList<>();
    }

    public int nbrePlaces() {
        return places;
    }

    public int placesDispo() {
        return places - voituresGarees.size();
    }

    public void garerVoiture(String marque) {
        voituresGarees.add(new Voiture(marque));
    }

    public void sortirVoiture(int ordre) {
        if (ordre > 0 && ordre <= voituresGarees.size()) {
            voituresGarees.remove(ordre - 1);
        } else {
            System.out.println("Numéro d'ordre incorrect.");
        }
    }

    public void listeVoitures() {
        for (int i = 0; i < voituresGarees.size(); i++) {
            System.out.println((i + 1) + " : " + voituresGarees.get(i).getMarque());
        }
    }

}

public class Main10 {
    public static void main(String[] args) {

        Vehicule v = new Vehicule("FSTCar", "Noir", 120, 1);
        System.out.println(v);

        var v2 = new Voiture("Volkswagen");
        var w = v2;
        w.setMarque("Eleanor");
        var x = new Voiture();
        x.setMarque(v2.getMarque());
        System.out.println(v2.getMarque() + "," + w.getMarque() + "," + x.getMarque()); // Eleanor,Eleanor,Eleanor
        if (w == x) {
            w.setMarque("Ferrari");
        } else {
            x.setMarque("Eagle"); // Ce bloc est exécuté
        }
        System.out.println(v2.getMarque() + "," + w.getMarque() + "," + x.getMarque()); // Eleanor,Eleanor,Eagle
        v2.setMarque("Rolls");
        if (w != v2) {
            v2.setMarque("Cadillac"); // Ce bloc NE sera PAS exécuté car w et v pointent vers le même objet.
        } else {
            w.setMarque("Penguin"); // Ce bloc sera exécuté
        }
        System.out.println(v2.getMarque() + "," + w.getMarque() + "," + x.getMarque()); // Penguin,Penguin,Eagle

        //11.
        Vehicule[] tabVehicules = new Vehicule[2];
        tabVehicules[0] = new Vehicule("Ford", "Rouge");
        tabVehicules[1] = new Voiture("Renault");

        for (Vehicule vehicule : tabVehicules) {
            vehicule.afficher();
        }

    }

}
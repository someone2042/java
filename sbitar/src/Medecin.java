import java.util.ArrayList;

/**
 * Medecin
 */
public class Medecin {

    private String nom;
    private String prenom;
    private String specialite;
    private ArrayList<AnalysesBiologique> AnalysesBiologiques;
    private ArrayList<Dermatoscopie> Dermatoscopie;
    private ArrayList<Patient> Patients;
    private ArrayList<Traitement> Traitements;
    private ArrayList<Sejour> Sejour;

    public Medecin(String nom, String prenom, String specialite) {
        this.nom = nom;
        this.prenom = prenom;
        this.specialite = specialite;
        this.AnalysesBiologiques = new ArrayList<>();
        this.Dermatoscopie = new ArrayList<>();
        this.Patients = new ArrayList<>();
        this.Traitements = new ArrayList<>();
        this.Sejour = new ArrayList<>();
    }
}
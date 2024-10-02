import java.time.Duration;

public class Traitement {
    private String nom_medicament;
    private String posologie;
    private Duration duree;

    public Traitement(String nom_medicament, String posologie, Duration duree) {
        this.nom_medicament = nom_medicament;
        this.posologie = posologie;
        this.duree = duree;
    }
}

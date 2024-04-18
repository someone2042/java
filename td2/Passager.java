package td2;

import java.time.LocalDate;
import java.time.Period;

public class Passager {
    private String nom;
    private String prenom;
    private LocalDate date_naissance;

    public Passager(String nom, String prenom, LocalDate date_naissance) {
        this.date_naissance = date_naissance;
        this.nom = nom;
        this.prenom = prenom;
    }

    public long getAge() {
        return Period.between(LocalDate.now(), date_naissance).getYears();
    }

    public String toString() {
        return "Nom : " + nom + ", Prenom : " + prenom + ", Age : " + getAge();
    }
}

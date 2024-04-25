/**
 * Entreprise
 */
public class Entreprise {

    protected String nom;
    protected String mission;
    protected int capital;
    protected Adresse adresse;

    public Entreprise(String nom, int capital, String mission, Adresse adresse) {
        this.nom = nom;
        this.capital = capital;
        this.mission = mission;
        this.adresse = adresse;
    }

    public String mission() throws SecretMissionException {
        return this.mission;
    }

    public int capital() throws NonProfitException {
        return this.capital;
    }

    public String adresseComplet() throws AdresseIncompletException, InternationalAdesseException {
        if (adresse.getrue() == null || adresse.getville() == null || adresse.getpays() == null
                || adresse.getcode() == null) {
            throw new AdresseIncompletException("Incomplete Adresse");
        }
        return adresse.getrue() + " " + adresse.getpays() + " " + adresse.getville() + " " + adresse.getcode();
    }

}
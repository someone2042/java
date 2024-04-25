public class EntrepriseSecrete extends Entreprise {
    public EntrepriseSecrete(String nom, int capital, String mission, Adresse adresse) {
        super(nom, capital, mission, adresse);
    }

    public String mission() throws SecretMissionException {
        throw new SecretMissionException("la mission de cette entreprise est sucrerte");
    }
}

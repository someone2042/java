public class EntrepriseInternational extends Entreprise {
    // protected static final String pays_origine='usa'

    public EntrepriseInternational(String nom, int capital, String mission, Adresse adresse) {
        super(nom, capital, mission, adresse);
    }

    public String adresseComplet() throws InternationalAdesseException {
        if (adresse.getpays() != "usa") {
            throw new InternationalAdesseException("adress international");
        }
        return adresse.getrue() + " " + adresse.getpays() + " " + adresse.getville() + " " + adresse.getcode();
    }

}

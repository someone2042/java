/**
 * EtrepriseNonProfit
 */
public class EntrepriseNonProfit extends Entreprise {
    public EntrepriseNonProfit(String nom, int capital, String mission, Adresse adresse) {
        super(nom, capital, mission, adresse);
    }

    public int capital() throws NonProfitException {
        throw new NonProfitException("non profit");
    }
}
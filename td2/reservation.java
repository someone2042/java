package td2;

public class reservation {
    Vol vol;
    Passager passager;
    Boolean estConfirmee;

    public reservation(Vol vol, Passager passager) {
        this.vol = vol;
        this.passager = passager;
        this.estConfirmee = false;
    }

    public void confirmer() {
        this.estConfirmee = true;
    }

    public void annuler() {
        vol.
    }

    public void estValid() {
        return vol.getNomberPlacesLibres() > 0;
    }

    public void afficher() {
        System.out.println("passager:" + passager.toString());
        System.out.println("vol:" + vol.toString());
        System.out.println("estConfirmee:" + estConfirmee);
    }

}

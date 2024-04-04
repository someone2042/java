package td2;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Vector;

public class vol {
    private String compagnie;
    private String aeroportDepart;
    private String aeroportArrivee;
    private LocalDateTime dateDepart;
    private LocalDateTime dateArrivee;
    private boolean estOuvert;
    private int nbPlaces;
    private ArrayList<Escale> escales;
    private ArrayList<Reservation> reservations;

    public vol(String c, String ad, String aa, LocalDateTime dD, LocalDateTime dA, boolean e) {
        compagnie = c;
        aeroportDepart = ad;
        aeroportArrivee = aa;
        dateDepart = dD;
        dateArrivee = dA;
        estOuvert = e;
        escales = new ArrayList<Escale>();
    }

    public void ajouterEscale(Escale e){
        escales.add(Escale e);
    }

    public void supprimerEscale(Escale e){
        escales.remove(Escale e);
    }

    public double getDuree() {
        return Duration.between(dateDepart, dateArrivee).toMinutes();
    }

    public int getNomberPlacesLibres() {
        // return nbPlaces - reservations.size();
        int n = 0;
        for (Reservation res : reservations) {
            if (res.estConfirmee()) {
                n++;
            }
        }
        return nbPlaces - n;
    }

    public boolean reserver(Passager passager) {
        if (getNomberPlacesLibres() > 0) {
            Reservation reservation = new Reservation(passager);
            reservations.add(reservation);
            return true;
        }
        return false;
    }

}

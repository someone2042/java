package td2;

import java.time.LocalDateTime;

public class Escale {
    private String aeroport;
    private LocalDateTime heureDepart;
    private LocalDateTime heureArrivee;

    public Escale(String a, LocalDateTime hd, LocalDateTime ha) {
        this.aeroport = a;
        this.heureDepart = hd;
        this.heureArrivee = ha;
    }

    public boolean coherent() {
        return heureArrivee.isBefore(heureDepart);
    }

    public long getDuree() {
        return java.time.Duration.between(heureDepart, heureArrivee).toMinutes();
    }
}

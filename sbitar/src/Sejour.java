import java.time.LocalDateTime;

public class Sejour {
    private LocalDateTime date_admission;
    private LocalDateTime date_de_sortie;
    private String service;

    public Sejour(LocalDateTime date_admission, LocalDateTime date_de_sortie, String service) {
        this.date_admission = date_admission;
        this.date_de_sortie = date_de_sortie;
        this.service = service;
    }

    public LocalDateTime getDateAdmission() {
        return this.date_admission;
    }

    public LocalDateTime getDateDeSortie() {
        return this.date_de_sortie;
    }

    public String getService() {
        return this.service;
    }
}

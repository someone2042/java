import java.time.LocalDateTime;

public class Dermatoscopie {
    private LocalDateTime date;
    private String observations;

    public Dermatoscopie(LocalDateTime date, String observations) {
        this.date = date;
        this.observations = observations;
    }
}

import java.time.LocalDateTime;
import java.util.Date;

public class AnalysesBiologique {
    private String type_analyse;
    private LocalDateTime date;
    private String resultat;

    public AnalysesBiologique(String type_analyse, LocalDateTime date, String resultat) {
        this.type_analyse = type_analyse;
        this.date = date;
        this.resultat = resultat;
    }
}

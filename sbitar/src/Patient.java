import java.util.Comparator;
import java.util.Date;
import java.util.List;

/**
 * Patient
 */
public class Patient {

    private String nom;
    private String prenom;
    private Date date_naissance;
    private int tel;
    private String adress;
    private List<AnalysesBiologique> AnalysesBiologiques;
    private List<Sejour> sejours;
    private List<Lesion> lesions;

    public List<Sejour> getSejours() {
        return this.sejours;
    }

    public void SejoursTriesParDateAdmission() {
        for (int i = 1; i < sejours.size(); i++) {
            Sejour S = sejours.get(i);
            int j = i - 1;
            while (j >= 0 && sejours.get(j).getDateAdmission().isAfter(S.getDateAdmission())) {
                sejours.set(j + 1, sejours.get(j));
                j--;
            }
            sejours.set(j + 1, S);
        }
    }
}

public class Adresse {
    private String rue;
    private String ville;
    private int code;
    private String pays;

    public Adresse(String rue, String ville, int code, String pays) {
        this.rue = rue;
        this.ville = ville;
        this.code = code;
        this.pays = pays;
    }

    public void setrue(String rue) {
        this.rue = rue;
    }

    public void setville(String ville) {
        this.ville = ville;
    }

    public void setcode(int code) {
        this.code = code;
    }

    public void setpays(String pays) {
        this.pays = pays;

    }

    public String getrue() {
        return this.rue;
    }

    public String getville() {
        return this.ville;
    }

    public String getpays() {
        return this.pays;
    }

    public String getcode() {
        return String.valueOf(this.code);
    }

}

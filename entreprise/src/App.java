public class App {
    public static void main(String[] args) throws Exception {
        Entreprise a = new Entreprise("ford", 5000, "make cars", new Adresse("21", "tokyo", 0, "japon"));
        EntrepriseSecrete b = new EntrepriseSecrete("shell", 5400, "make oil",
                new Adresse("dzer", "chine", 0, "bejin"));
        EntrepriseInternational c = new EntrepriseInternational("yaho", 5000, "makesoftware",
                new Adresse("dffs", "maroc", 0, "casablanca"));
        EntrepriseSecrete d = new EntrepriseSecrete("ibm", 6700, "make software and hardware",
                new Adresse("jfk", "detroed", 0, "usa"));
        try {
            System.out.println(a.capital());
            System.out.println(a.mission());
        } catch (Exception e) {
            // TODO: handle exception
            System.err.println(e);
        }
        try {
            System.out.println(b.capital());
            System.out.println(b.mission());
        } catch (Exception e) {
            // TODO: handle exception
            System.err.println(e);
        }
        try {
            System.out.println(c.mission());
            System.out.println(c.adresseComplet());
            System.out.println(c.capital());
        } catch (Exception e) {
            // TODO: handle exception
            System.err.println(e);
        }
        try {
            System.out.println(d.adresseComplet());
            System.out.println(d.capital());
            System.out.println(d.mission());
        } catch (Exception e) {
            // TODO: handle exception
            System.err.println(e);
        }

    }
}

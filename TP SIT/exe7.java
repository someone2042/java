public class exe7 {

    // question 1
    public static double IndiceMasseCorporelle(double masse, double taille) {
        return masse / (taille * taille);
    }

    public static void main(String[] args) {

        // question 2
        double IMC = IndiceMasseCorporelle(60, 1.75);
        System.out.println(IMC);
        if (IMC < 16.5) {
            System.out.println("dénutrition ou famine");
        } else if (IMC < 18.5) {
            System.out.println("maigreur");
        } else if (IMC < 25) {
            System.out.println("corpulence normale");
        } else if (IMC < 30) {
            System.out.println("surpoids");
        } else if (IMC < 35) {
            System.out.println("obésité modérée");
        } else if (IMC < 40) {
            System.out.println("obésité sévère");
        } else {
            System.out.println("morbide ou massive");
        }

        IndiceMasseGrasse(65, 1.75, 21, 1);

    }

    // question 3

    public static void IndiceMasseGrasse(double masse, double taille, int age, int S) {
        double IMC = IndiceMasseCorporelle(masse, taille);
        double IMG = (1.2 * IMC) + (0.23 * age) - (10.8 * S) - 5.4;
        System.out.println(IMC);
        System.out.println(IMG);
        if (S == 0) {
            if (IMG < 25) {
                System.out.println(" trop maigre");
            } else if (IMG < 30) {
                System.out.println("normal");
            } else {
                System.out.println(" trop de graisse");
            }
        } else {
            if (IMG < 15) {
                System.out.println(" trop maigre");
            } else if (IMG < 20) {
                System.out.println("normal");
            } else {
                System.out.println(" trop de graisse");
            }

        }

    }
}

public class Tp3Exe2 {

    public static void main(String[] args) {

        // 1. Instancier un StringBuffer
        StringBuffer sb = new StringBuffer("la java 11123");

        // 2. Modifier la chaîne
        sb.replace(0, 2, "Le"); // Remplace "la" par "Le"
        sb.replace(3, 7, "langage"); // Remplace "java" par "langage"
        sb.replace(10, 15, "23"); // Remplace "11123" par "23"
        sb.insert(9, " Java "); // Insère " Java " après "langage"

        // 3. Afficher la nouvelle chaîne
        System.out.println("Nouvelle chaîne = " + sb);

        // 4. Autres méthodes de StringBuffer
        System.out.println("Longueur de la chaîne: " + sb.length());
        System.out.println("Caractère à l'index 5: " + sb.charAt(5));
        sb.append(" est puissant."); // Ajoute à la fin
        System.out.println("Après append: " + sb);
        sb.delete(20, 28); // Supprime " puissant"
        System.out.println("Après delete: " + sb);
        sb.reverse(); // Inverse la chaîne
        System.out.println("Après reverse: " + sb);
        sb.reverse(); // Remet dans le bon sens
        System.out.println("Re-reverse: " + sb);
        String sub = sb.substring(3, 12); // Extrait une sous-chaîne
        System.out.println("Sous-chaîne: " + sub);

        // 5. Instancier un StringBuilder
        StringBuilder sb2 = new StringBuilder("Java 23");
        System.out.println("StringBuilder initial: " + sb2);

        // Démonstration de performance (Copié du code fourni, légèrement modifié pour
        // la clarté)
        performanceTest();

    }

    public static void performanceTest() {
        long startTime;

        startTime = System.currentTimeMillis();
        StringBuffer sb = new StringBuffer("Java 23");
        for (int i = 0; i < 100000; i++) {
            sb.append(" Programming Language");
        }
        System.out.println("Temps écoulé par StringBuffer : " + (System.currentTimeMillis() - startTime) + "ms");

        startTime = System.currentTimeMillis();
        StringBuilder sb2 = new StringBuilder("Java 23");
        for (int i = 0; i < 100000; i++) {
            sb2.append(" Programming Language");
        }
        System.out.println("Temps écoulé par StringBuilder: " + (System.currentTimeMillis() - startTime) + "ms");
    }
}

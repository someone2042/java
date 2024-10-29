import java.util.Arrays;
import java.util.Scanner;

public class Tp3Exe1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Conversion d'un entier en chaîne de caractères
        int intValue = 12345;
        String stringValue = String.valueOf(intValue);
        System.out.println("1. Int vers String: " + stringValue);

        // 2. Conversion d'une chaîne de caractères en entier
        System.out.print("2. Entrez une chaîne de caractères numérique : ");
        String intString = scanner.nextLine();
        int parsedInt = Integer.parseInt(intString);
        System.out.println("Entier analysé : " + parsedInt);

        // 3. Conversion d'une chaîne de caractères en nombre à virgule flottante
        System.out.print("3. Entrez une chaîne de caractères représentant un nombre à virgule flottante : ");
        String floatString = scanner.nextLine();
        float parsedFloat = Float.parseFloat(floatString);
        System.out.println("Nombre à virgule flottante analysé : " + parsedFloat);

        // 4. Nom de ville en majuscules
        System.out.print("4. Entrez un nom de ville : ");
        String cityName = scanner.nextLine();
        String upperCaseCity = cityName.trim().toUpperCase();
        System.out.println("Nom de ville en majuscules : " + upperCaseCity);

        // 5. Conversion d'un tableau de caractères en chaîne de caractères
        char[] charArray = { 'H', 'e', 'l', 'l', 'o' };
        String charToString = new String(charArray);
        System.out.println("5. Tableau de caractères vers chaîne de caractères : " + charToString);

        // 6. Conversion d'une chaîne de caractères en tableau de caractères
        System.out.print("6. Entrez une chaine de caractére:");
        String stringToChar = scanner.nextLine();
        char[] stringToArray = stringToChar.toCharArray();
        System.out.println("6. Chaîne de caractères vers tableau de caractères : " + Arrays.toString(stringToArray));

        // 7. Comparaison du premier caractère
        System.out.print("7. Entrez la première chaîne de caractères : ");
        String s1 = scanner.nextLine();
        System.out.print("Entrez la deuxième chaîne de caractères : ");
        String s2 = scanner.nextLine();

        if (s1.isEmpty() || s2.isEmpty()) {
            System.out.println(
                    "Une ou les deux chaînes de caractères sont vides. Impossible de comparer les premiers caractères.");
        } else if (s1.charAt(0) == s2.charAt(0)) {
            System.out.println("Les chaînes de caractères commencent par le même caractère.");
        } else {
            System.out.println("Les chaînes de caractères ne commencent pas par le même caractère.");
        }

        // 8. Comparaisons de chaînes de caractères
        System.out.print("8a. Entrez la première chaîne de caractères : ");
        s1 = scanner.nextLine();
        System.out.print("Entrez la deuxième chaîne de caractères : ");
        s2 = scanner.nextLine();
        System.out.println("s1 == s2 : " + (s1 == s2));
        System.out.println("s1.equals(s2) : " + s1.equals(s2));
        System.out.println("s1.compareTo(s2) : " + s1.compareTo(s2));
        System.out.println("s1.compareToIgnoreCase(s2) : " + s1.compareToIgnoreCase(s2));

        // 9. Vérifications de sous-chaînes
        System.out.print("9a. Entrez la première chaîne de caractères : ");
        s1 = scanner.nextLine();
        System.out.print("Entrez la deuxième chaîne de caractères : ");
        s2 = scanner.nextLine();
        System.out.println("s1 commence par s2 : " + s1.startsWith(s2));
        System.out.println("s1 se termine par s2 : " + s1.endsWith(s2));
        System.out.println("s1 contient s2 : " + s1.contains(s2));

        // 10. Vérification de chaîne vide
        System.out.print("10. Entrez une chaîne de caractères : ");
        s1 = scanner.nextLine();
        System.out.println("La chaîne est-elle vide ? " + s1.isEmpty());

        // 11. Supprimer une sous-chaîne
        System.out.print("11a. Entrez la première chaîne de caractères : ");
        s1 = scanner.nextLine();
        System.out.print("Entrez la deuxième chaîne de caractères : ");
        s2 = scanner.nextLine();

        if (s1.contains(s2)) {
            int m = s1.indexOf(s2);
            System.out.println("Résultat : " + s1.substring(0, m) + s1.substring(m + s2.length())); // Manière plus
                                                                                                    // simple pour
                                                                                                    // supprimer
        } else {
            System.out.println("Résultat : " + s1);
        }

        // 12. Autres méthodes de la classe String (Exemples d'utilisation)
        String testString = "Hello World World";
        System.out.println("12. Index de 'World' : " + testString.indexOf("World"));
        System.out.println("Dernier index de 'World' : " + testString.lastIndexOf("World"));
        System.out.println("Longueur : " + testString.length());
        System.out.println("'World' remplacé par 'Java' : " + testString.replace("World", "Java"));
        System.out.println("Caractère à l'index 6 : " + testString.charAt(6));
        System.out.println("Code de hachage : " + testString.hashCode());

        scanner.close();
    }
}
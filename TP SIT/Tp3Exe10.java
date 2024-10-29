import java.util.Scanner;

public class Tp3Exe10 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String verb;

        do {
            System.out.print("Donnez un verbe régulier du premier groupe : ");
            verb = scanner.nextLine().toLowerCase();

            if (!verb.endsWith("er") || verb.equals("aller")) {
                System.out.println(
                        "*** il ne se termine pas par 'er' ou c'est un verbe irrégulier - donnez-en un autre : ");
            }
        } while (!verb.endsWith("er") || verb.equals("aller"));

        String stem = verb.substring(0, verb.length() - 2);

        String[] pronouns = { "Je ", "Tu ", "Il/Elle ", "Nous ", "Vous ", "Ils/Elles " };
        String[] endings = { "e", "es", "e", "ons", "ez", "ent" };

        if (stem.endsWith("g")) {
            endings[3] = "eons";
        } else if (stem.endsWith("c")) {
            endings[0] = "e";
            endings[3] = "çons";

        }

        for (int i = 0; i < pronouns.length; i++) {
            System.out.println(pronouns[i] + stem + endings[i]);
        }

        scanner.close();
    }
}

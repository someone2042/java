import java.util.Arrays;
import java.util.Scanner;

public class Tp3Exe3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Combien de mots ? ");
        int numWords = scanner.nextInt();

        String[] words = new String[numWords];

        System.out.println("Donnez vos mots:");
        for (int i = 0; i < numWords; i++) {
            words[i] = scanner.nextLine();
        }

        Arrays.sort(words, String.CASE_INSENSITIVE_ORDER);

        System.out.println("Liste par ordre alphabetique :");
        for (String word : words) {
            System.out.println(word);
        }

        scanner.close();
    }
}

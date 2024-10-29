import java.util.Scanner;

public class Tp3Exe9 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Donnez un mot : ");
        String word = scanner.nextLine().toLowerCase(); // Convert to lowercase for case-insensitivity

        char[] vowels = { 'a', 'e', 'i', 'o', 'u', 'y' };
        int[] counts = new int[vowels.length];

        for (char c : word.toCharArray()) {
            for (int i = 0; i < vowels.length; i++) {
                if (c == vowels[i]) {
                    counts[i]++;
                    break; // Exit inner loop after finding a match
                }
            }
        }

        System.out.println("il comporte");
        for (int i = 0; i < vowels.length; i++) {
            System.out.println(counts[i] + " fois la lettre " + vowels[i]);
        }

        scanner.close();
    }
}
import java.util.Scanner;

public class Tp3Exe4 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez un texte : ");
        String text = scanner.nextLine().toLowerCase(); // Convert to lowercase for case-insensitive counting

        System.out.print("Entrez un mot : ");
        String word = scanner.nextLine().toLowerCase(); // Convert to lowercase

        for (char letter : word.toCharArray()) {
            int count = 0;
            for (char c : text.toCharArray()) {
                if (c == letter) {
                    count++;
                }
            }
            System.out.println("Occurrences de '" + letter + "' dans le texte : " + count);
        }

        //////////////////////////// question 2

        System.out.print("Entrez une chaîne de caractères : ");
        String str = scanner.nextLine().toLowerCase(); // Convert to lowercase to ignore case

        boolean isPalindrome = isPalindrome(str);

        System.out.println(isPalindrome ? "vrai" : "faux");

        scanner.close();
    }

    private static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}
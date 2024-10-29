import java.util.Scanner;

public class Tp3Exe7 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez une chaîne de caractères : ");
        String inputString = scanner.nextLine();

        StringBuilder oddChars = new StringBuilder();
        StringBuilder evenChars = new StringBuilder();

        for (int i = 0; i < inputString.length(); i++) {
            if ((i + 1) % 2 != 0) { // Odd index
                oddChars.append(inputString.charAt(i));
            } else { // Even index
                evenChars.append(inputString.charAt(i));
            }
        }

        System.out.println(oddChars.toString());
        System.out.println(evenChars.toString());

        scanner.close();
    }
}

import java.util.Scanner;

public class Tp3Exe8 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputString;
        do {
            System.out.print("Entrez une chaîne de caractères de longueur impaire : ");
            inputString = scanner.nextLine();

            if (inputString.length() % 2 == 0) {
                System.out.println("Erreur : la longueur de la chaîne doit être impaire.");
            }
        } while (inputString.length() % 2 == 0);

        int n = inputString.length();
        int mid = n / 2;

        for (int i = 0; i <= mid; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(' ');
            }
            System.out.println(inputString.substring(i, n - i));
        }

        for (int i = mid - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print(' ');
            }
            System.out.println(inputString.substring(i, n - i));
        }

        scanner.close();
    }
}
import java.util.Scanner;

public class Tp3Exe5 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Donnez un nombre entier : ");
        String numberStr = scanner.nextLine().replaceAll("[a-zA-Z]", "");

        for (char digit : numberStr.toCharArray()) {
            System.out.println(digit);
        }

        scanner.close();
    }
}

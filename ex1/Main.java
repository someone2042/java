package ex1;

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        CompteBancaire compte = new CompteBancaire("someone", 1000, 5);

        compte.depot(500, LocalDateTime.now());
        compte.retrais(200, LocalDateTime.of(2008,5,21,9,37));
        compte.depot(1000, LocalDateTime.of(2023,4,15,16,30));
        compte.retrais(300, LocalDateTime.of(2020, 3, 4, 0, 0));

        compte.affiche();
    }
}

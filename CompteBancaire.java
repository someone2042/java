import java.util.Arrays;
// import java.util.Formatter;
import java.time.LocalDateTime;

class OperationBancaire {
    private LocalDateTime date;
    private double montant;

    public OperationBancaire(LocalDateTime date, double montant) {
        this.date = date;
        this.montant = montant;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public double getMontant() {
        return montant;
    }
}

public class CompteBancaire {
    private String titulaire;
    private double solde;
    private double tauxInteretAnnuel;
    private OperationBancaire[] operations;
    private int nombreOperations;

    public CompteBancaire(String titulaire, double soldeInitial, double tauxInteretAnnuel) {
        this.titulaire = titulaire;
        this.solde = soldeInitial;
        this.tauxInteretAnnuel = tauxInteretAnnuel;
        this.operations = new OperationBancaire[10];
        this.nombreOperations = 0;
    }

    public void depot(double montant, LocalDateTime date) {
        solde += montant;
        ajouterOperation(date, montant);
    }

    public void retrait(double montant, LocalDateTime date) {
        solde -= montant;
        ajouterOperation(date, -montant);
    }

    public double getSolde() {
        return solde;
    }

    public OperationBancaire[] getOperations() {
        return Arrays.copyOf(operations, nombreOperations);
    }

    public void calculInterets() {
        double interets = solde * (tauxInteretAnnuel / 100);
        solde += interets;
    }

    public void affiche() {
        System.out.println("Titulaire du compte : " + titulaire);
        System.out.println("Solde actuel : " + solde);
        calculInterets();
        System.out.println("Intérêts annuels gagnés : " + (solde - getSolde()));
        System.out.println("Historique des opérations :");
        afficherOperations();
    }

    private void ajouterOperation(LocalDateTime date, double montant) {
        if (nombreOperations == operations.length) {
            operations = Arrays.copyOf(operations, nombreOperations * 2);
        }
        operations[nombreOperations++] = new OperationBancaire(date, montant);
    }

    private void afficherOperations() {
        for (int i = 0; i < nombreOperations; i++) {
            OperationBancaire operation = operations[i];
            System.out.println(operation.getDate().getYear()+ "/"+ operation.getDate().getMonthValue()+"/"+operation.getDate().getDayOfMonth()+"--"+operation.getDate().getHour()+":"+operation.getDate().getMinute()+":"+operation.getDate().getSecond()+"       "+operation.getMontant());
        }
    }

    public static void main(String[] args) {
        CompteBancaire compte = new CompteBancaire("someone", 1000, 5);

        compte.depot(500, LocalDateTime.now());
        compte.retrait(200, LocalDateTime.of(2008,5,21,9,37));
        compte.depot(1000, LocalDateTime.of(2023,4,15,16,30));
        compte.retrait(300, LocalDateTime.of(2020, 3, 4, 0, 0));

        compte.affiche();
    }
}

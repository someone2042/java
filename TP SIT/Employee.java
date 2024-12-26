import java.util.Scanner;

public class Employee {
    private int id;
    private String nom;
    private String prenom;
    private String adresse;
    private double salaire;
    private static int employeeCount = 0;

    public Employee() {
        employeeCount++;
    }

    public Employee(int id, String nom, String prenom, String adresse, double salaire) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
        this.salaire = salaire;
        employeeCount++;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public double getSalaire() {
        return salaire;
    }

    public void setSalaire(double salaire) {
        this.salaire = salaire;
    }

    @Override
    public String toString() {
        return "Employee[id=" + id + ", nom=" + prenom + " " + nom + ", Adresse=" + adresse + ", salaire=" + salaire
                + "]";
    }

    public double getSalaireAnnuel() {
        return salaire * 12;
    }

    public double augmenterSalaire(int pourcentage) {
        salaire += salaire * (pourcentage / 100.0);
        return salaire;
    }

    public boolean estEligiblePourPromotion() {
        return salaire > 8000;
    }

    public static int getEmployeeCount() {
        return employeeCount;
    }

    public static void resetEmployeeCount() {
        employeeCount = 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez le nombre d'employés : ");
        int n = scanner.nextInt();
        scanner.nextLine();

        Employee[] employees = new Employee[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Employé " + (i + 1) + ":");
            System.out.print("ID : ");
            int id = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Nom : ");
            String nom = scanner.nextLine();
            System.out.print("Prénom : ");
            String prenom = scanner.nextLine();
            System.out.print("Adresse : ");
            String adresse = scanner.nextLine();
            System.out.print("Salaire : ");
            double salaire = scanner.nextDouble();
            scanner.nextLine();

            employees[i] = new Employee(id, nom, prenom, adresse, salaire);
        }

        System.out.println("\nInformations des employés :");
        for (Employee employee : employees) {
            System.out.println(
                    "Nom : " + employee.getPrenom() + " " + employee.getNom() + ", Salaire : " + employee.getSalaire());
        }

        scanner.close();
    }
}
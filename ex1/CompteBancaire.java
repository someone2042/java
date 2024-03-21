package ex1;

import java.time.LocalDateTime;
import java.util.Arrays;

public class CompteBancaire {
    private String nom;
    private float sold;
    private float taux;
    private OperationBancaire operations[];
    private int  nbOperations;

    public CompteBancaire(String nom, float sold, float taux){
        this.taux=taux;
        this.nbOperations=0;
        this.sold=sold;
        this.operations= new OperationBancaire[10];
        this.nom=nom;
    }
    public void addOperation(float montant,LocalDateTime date){
        if(this.operations.length==this.nbOperations){
            this.operations= Arrays.copyOf(this.operations,2*this.nbOperations);
        }
        operations[nbOperations++]= new OperationBancaire(montant,date);
    }
    public float getSold(){
        return this.sold;
    }
    public OperationBancaire[]  getOperations() {
        return Arrays.copyOf(this.operations,this.nbOperations);
    }
    public void depot(float montant, LocalDateTime  date){
        this.sold+=montant;
        addOperation(montant, date);
    }
    public void retrais(float montant, LocalDateTime  date){
        this.sold-=montant;
        addOperation(montant * -1 , date);
    }
    public void calcul_interets(){
        System.out.println(sold*(taux/100));
    }
    private void afficherOperations() {
        for (int i = 0; i < nbOperations; i++) {
            OperationBancaire operation = operations[i];
            System.out.println(operation.getDate().getYear()+ "/"+ operation.getDate().getMonthValue()+"/"+operation.getDate().getDayOfMonth()+"--"+operation.getDate().getHour()+":"+operation.getDate().getMinute()+":"+operation.getDate().getSecond()+"       "+operation.getMontant());
        }
    }
    public void affiche() {
        System.out.println("Solde actuel : " + sold);
        System.out.println("Intérêts annuels gagnés : " + (sold - getSold()));
        System.out.println("Historique des opérations :");
        afficherOperations();
    }
}

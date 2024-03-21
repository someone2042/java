package ex1;
import java.time.LocalDateTime;

public class OperationBancaire {
    private LocalDateTime date;
    private float montant;
    public OperationBancaire(float montant, LocalDateTime date){
        this.montant = montant;
        this.date=date;
    }
    public LocalDateTime getDate(){
        return this.date;
    }
    public float  getMontant(){
        return this.montant;
    }
}

public class Etudiant {
    private String nom;
    private int age;
    private int etuddiantId;
    private static int totalEtudiant=0;
    public Etudiant(String nom,int age,int etuddiantId){
        this.nom=nom;
        this.age=age;
        this.etuddiantId=etuddiantId; 
        incrementerTotalEtudients(); 
    }
    
    public static void incrementerTotalEtudients(){
        totalEtudiant++;
    }
    public static int getTotalEtudiants() {
        return totalEtudiant;
    }
    public String getName(){
        return this.nom;
    }
    public int getAge(){
        return this.age;
    }
    public int getEtudiantsId(){
        return  this.etuddiantId;
    }
    public static void main(String[] args) {
        // Création de plusieurs objets étudiants
        Etudiant e1 = new Etudiant("Durand", 20, 1);
        Etudiant e2 = new Etudiant("Lefebvre", 19, 2);
        Etudiant e3 = new Etudiant("Lefeere", 19, 3);
        Etudiant e4 = new Etudiant("Leferyreyre", 19, 4);
        Etudiant e5 = new Etudiant("Lefebvertgdgdre", 19, 5);
        Etudiant e6 = new Etudiant("Lefebvdgdtre", 19, 6);
        System.out.println("le nom: "+e1.getName()+", l\'age: "+e1.getAge()+", id: "+e1.getEtudiantsId());
        System.out.println("le nom: "+e2.getName()+", l\'age: "+e2.getAge()+", id: "+e2.getEtudiantsId());
        System.out.println("le nom: "+e3.getName()+", l\'age: "+e3.getAge()+", id: "+e3.getEtudiantsId());
        System.out.println("le nom: "+e4.getName()+", l\'age: "+e4.getAge()+", id: "+e4.getEtudiantsId());
        System.out.println("le nom: "+e5.getName()+", l\'age: "+e5.getAge()+", id: "+e5.getEtudiantsId());
        System.out.println("le nom: "+e6.getName()+", l\'age: "+e6.getAge()+", id: "+e6.getEtudiantsId());
        
        System.out.println("Nombre d'étudiants : " + getTotalEtudiants());
    }

}

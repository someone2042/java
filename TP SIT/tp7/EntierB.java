class EntierA implements Cloneable {
    private int entier = 10;

    public int getEntier() {
        return entier;
    }

    public void setEntier(int entier) {
        this.entier = entier;
    }

    @Override
    public EntierA clone() throws CloneNotSupportedException {
        return (EntierA) super.clone();
    }
}

class EntierB {
    private int entier = 1000;

    public int getEntier() {
        return entier;
    }

    public void setEntier(int entier) {
        this.entier = entier;
    }
}

class ObjetClonable implements Cloneable {
    private int entierLocal = 1;
    private EntierA entierA = new EntierA();
    private int[] tableau = { 0, 100 };
    private EntierB entierB = new EntierB();

    @Override
    public ObjetClonable clone() throws CloneNotSupportedException {
        ObjetClonable copie = (ObjetClonable) super.clone();
        copie.entierA = entierA.clone();
        copie.tableau = new int[tableau.length];
        System.arraycopy(tableau, 0, copie.tableau, 0, tableau.length);
        return copie;
    }

    public int getEntierLocal() {
        return entierLocal;
    }

    public void setEntierLocal(int entier) {
        this.entierLocal = entier;
    }

    public int[] getTableau() {
        return tableau;
    }

    public EntierA getEntierA() {
        return entierA;
    }

    public EntierB getEntierB() {
        return entierB;
    }
}

class EssaiClone {
    public static void main(String arg[]) throws CloneNotSupportedException {
        ObjetClonable I = new ObjetClonable(), J;
        J = I.clone();
        System.out.println("Dans l'original " + I.getEntierLocal() + " " +
                I.getEntierA().getEntier() + " " + I.getTableau()[1] + " " +
                I.getEntierB().getEntier());
        System.out.println("Dans la copie " + J.getEntierLocal() + " " +
                J.getEntierA().getEntier() + " " + J.getTableau()[1] + " " +
                J.getEntierB().getEntier());
        I.setEntierLocal(2);
        I.getEntierA().setEntier(20);
        I.getTableau()[1] = 200;
        I.getEntierB().setEntier(3000);
        System.out.println("Après changement de tout ce que contient l'original:");
        System.out.println("Dans l'original " + I.getEntierLocal() + " " +
                I.getEntierA().getEntier() + " " + I.getTableau()[1] + " " +
                I.getEntierB().getEntier());
        System.out.println("Dans la copie " + J.getEntierLocal() + " " +
                J.getEntierA().getEntier() + " " + J.getTableau()[1] + " " +
                J.getEntierB().getEntier());
    }
}
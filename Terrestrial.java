package tn.esprit.gestionzoo.entities;

public class Terrestrial {
    private int nbrLegs;

    public Terrestrial(int nbrLegs) {
        this.nbrLegs = nbrLegs;
    }

    public int getNbrLegs() {
        return nbrLegs;
    }

    public void setNbrLegs(int nbrLegs) {
            this.nbrLegs = nbrLegs;

    }
    public String toString() {
        return "Nombre de pattes: " + nbrLegs;
    }
}

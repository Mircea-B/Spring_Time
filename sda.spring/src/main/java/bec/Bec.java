package bec;

public class Bec {

    private Energie energie;

    public Bec(Energie energie) {
        this.energie = energie;
    }

    public void aprinde() {
        System.out.println("Avem" + energie.giveEnergy());

    }
}

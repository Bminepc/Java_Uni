package Uebung2.Aufgabe6;

public class Asteroid extends Kleinkörper {
    private boolean eisenkern;

    public Asteroid(String name, double durchmesser, double alter, Himmelskörper parent, boolean eisenkern) {
        super(name, durchmesser, alter, parent);
        this.eisenkern = eisenkern;
    }

    public String toString() {
        return super.toString() + ", Hat Eisenkern: " + eisenkern;
    }
}

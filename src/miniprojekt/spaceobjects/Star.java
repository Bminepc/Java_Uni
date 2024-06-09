package miniprojekt.spaceobjects;

public class Star extends Spaceobject{

    private double luminosity;

    public Star(String name, Spaceobject orbits, double size, int orbit, double luminosity) {
        super(name, orbits, size, orbit);
        this.luminosity = luminosity;
    }

    @Override
    public String toString() {
        return super.toString() + ", Luminosity: " + luminosity;
    }

}

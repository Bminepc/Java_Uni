package miniprojekt.spaceobjects;

public class Star extends Spaceobject{

    private double luminosity;

    public Star(String name, Spaceobject orbits, double size, double luminosity) {
        super(name, orbits, size);
        this.luminosity = luminosity;
    }

    @Override
    public String toString() {
        return super.toString() + ", Luminosity: " + luminosity;
    }

}

package miniprojekt.spaceobjects;

public class Star extends Spaceobject{

    private double luminosity;

    public Star(Spaceobject orbits, double size, double luminosity) {
        super(orbits, size);
        this.luminosity = luminosity;
    }

}

package miniprojekt.spaceobjects;

public class Star extends Spaceobject{

    private double luminosity;

    public Star(String name,double size, double luminosity) {
        super(name, null, size, 0);
        this.luminosity = luminosity;
    }

    public Boolean orbits(){
        return this.orbits != null;
    }

    @Override
    public String toString() {
        return super.toString() + ", Luminosity: " + luminosity;
    }

}

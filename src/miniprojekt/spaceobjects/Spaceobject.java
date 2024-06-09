package miniprojekt.spaceobjects;

public class Spaceobject {

    private Spaceobject orbits;
    private double size;

    public Spaceobject() {
        orbits = null;
        size = 1;
    }

    /**
     *
     * @param orbits
     * @param size
     */
    public Spaceobject(Spaceobject orbits, double size) {
        this.orbits = orbits;
        this.size = size;
    }

}

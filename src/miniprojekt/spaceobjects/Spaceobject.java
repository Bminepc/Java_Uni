package miniprojekt.spaceobjects;

public abstract class Spaceobject {

    private Spaceobject orbits;
    private double size;
    private String name;
    private int orbit;

    public Spaceobject() {
        orbits = null;
        size = 1;
        orbit = 1;
    }

    /**
     *
     * @param orbits
     * @param size
     */
    public Spaceobject(String name, Spaceobject orbits, double size, int orbit) {
        this.name = name;
        this.orbits = orbits;
        this.size = size;
        this.orbit = orbit;
    }

    public Spaceobject(String name, Spaceobject orbits, double size) {
        this.name = name;
        this.orbits = orbits;
        this.size = size;
        this.orbit = orbit;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Size: " + size + ", Orbits: (" + orbits +"), Orbit: " + orbit;
    }

}

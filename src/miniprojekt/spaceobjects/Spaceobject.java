package miniprojekt.spaceobjects;

public abstract class Spaceobject {

    protected Spaceobject orbits;
    protected double size;
    protected String name;
    protected int orbit;

    public Spaceobject() {
        orbits = null;
        size = 1;
        orbit = 1;
    }

    /**
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

    public int getSize() {
        return (int) size;
    }

    public String getName() {
        return name;
    }

    public int getOrbit() {
        return orbit;
    }

    public Spaceobject getOrbits() {
        return orbits;
    }

    public int getCenter() {
        return orbits != null ? (getSize() / 4) + orbits.getCenter() : getSize() / 4;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Size: " + size + ", Orbits: (" + orbits + "), Orbit: " + orbit;
    }

}

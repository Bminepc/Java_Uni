package miniprojekt.spaceobjects;

public abstract class Spaceobject {

    private Spaceobject orbits;
    private double size;
    private String name;

    public Spaceobject() {
        orbits = null;
        size = 1;
    }

    /**
     *
     * @param orbits
     * @param size
     */
    public Spaceobject(String name, Spaceobject orbits, double size) {
        this.name = name;
        this.orbits = orbits;
        this.size = size;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Size: " + size + ", Orbits: (" + orbits +")";
    }

}

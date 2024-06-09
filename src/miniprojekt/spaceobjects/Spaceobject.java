package miniprojekt.spaceobjects;

import miniprojekt.tools.CirclePosition;
import miniprojekt.tools.Coordinate;

public abstract class Spaceobject {

    protected Spaceobject orbits;
    protected double size;
    protected String name;
    protected int orbit;
    protected Coordinate position;

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
        position = calcPos();
    }

    public Spaceobject(String name, Spaceobject orbits, double size) {
        this.name = name;
        this.orbits = orbits;
        this.size = size;
        this.orbit = orbit;
        position = calcPos();
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
        return orbits != null ? orbits.getCenter() - getSize() : getSize() / 4;
    }

    protected Coordinate calcPos() {
        CirclePosition cp = new CirclePosition();
        return cp.calcRandomPosition(orbit, this.orbits.getPos());
    }

    public Coordinate getPos() {
        return this.position;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Size: " + size + ", Orbits: (" + orbits + "), Orbit: " + orbit;
    }

}

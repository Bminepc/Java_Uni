package miniprojekt.spaceobjects;

import miniprojekt.tools.CirclePosition;
import miniprojekt.tools.Coordinate;

import java.util.Random;

public abstract class Spaceobject {

    protected Spaceobject orbits;
    protected double size;
    protected String name;
    protected int orbit;
    protected Coordinate position;
    private int angle;

    public Spaceobject() {
        orbits = null;
        size = 1;
        orbit = 1;
        angle = 0;
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
        angle = new Random().nextInt(0,360);
        position = calcPos();
    }


    public Spaceobject(String name, Spaceobject orbits, double size) {
        this.name = name;
        this.orbits = orbits;
        this.size = size;
        this.orbit = 0;
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
        return cp.calcPosition(orbit, angle, this.orbits.getPos());
    }

    public Coordinate getPos() {
        return this.position;
    }

    public void advance() {
        CirclePosition cp = new CirclePosition();
        angle = (angle + 1) % 360;
        position = cp.calcPosition(orbit, angle, this.orbits.getPos());
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Size: " + size + ", Orbits: (" + orbits + "), Orbit: " + orbit;
    }

}

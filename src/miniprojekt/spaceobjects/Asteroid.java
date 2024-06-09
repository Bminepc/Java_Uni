package miniprojekt.spaceobjects;

import miniprojekt.tools.Coordinate;
import miniprojekt.tools.Vector;

public class Asteroid extends Spaceobject {

    private Vector vector;

    public Asteroid(String name, Vector vector, double size) {
        super(name, null, size);
        this.vector = vector;
        this.position = vector.getStart();
    }

    public Vector getVector() {
        return vector;
    }

    @Override
    protected Coordinate calcPos() {
        return null;
    }

    @Override
    public String toString() {
        return super.toString() + ", Movementvector: " + vector;
    }

}

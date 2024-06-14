package miniprojekt.spaceobjects;

import miniprojekt.tools.Coordinate;
import miniprojekt.tools.Vector;

public class Asteroid extends Spaceobject {

    private Vector vector;
    private int direction;

    public Asteroid(String name, Vector vector, double size) {
        super(name, null, size);
        this.vector = vector;
        this.position = vector.getStart();
        this.direction = 1;
    }

    public Vector getVector() {
        return vector;
    }

    @Override
    protected Coordinate calcPos() {
        return null;
    }

    @Override
    public void advance() {
        if (position.equals(vector.getEnd())) {
            direction = -1;
        } else if (position.equals(vector.getStart())) {
            direction = 1;
        }
        position = new Coordinate(position.getX() + (int) (vector.getEnd().getX() * 0.01 * direction), position.getY() + (int) (vector.getEnd().getY() * 0.01 * direction));
    }

    @Override
    public String toString() {
        return super.toString() + ", Movementvector: " + vector;
    }

}

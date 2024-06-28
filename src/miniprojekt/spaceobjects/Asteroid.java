package miniprojekt.spaceobjects;

import miniprojekt.tools.Coordinate;
import miniprojekt.tools.Vector;

public class Asteroid extends Spaceobject {

    private Vector vector;
    private int direction;
    private double offsetX, offsetY;

    public Asteroid(String name, Vector vector, double size) {
        super(name, null, size);
        this.vector = vector;
        this.position = vector.getStart();
        this.direction = 1;
        this.offsetX = 0;
        this.offsetY = 0;
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
        if (position.isNear(vector.getEnd())) {
            direction = -1;
        } else if (position.isNear(vector.getStart())) {
            direction = 1;
        }
        this.offsetX = offsetX + ((vector.getEnd().getX() - vector.getStart().getX()) * 0.01 * direction) - (int) ((vector.getEnd().getX() - vector.getStart().getX()) * 0.01 * direction);
        this.offsetY = offsetY + ((vector.getEnd().getY() - vector.getStart().getY()) * 0.01 * direction) - (int) ((vector.getEnd().getY() - vector.getStart().getY()) * 0.01 * direction);
        if (offsetX>1){
            offsetX = 0;
        }
        position = new Coordinate( position.getX() + (int) ((vector.getEnd().getX() - vector.getStart().getX()) * 0.01 * direction) - (offsetX > 1 ? 1 : 0), position.getY() + (int) ((vector.getEnd().getY()-vector.getStart().getY()) * 0.01 * direction) - (offsetY > 1 ? 1 : 0));
        if (offsetX>1) offsetX = 0;
        if (offsetY>1) offsetY = 0;
    }

    @Override
    public String toString() {
        return super.toString() + ", Movementvector: " + vector;
    }

}

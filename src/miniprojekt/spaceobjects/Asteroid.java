package miniprojekt.spaceobjects;

import miniprojekt.tools.Vector;

public class Asteroid extends Spaceobject{

    private Vector vector;

    public Asteroid(Vector vector, double size) {
        super(null, size);
        this.vector = vector;
    }

}

package miniprojekt.spaceobjects;

import miniprojekt.tools.Vector;

public class Asteroid extends Spaceobject{

    private Vector vector;

    public Asteroid(String name, Vector vector, double size) {
        super(name, null, size);
        this.vector = vector;
    }

    @Override
    public String toString(){
        return super.toString() + ", Movementvector: " + vector;
    }

}

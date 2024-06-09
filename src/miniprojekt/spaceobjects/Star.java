package miniprojekt.spaceobjects;

import miniprojekt.tools.CirclePosition;
import miniprojekt.tools.Coordinate;

public class Star extends Spaceobject {

    private double luminosity;

    public Star(String name, double size, double luminosity, int canvasSize) {
        super(name, null, size, 0);
        this.luminosity = luminosity;
        position = calcPos(canvasSize);
    }

    public Boolean orbits() {
        return this.orbits != null;
    }

    @Override
    protected Coordinate calcPos() {
        return null;
    }

    private Coordinate calcPos(int canvasSize) {
        return new Coordinate(canvasSize / 2, canvasSize / 2);
    }

    @Override
    public String toString() {
        return super.toString() + ", Luminosity: " + luminosity;
    }

}

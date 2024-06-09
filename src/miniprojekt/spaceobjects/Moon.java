package miniprojekt.spaceobjects;

public class Moon extends Spaceobject{

    private double reflectiveCoefficient;

    public Moon(Spaceobject orbits, double size, double reflectiveCoefficient) {
        super(orbits, size);
        this.reflectiveCoefficient = reflectiveCoefficient;
    }

}

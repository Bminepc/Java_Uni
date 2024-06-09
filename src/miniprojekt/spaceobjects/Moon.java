package miniprojekt.spaceobjects;

public class Moon extends Spaceobject{

    private double reflectiveCoefficient;

    public Moon(String name, Spaceobject orbits, double size, int orbit, double reflectiveCoefficient) {
        super(name, orbits, size, orbit);
        this.reflectiveCoefficient = reflectiveCoefficient;
    }

    public Moon(String name, Spaceobject orbits, double size, int orbit) {
        super(name, orbits, size, orbit);
        this.reflectiveCoefficient = 1;
    }

    @Override
    public String toString(){
        return super.toString() + ", ReflectiveCoefficient: " + reflectiveCoefficient;
    }

}

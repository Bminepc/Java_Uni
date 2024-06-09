package miniprojekt.spaceobjects;

public class Moon extends Spaceobject{

    private double reflectiveCoefficient;

    public Moon(String name, Spaceobject orbits, double size, double reflectiveCoefficient) {
        super(name, orbits, size);
        this.reflectiveCoefficient = reflectiveCoefficient;
    }

    @Override
    public String toString(){
        return super.toString() + ", ReflectiveCoefficient: " + reflectiveCoefficient;
    }

}

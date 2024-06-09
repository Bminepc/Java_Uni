package miniprojekt.spaceobjects;

public class Gasplanet extends Planet{

    private double density;

    public Gasplanet(String name, Spaceobject orbits, double size, Material material){
        super(name, orbits, size, material);
        density = 1;
    }

    public Gasplanet(String name, Spaceobject orbits, double size, Material material, double density){
        super(name, orbits, size, material);
        this.density = density;
    }

    @Override
    public String toString(){
        return super.toString() + ", Density: " + density;
    }
}

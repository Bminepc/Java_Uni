package miniprojekt.spaceobjects;

public class Gasplanet extends Planet{

    private double density;

    public Gasplanet(Spaceobject orbits, double size, Material material){
        super(orbits, size, material);
        density = 1;
    }

    public Gasplanet(Spaceobject orbits, double size, Material material, double density){
        super(orbits, size, material);
        this.density = density;
    }
}

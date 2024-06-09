package miniprojekt.spaceobjects;

public class Planet extends Spaceobject{

    private Material material;

    public Planet(Spaceobject orbits, double size, Material material){
        super(orbits, size);
        this.material = material;
    }

}

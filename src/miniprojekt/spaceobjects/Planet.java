package miniprojekt.spaceobjects;

public abstract class Planet extends Spaceobject{

    private Material material;

    public Planet(String name, Spaceobject orbits, double size, int orbit, Material material){
        super(name, orbits, size, orbit);
        this.material = material;
    }

    @Override
    public String toString(){
        return super.toString() + ", Material: " + material;
    }

}

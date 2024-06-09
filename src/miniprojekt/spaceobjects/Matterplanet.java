package miniprojekt.spaceobjects;

public class Matterplanet extends Planet{

    private Boolean inhabitable;
    private int population;

    public Matterplanet(Spaceobject orbits, double size, Material material, int population){
        super(orbits, size, material);
        this.population = population;
        this.inhabitable = population > 0;
    }
}

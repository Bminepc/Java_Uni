package miniprojekt.spaceobjects;

public class Matterplanet extends Planet {

    private Boolean inhabitable;
    private int population;

    public Matterplanet(String name, Spaceobject orbits, double size, int orbit, Material material, int population) {
        super(name, orbits, size, orbit, material);
        this.population = population;
        this.inhabitable = population > 0;
    }

    public Boolean isInhabitable() {
        return inhabitable;
    }

    @Override
    public String toString() {
        return super.toString() + ", inhabitable: " + inhabitable + ", population: " + population;
    }
}

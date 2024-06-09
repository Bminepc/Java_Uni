package miniprojekt.spaceobjects;

public class Gasplanet extends Planet {

    private double density;

    public Gasplanet(String name, Spaceobject orbits, double size, int orbit, Material material) {
        super(name, orbits, size, orbit, material);
        density = 1;
    }

    public Gasplanet(String name, Spaceobject orbits, double size, int orbit, Material material, double density) {
        super(name, orbits, size, orbit, material);
        this.density = density;
    }

    public double getDensity() {
        return density;
    }

    @Override
    public String toString() {
        return super.toString() + ", Density: " + density;
    }
}

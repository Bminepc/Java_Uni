package miniprojekt.spaceobjects;

public enum Material {
    STONE,
    WATER,
    HYDROGEN,
    HELIUM,
    IRON,
    COPPER,
    GOLD;
    @Override
    public String toString() {
        return switch (this){
            case STONE -> "Stone";
            case WATER -> "Water";
            case HYDROGEN -> "Hydrogen";
            case HELIUM -> "Helium";
            case IRON -> "Iron";
            case COPPER -> "Copper";
            case GOLD -> "Gold";
        };
    }
}

package miniprojekt.spaceobjects;

import java.awt.*;

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

    public Color getColor() {
        return switch (this){
            case STONE -> Color.BLUE;
            case WATER -> Color.CYAN;
            case HYDROGEN -> Color.PINK;
            case HELIUM -> Color.MAGENTA;
            case IRON -> Color.RED;
            case COPPER -> Color.GREEN;
            case GOLD -> Color.YELLOW;
        };
    }
}

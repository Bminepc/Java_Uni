package miniprojekt.main;

import miniprojekt.ourList.*;
import miniprojekt.spaceobjects.*;

public class Main {

    public static void main(String[] args) {
        Listhead<Spaceobject> spaceobjects = new Listhead<>(new Star("Sonne", null, 10.0,0,10.0));
        spaceobjects.add(new Matterplanet("Erde", spaceobjects.getCurrent(), 2.0,5, Material.STONE, 700000000));

        try {
            System.out.println(spaceobjects.getSpecific(1));
            System.out.println(spaceobjects.getCurrent());
        }catch (Exception _){};
    }

}

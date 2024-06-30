package miniprojekt.network;

import miniprojekt.ourList.Listhead;
import miniprojekt.spaceobjects.*;
import miniprojekt.tools.Coordinate;
import miniprojekt.tools.Vector;

public class Server implements Runnable{

    private static Listhead<Spaceobject> spaceobjects;

    @Override
    public void run() {

    }

    public static void main(String[] args) {
        spaceobjects = new Listhead<>(new Star("Sonne", 100.0, 10.0, 1000));
        spaceobjects.add(new Matterplanet("Erde", spaceobjects.getCurrent(), 20.0, 150, Material.STONE, 700000000));
        spaceobjects.add(new Matterplanet("Venus", spaceobjects.getCurrent(), 25.0, 130, Material.GOLD, 0));
        spaceobjects.add(new Gasplanet("Helo", spaceobjects.getCurrent(), 40, 230, Material.HELIUM));
        spaceobjects.add(new Gasplanet("Satrn", spaceobjects.getCurrent(), 40, 400, Material.HELIUM, 0.5));
        spaceobjects.add(new Asteroid("cb1", new Vector(new Coordinate(300, 300), new Coordinate(500, 500)), 10));
        try {
            spaceobjects.add(new Moon("Lunar", spaceobjects.getSpecific(1), 15, 40, 1));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}

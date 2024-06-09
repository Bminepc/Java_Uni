package miniprojekt.main;

import miniprojekt.graphics.Spaceframe;
import miniprojekt.ourList.Listhead;
import miniprojekt.spaceobjects.*;
import miniprojekt.tools.CirclePosition;
import miniprojekt.tools.Coordinate;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        Listhead<Spaceobject> spaceobjects = new Listhead<>(new Star("Sonne", 100.0,10.0, 1000));
        spaceobjects.add(new Matterplanet("Erde", spaceobjects.getCurrent(), 20.0,150, Material.STONE, 700000000));
        spaceobjects.add(new Matterplanet("Erde2", spaceobjects.getCurrent(), 25.0,130, Material.GOLD, 0));
        spaceobjects.add(new Gasplanet("Helo", spaceobjects.getCurrent(), 40, 200, Material.HELIUM));
        spaceobjects.add(new Gasplanet("Helo2", spaceobjects.getCurrent(), 40, 400, Material.HELIUM,0.5));
        try {
            spaceobjects.add(new Moon("Lunar", spaceobjects.getSpecific(1),15,40,1));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        try {
            System.out.println(spaceobjects.getSpecific(1));
            System.out.println(spaceobjects.getCurrent());
        }catch (Exception _){};

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                Spaceframe sf = new Spaceframe(spaceobjects);
            }
        });
    }

}

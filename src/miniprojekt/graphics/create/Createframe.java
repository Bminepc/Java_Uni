package miniprojekt.graphics.create;

import miniprojekt.ourList.Listhead;
import miniprojekt.spaceobjects.Spaceobject;

import javax.swing.*;
import java.awt.*;

public class Createframe extends JFrame {

    protected JTextField name, size, orbit;
    protected JLabel nameL, sizeL, orbitL, orbitsL;
    protected JComboBox orbits;
    protected JButton enter;


    public Createframe(Listhead<Spaceobject> spaceobjects) {
        name = new JTextField("Name", 35);
        nameL = new JLabel("Name:");
        size = new JTextField("Size", 5);
        sizeL = new JLabel("Size:");
        String[] s = new String[spaceobjects.length()];
        try {
            for (int i = 0; i < s.length; i++) {
                s[i] = spaceobjects.getSpecific(i).getName();
            }
        } catch (Exception _) {
        }
        orbits = new JComboBox(s);
        orbitsL = new JLabel("Orbits:");
        orbit = new JTextField("Orbit", 10);
        orbitL = new JLabel("Orbit:");

        this.setLayout(new FlowLayout());
        this.add(nameL);
        this.add(name);
        this.add(sizeL);
        this.add(size);
        this.add(orbitsL);
        this.add(orbits);
        this.add(orbitL);
        this.add(orbit);
        this.pack();
        this.setResizable(false);
        this.setVisible(true);
    }
}

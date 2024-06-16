package miniprojekt.graphics.create;

import miniprojekt.ourList.Listhead;
import miniprojekt.spaceobjects.Spaceobject;

import javax.swing.*;
import java.awt.*;

public class Createframe extends JFrame {

    public Createframe(Listhead spaceobjects){
        JTextField name = new JTextField("Name", 35);
        JLabel nameL = new JLabel("Name:");
        JTextField size = new JTextField("Size", 5);
        JLabel sizeL = new JLabel("Size:");
        JList orbits = new JList(spaceobjects);
        JLabel orbitsL = new JLabel("Orbits:");
        JTextField orbit = new JTextField("Orbit", 10);
        JLabel orbitL = new JLabel("Orbit:");

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
        this.setVisible(true);
    }
}

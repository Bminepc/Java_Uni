package miniprojekt.graphics.create;

import miniprojekt.ourList.Listhead;
import miniprojekt.spaceobjects.Spaceobject;

import javax.swing.*;

public class CreateMatterplanet extends Createframe{
    private JTextField population;
    private JLabel populationL;


    public CreateMatterplanet(Listhead<Spaceobject> spaceobjects) {
        super(spaceobjects);
        populationL = new JLabel("Population:");
        population = new JTextField("Population", 10);
        this.add(populationL);
        this.add(population);
        this.pack();
        System.out.println("Whatdafug");
    }
}

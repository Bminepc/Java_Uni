package miniprojekt.graphics.create;

import miniprojekt.ourList.Listhead;
import miniprojekt.spaceobjects.Material;
import miniprojekt.spaceobjects.Matterplanet;
import miniprojekt.spaceobjects.Spaceobject;

import javax.swing.*;

public class CreateMatterplanet extends Createframe{
    private JTextField population;
    private JLabel populationL, materialL;
    private JComboBox material;


    public CreateMatterplanet(Listhead<Spaceobject> spaceobjects) {
        super(spaceobjects);
        populationL = new JLabel("Population:");
        population = new JTextField("Population", 10);
        materialL = new JLabel("Material:");
        material = new JComboBox(Material.values());
        this.add(materialL);
        this.add(material);
        this.add(populationL);
        this.add(population);
        this.pack();
    }

    @Override
    public void createObject(){
        spaceobject.add(new Matterplanet(name.getText(), getOrbits(), Double.parseDouble(size.getText()),Integer.parseInt(orbit.getText()), (Material) material.getSelectedItem(),Integer.parseInt(population.getText())));
        this.dispose();
    }
}

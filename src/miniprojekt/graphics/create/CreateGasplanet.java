package miniprojekt.graphics.create;

import miniprojekt.ourList.Listhead;
import miniprojekt.spaceobjects.Gasplanet;
import miniprojekt.spaceobjects.Material;
import miniprojekt.spaceobjects.Spaceobject;

import javax.swing.*;

public class CreateGasplanet extends Createframe{
    private JTextField density;
    private JLabel densityL, materialL;
    private JComboBox material;
    public CreateGasplanet(Listhead<Spaceobject> spaceobjects) {
        super(spaceobjects);
        density=new JTextField("Density");
        densityL=new JLabel("Density:");
        materialL = new JLabel("Material:");
        material = new JComboBox(Material.values());
        this.add(materialL);
        this.add(material);
        this.add(densityL);
        this.add(density);
        this.pack();
    }

    @Override
    public void createObject(){
        spaceobject.add(new Gasplanet(name.getText(),getOrbits(),Double.parseDouble(size.getText()),Integer.parseInt(orbit.getText()),(Material) material.getSelectedItem()));
        this.dispose();
    }
}

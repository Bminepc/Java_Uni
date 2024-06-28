package miniprojekt.graphics.create;

import miniprojekt.ourList.Listhead;
import miniprojekt.spaceobjects.Moon;
import miniprojekt.spaceobjects.Spaceobject;

import javax.swing.*;

public class CreateMoon extends Createframe{

    private JTextField reflectiveCoefficient;
    private JLabel reflectiveCoefficientL;
    public CreateMoon(Listhead<Spaceobject> spaceobjects) {
        super(spaceobjects);
        reflectiveCoefficient = new JTextField("0.5", 5);
        reflectiveCoefficientL = new JLabel("Reflective Coefficient:");
        this.add(reflectiveCoefficientL);
        this.add(reflectiveCoefficient);
        this.pack();
    }

    @Override
    public void createObject(){
        spaceobject.add(new Moon(name.getText(),getOrbits(), Double.parseDouble(size.getText()), Integer.parseInt(orbit.getText()), Double.parseDouble(reflectiveCoefficient.getText())));
        this.dispose();
    }
}

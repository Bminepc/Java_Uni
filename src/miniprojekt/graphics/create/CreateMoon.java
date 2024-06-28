package miniprojekt.graphics.create;

import miniprojekt.ourList.Listhead;
import miniprojekt.spaceobjects.Spaceobject;

import javax.swing.*;

public class CreateMoon extends Createframe{

    private JTextField reflectiveCoefficient;
    private JLabel reflectiveCoefficientL;
    public CreateMoon(Listhead<Spaceobject> spaceobjects) {
        super(spaceobjects);
        reflectiveCoefficient = new JTextField("Reflectiv");
        reflectiveCoefficientL = new JLabel("Reflective Coefficient:");
        this.add(reflectiveCoefficientL);
        this.add(reflectiveCoefficient);
    }
}

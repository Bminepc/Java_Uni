package miniprojekt.graphics.create;

import miniprojekt.ourList.Listhead;
import miniprojekt.spaceobjects.Asteroid;
import miniprojekt.spaceobjects.Spaceobject;
import miniprojekt.tools.Coordinate;
import miniprojekt.tools.Vector;

import javax.swing.*;

public class CreateAsteroid extends Createframe{
    private JTextField x1,x2,y1,y2;
    private JLabel x1L,x2L,y1L,y2L;

    public CreateAsteroid(Listhead<Spaceobject> spaceobjects) {
        super(spaceobjects);
        x1L=new JLabel("X Start");
        x2L=new JLabel("X End");
        y1L=new JLabel("Y Start");
        y2L=new JLabel("Y End");
        x1=new JTextField("X",5);
        x2=new JTextField("X",5);
        y1=new JTextField("Y",5);
        y2=new JTextField("Y",5);
        this.remove(orbits);
        this.remove(orbitsL);
        this.remove(orbit);
        this.remove(orbitsL);
        this.add(x1L);
        this.add(x1);
        this.add(y1L);
        this.add(y1);
        this.add(x2L);
        this.add(x2);
        this.add(y2L);
        this.add(y2);
        this.pack();
    }

    @Override
    public void createObject(){
        spaceobject.add(new Asteroid(name.getText(),new Vector(new Coordinate(Integer.parseInt(x1.getText()),Integer.parseInt(y1.getText())),new Coordinate(Integer.parseInt(x2.getText()),Integer.parseInt(y2.getText()))),Double.parseDouble(size.getText())));
        this.dispose();
    }
}

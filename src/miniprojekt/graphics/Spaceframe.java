package miniprojekt.graphics;

import miniprojekt.ourList.Listhead;
import miniprojekt.spaceobjects.Spaceobject;

import javax.swing.*;
import java.awt.*;

public class Spaceframe extends JFrame {

    private Spacepanel sp;

    public Spaceframe(Listhead<Spaceobject> spaceobjects){
        super("Spacepainter");
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        sp = new Spacepanel(spaceobjects);
        setLayout(new BorderLayout());
        add(sp, BorderLayout.CENTER);
        setSize(1000, 1000);
        setVisible(true);
    }
}

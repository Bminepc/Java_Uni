package miniprojekt.graphics;

import miniprojekt.animation.Animator;
import miniprojekt.ourList.Listhead;
import miniprojekt.spaceobjects.Spaceobject;

import javax.swing.*;
import java.awt.*;

public class Spaceframe extends JFrame {

    private Spacepanel sp;

    public Spaceframe(Listhead<Spaceobject> spaceobjects) {
        super("Spacepainter");
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        sp = new Spacepanel(spaceobjects);
        setLayout(new BorderLayout());
        add(sp, BorderLayout.CENTER);
        setSize(1000, 1000);
        Animator animator = new Animator(spaceobjects,this);
        animator.start();
        animator.startanimate();
        setVisible(true);
    }
}

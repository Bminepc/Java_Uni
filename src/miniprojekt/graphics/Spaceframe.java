package miniprojekt.graphics;

import miniprojekt.animation.Animator;
import miniprojekt.graphics.create.*;
import miniprojekt.ourList.Listhead;
import miniprojekt.spaceobjects.Spaceobject;

import javax.swing.*;
import java.awt.*;

public class Spaceframe extends JFrame {

    private Spacepanel sp;

    public Spaceframe(Listhead<Spaceobject> spaceobjects) {
        super("Spacepainter");
        Animator animator = new Animator(spaceobjects,this);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        sp = new Spacepanel(spaceobjects);
        setLayout(new BorderLayout());
        add(sp, BorderLayout.CENTER);
        JMenuBar mb = new JMenuBar();
        JMenu menu = new JMenu("Menü");
        JMenuItem startStop = new JMenuItem("Start / Stop");
        startStop.addActionListener(e -> {
            if (animator.annimating()){
                animator.stopanimate();
            }else {
                animator.startanimate();
            }
        });

        JMenu create = new JMenu("Create");
        // Moon
        JMenuItem createMoon = new JMenuItem("Moon");
        createMoon.addActionListener(e -> {
            Createframe c = new CreateMoon(spaceobjects);
        });
        create.add(createMoon);
        // Matterplanet
        JMenuItem createMatterplanet = new JMenuItem("Matterplanet");
        createMatterplanet.addActionListener(e -> {
            Createframe c = new CreateMatterplanet(spaceobjects);
        });
        create.add(createMatterplanet);
        // Gasplanet
        JMenuItem createGasplanet = new JMenuItem("Gasplanet");
        createGasplanet.addActionListener(e -> {
            Createframe c = new CreateGasplanet(spaceobjects);
        });
        create.add(createGasplanet);
        // Asteroid
        JMenuItem createAsteroid = new JMenuItem("Asteroid");
        createAsteroid.addActionListener(e -> {
            Createframe c = new CreateAsteroid(spaceobjects);
        });
        create.add(createAsteroid);

        menu.add(startStop);
        menu.add(create);
        mb.add(menu);
        this.setJMenuBar(mb);
        setSize(1000, 1000);
        animator.start();
        setVisible(true);
    }
}

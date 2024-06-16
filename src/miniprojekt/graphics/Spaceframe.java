package miniprojekt.graphics;

import miniprojekt.animation.Animator;
import miniprojekt.graphics.create.Createframe;
import miniprojekt.ourList.Listhead;
import miniprojekt.spaceobjects.Spaceobject;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
        startStop.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (animator.annimating()){
                    animator.stopanimate();
                }else {
                    animator.startanimate();
                }
            }
        });
        JMenuItem create = new JMenuItem("Create");
        create.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Createframe c = new Createframe(spaceobjects);
            }
        });
        menu.add(startStop);
        menu.add(create);
        mb.add(menu);
        this.setJMenuBar(mb);
        setSize(1000, 1000);
        animator.start();
        setVisible(true);
    }
}

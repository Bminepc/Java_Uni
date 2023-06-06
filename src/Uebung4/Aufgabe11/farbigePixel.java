package Uebung4.Aufgabe11;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Vector;

public class farbigePixel extends JFrame {
    public farbigePixel(){
        super("Farbige Pixel");
        setResizable(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        Vector<Pix> Pixs = new Vector<>();

        JPanel malSpass = new JPanel();
        malSpass.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                Pix temp;
                switch (e.getButton()){
                    case 1:
                        temp = new Pix(Color.RED,e.getX(),e.getY());
                        Pixs.add(temp);
                        break;
                    case 2:
                        temp = new Pix(Color.GREEN,e.getX(),e.getY());
                        Pixs.add(temp);
                        break;
                    case 3:
                        temp = new Pix(Color.BLUE,e.getX(),e.getY());
                        Pixs.add(temp);
                        break;
                    default:
                        System.out.println("Was ist denn hier los?");
                }
            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {
                // NONE
            }

            @Override
            public void mouseExited(MouseEvent e) {
                // None
            }
        });
        setLayout(new BorderLayout());
        add(malSpass, BorderLayout.CENTER);
        this.setSize(300,300);

        setVisible(true);
    }
    public static void main(String[] args){
        SwingUtilities.invokeLater(farbigePixel::new);
    }
}

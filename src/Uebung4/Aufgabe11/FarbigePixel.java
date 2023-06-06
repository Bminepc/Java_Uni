package Uebung4.Aufgabe11;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Vector;

public class FarbigePixel extends JFrame {
    public FarbigePixel(){
        super("Farbige Pixel");
        setResizable(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        PaintPanel malSpass = new PaintPanel();
        malSpass.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                Pix temp;
                switch (e.getButton()){
                    case 1:
                        temp = new Pix(Color.RED,(e.getX() - (e.getX()%10))/10,(e.getY() - (e.getY()%10))/10);
                        break;
                    case 2:
                        temp = new Pix(Color.GREEN,(e.getX() - (e.getX()%10))/10,(e.getY() - (e.getY()%10))/10);
                        break;
                    case 3:
                        temp = new Pix(Color.BLUE,(e.getX() - (e.getX()%10))/10,(e.getY() - (e.getY()%10))/10);
                        break;
                    default:
                        System.out.println("Was ist denn hier los?");
                        temp = null;
                }
                malSpass.addPix(temp);
                repaint();
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
        SwingUtilities.invokeLater(FarbigePixel::new);
    }
}
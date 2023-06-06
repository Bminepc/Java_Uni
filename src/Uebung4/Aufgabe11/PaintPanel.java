package Uebung4.Aufgabe11;

import javax.swing.*;
import java.awt.*;
import java.util.Vector;

public class PaintPanel extends JPanel {

    Vector<Pix> Pixs = new Vector<>();

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        for(int i = 0; i < Pixs.size();i++){
            g.setColor(Pixs.get(i).getFarbe());
            g.fillRect(Pixs.get(i).getX() * 10, Pixs.get(i).getY() * 10, 10, 10);
        }
    }

    public void addPix(Pix p){
        Pixs.add(p);
    }
}

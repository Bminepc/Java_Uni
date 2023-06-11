package Uebung4.Aufgabe11;

import javax.swing.*;
import java.awt.*;
import java.util.Vector;

public class PaintPanel extends JPanel {
    //Vector zum Speichern der einzelnen Pixel
    Vector<Pix> Pixs = new Vector<>();

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        //Zeichnet alle Pixel im Vector Pixs
        for(int i = 0; i < Pixs.size();i++){
            g.setColor(Pixs.get(i).getFarbe());
            g.fillRect(Pixs.get(i).getX() * 10, Pixs.get(i).getY() * 10, 10, 10);
        }
    }
    //Fügt neuen Pixel zu Pixs hinzu
    public void addPix(Pix p){
        Pixs.add(p);
    }
}

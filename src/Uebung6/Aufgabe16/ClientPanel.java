package Uebung6.Aufgabe16;

import javax.swing.*;
import java.awt.*;

public class ClientPanel extends JPanel {
    private double kx,ky;
    private Color c;
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(c);
        g.fillOval((int)kx,(int)ky,10,10);
    }

    public void setKreis(double kx, double ky, Color c){
        this.c = c;
        this.kx = kx;
        this.ky = ky;
    }
}

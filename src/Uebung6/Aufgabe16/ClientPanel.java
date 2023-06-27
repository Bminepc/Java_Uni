package Uebung6.Aufgabe16;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class ClientPanel extends JPanel {
    private ArrayList<Kreissaver> kreise = new ArrayList<>();

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        for (int i = 0; i < kreise.size(); i++) {
            g.setColor(kreise.get(i).getColor());
            g.fillOval((int) kreise.get(i).getX(), (int) kreise.get(i).getY(), 10, 10);
        }
    }

    public void addKreis(double kx, double ky, Color c) {
        kreise.add(new Kreissaver(kx, ky, c));
    }
}

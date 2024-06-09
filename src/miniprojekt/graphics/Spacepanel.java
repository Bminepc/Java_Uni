package miniprojekt.graphics;

import miniprojekt.ourList.Listhead;
import miniprojekt.spaceobjects.*;

import javax.swing.*;
import java.awt.*;

public class Spacepanel extends JPanel {

    private Listhead<Spaceobject> spaceobjects;

    public Spacepanel(Listhead<Spaceobject> spaceobjects) {
        this.spaceobjects = spaceobjects;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        this.setBackground(Color.BLACK);
        for (int i = 0; i < spaceobjects.length(); i++) {
            try {
                paintSpaceObject(spaceobjects.getSpecific(i), g);
            } catch (Exception _) {
            }
        }
    }

    public Graphics paintSpaceObject(Spaceobject so, Graphics g) {
        switch (so) {
            case Star s:
                paintStar(s, g);
                break;
            case Matterplanet m:
                paintMatterplanet(m, g);
                break;
            case Gasplanet p:
                paintGasplanet(p, g);
                break;
            case Asteroid a:
                paintAsteroid(a, g);
                break;
            case Moon m:
                paintMoon(m, g);
                break;
            default:
                throw new IllegalStateException("Unexpected Value in Spaceobject");
        }
        return g;
    }

    public Graphics paintStar(Star s, Graphics g) {
            g.setColor(Color.ORANGE);
            g.fillOval(500, 500, s.getSize(), s.getSize());
            g.setColor(Color.WHITE);
            g.drawString(s.getName(), 500, 500);
        return g;
    }

    public Graphics paintMatterplanet(Matterplanet m, Graphics g) {
        g.setColor(m.getMaterial().getColor());
        g.fillOval(500 - m.getOrbit(), 500 + m.getCenter(), m.getSize(), m.getSize());
        if (m.isInhabitable()) {
            g.setColor(Color.WHITE);
        } else {
            g.setColor(Color.BLACK);
        }
        g.fillOval(500 - m.getOrbit() + m.getSize() / 4, 500 + m.getSize() / 4 + m.getCenter(), m.getSize() / 2, m.getSize() / 2);
        g.setColor(Color.WHITE);
        g.drawString(m.getName(), 500 - m.getOrbit(), 500 + m.getCenter());
        return g;
    }

    public Graphics paintGasplanet(Gasplanet p, Graphics g) {
        g.setColor(mapOpacity(p.getMaterial().getColor(),p.getDensity()));
        g.fillOval(500 - p.getOrbit(), 500 + p.getCenter(), p.getSize(), p.getSize());
        g.setColor(Color.WHITE);
        g.drawString(p.getName(), 500 - p.getOrbit(), 500 + p.getCenter());
        return g;
    }

    public Graphics paintAsteroid(Asteroid a, Graphics g) {

        return g;
    }

    public Graphics paintMoon(Moon m, Graphics g) {
        g.setColor(mapOpacity(Color.WHITE,m.getReflectiveCoefficient()));
        g.fillOval(500-m.getOrbits().getOrbit() - m.getOrbit(), 500 + m.getCenter(), m.getSize(), m.getSize());
        g.setColor(Color.WHITE);
        g.drawString(m.getName(), 500-m.getOrbits().getOrbit() - m.getOrbit(), 500 + m.getCenter());
        return g;
    }

    public Color mapOpacity(Color c, double opacity) {
        return new Color(c.getRed(), c.getGreen(), c.getBlue(), (int) (opacity * 255));
    }
}

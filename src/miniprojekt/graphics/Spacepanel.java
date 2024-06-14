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
        g.fillOval(s.getPos().getX() - s.getSize() / 2, s.getPos().getY() - s.getSize() / 2, s.getSize(), s.getSize());
        g.setColor(Color.WHITE);
        g.drawString(s.getName(), s.getPos().getX() - s.getSize() / 2, s.getPos().getY() - s.getSize() / 2);
        return g;
    }

    public Graphics paintMatterplanet(Matterplanet m, Graphics g) {
        g.setColor(m.getMaterial().getColor());
        g.fillOval(m.getPos().getX() - m.getSize() / 2, m.getPos().getY() - m.getSize() / 2, m.getSize(), m.getSize());
        if (m.isInhabitable()) {
            g.setColor(Color.WHITE);
        } else {
            g.setColor(Color.BLACK);
        }
        g.fillOval(m.getPos().getX() - m.getSize() / 4, m.getPos().getY() - m.getSize() / 4, m.getSize() / 2, m.getSize() / 2);
        g.setColor(Color.WHITE);
        g.drawString(m.getName(), m.getPos().getX() - m.getSize() / 2, m.getPos().getY() - m.getSize() / 2);
        return g;
    }

    public Graphics paintGasplanet(Gasplanet p, Graphics g) {
        g.setColor(mapOpacity(p.getMaterial().getColor(), p.getDensity()));
        g.fillOval(p.getPos().getX() - p.getSize() / 2, p.getPos().getY() - p.getSize() / 2, p.getSize(), p.getSize());
        g.setColor(Color.WHITE);
        g.drawString(p.getName(), p.getPos().getX() - p.getSize() / 2, p.getPos().getY() - p.getSize() / 2);
        return g;
    }

    public Graphics paintAsteroid(Asteroid a, Graphics g) {
        g.setColor(Color.MAGENTA);
        g.fillOval(a.getPos().getX() - a.getSize() / 2, a.getPos().getY() - a.getSize() / 2, a.getSize(), a.getSize());
        g.drawLine(a.getVector().getStart().getX(), a.getVector().getStart().getY(), a.getVector().getEnd().getX(), a.getVector().getEnd().getY());
        g.setColor(Color.WHITE);
        g.drawString(a.getName(), a.getPos().getX() - a.getSize() / 2, a.getPos().getY() - a.getSize() / 2);
        return g;
    }

    public Graphics paintMoon(Moon m, Graphics g) {
        g.setColor(mapOpacity(Color.WHITE, m.getReflectiveCoefficient()));
        g.fillOval(m.getPos().getX() - m.getSize() / 2, m.getPos().getY() - m.getSize() / 2, m.getSize(), m.getSize());
        g.setColor(Color.WHITE);
        g.drawString(m.getName(), m.getPos().getX() - m.getSize() / 2, m.getPos().getY() - m.getSize() / 2);
        return g;
    }

    public Color mapOpacity(Color c, double opacity) {
        return new Color(c.getRed(), c.getGreen(), c.getBlue(), (int) (opacity * 255));
    }
}

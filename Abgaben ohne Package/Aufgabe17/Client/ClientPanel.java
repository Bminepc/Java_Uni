
import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ClientPanel extends JPanel {
    private ArrayList<Kreissaver> kreise = new ArrayList<>();
    private Lock l = new ReentrantLock();
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        for (int i = 0; i < kreise.size(); i++) {
            g.setColor(kreise.get(i).getColor());
            g.fillOval((int) kreise.get(i).getX(), (int) kreise.get(i).getY(), 10, 10);
        }
    }

    public synchronized void addKreis(double kx, double ky, Color c) {
        l.lock();
        kreise.add(new Kreissaver(kx, ky, c));
        l.unlock();
    }
    public void deleteKreise(){kreise = new ArrayList<Kreissaver>();}
}

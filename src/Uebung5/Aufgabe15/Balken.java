package Uebung5.Aufgabe15;

import javax.swing.*;

public class Balken extends JProgressBar { // TODO Warum haben wir hierfür eine Extraklasse?
    public Balken(int Orientation, int min, int max) {
        super(Orientation, min, max);
    }

    public synchronized void proceed() {
        this.setValue(this.getValue() + 1);
    }

}

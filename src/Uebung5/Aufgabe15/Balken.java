package Uebung5.Aufgabe15;

import javax.swing.*;

public class Balken extends JProgressBar {
public Balken(int Orientation, int min, int max){
    super(Orientation,min,max);
}

public synchronized void proceed(){
    this.setValue(this.getValue() + 1);
}

}

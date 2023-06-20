package Uebung5.Aufgabe15;

import javax.swing.*;

public class Balken extends JProgressBar {
public Balken(int Orientaion, int min, int max){
    super(Orientaion,min,max);
}

public synchronized void procced(){
    this.setValue(this.getValue() + 1);
}

}

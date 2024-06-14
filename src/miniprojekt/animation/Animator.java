package miniprojekt.animation;

import miniprojekt.graphics.Spaceframe;
import miniprojekt.ourList.Listhead;
import miniprojekt.spaceobjects.Spaceobject;

public class Animator extends Thread {

    private Listhead<Spaceobject> spaceobjects;
    private Spaceframe spaceframe;
    private Boolean animate;

    public Animator(Listhead<Spaceobject> spaceobjects, Spaceframe spaceframe){
        this.spaceobjects = spaceobjects;
        this.spaceframe = spaceframe;
        animate = false;
    }

    public void startanimate(){
        animate = true;
    }

    public void stopanimate(){
        animate = false;
    }
    @Override
    public void run() {
        super.run();
        while (true) {
            if (animate) {
                for (int i = 0; i < spaceobjects.length(); i++) {
                    try {
                        spaceobjects.getSpecific(i).advance();
                    } catch (Exception _) {
                    }
                }
                spaceframe.repaint();
                try {
                    sleep(100);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}

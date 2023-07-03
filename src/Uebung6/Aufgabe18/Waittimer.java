package Uebung6.Aufgabe18;

// Useless

public class Waittimer extends Thread implements Runnable{

    private Boolean neustart = true;
    private int timeWaited = 0;
    public void restartTimer(){
        neustart = true;
    }

    public synchronized Boolean hasWaited(){
        if(timeWaited >= 10){
            return true;
        }
        return false;
    }

    @Override
    public void run() {
        while (true) {
            if (neustart) {
                timeWaited = 0;
                neustart = false;
            }
            try {
                this.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            timeWaited++;
            System.out.println(timeWaited);
            if (hasWaited()){

            }
        }
    }
}

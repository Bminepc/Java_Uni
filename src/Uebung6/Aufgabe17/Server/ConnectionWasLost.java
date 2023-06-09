package Uebung6.Aufgabe17.Server;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ConnectionWasLost {

    private int connectionWasLost = 0;
    Lock l;

    public ConnectionWasLost(){
        l = new ReentrantLock();
    }

    public synchronized int getConnectionWasLost(){
        return connectionWasLost;
    }

    public synchronized void ConnectionLost(){
        l.lock();
        connectionWasLost++;
        l.unlock();
        System.out.println(connectionWasLost);
    }
}

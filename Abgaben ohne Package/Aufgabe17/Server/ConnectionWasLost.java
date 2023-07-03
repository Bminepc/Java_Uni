package Uebung6.Aufgabe17.Server;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ConnectionWasLost {

    private int ConnectionWasLost = 0;
    Lock l;

    public ConnectionWasLost(){
        l = new ReentrantLock();
    }

    public synchronized int getConnectionWasLost(){
        return ConnectionWasLost;
    }

    public synchronized void ConnectionLost(){
        l.lock();
        ConnectionWasLost++;
        l.unlock();
    }
}

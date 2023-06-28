package Uebung6.Aufgabe18;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
public class UDPReceiver {
    public static void main(String[] args){
        int receivedPacks = 0;
        try (DatagramSocket ds = new DatagramSocket(Integer.parseInt(args[0])))
        {
            while (true) {
                DatagramPacket pack = new DatagramPacket(new byte[65001], 65001);
                ds.receive(pack);
                byte[] temp = new byte[4];
                for (int i = 0; i < 3; i++) {
                    temp[i] = pack.getData()[i];
                }
                String message = new String(temp);
                System.out.println("Pack " + receivedPacks + ": " + message);
                receivedPacks++;
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

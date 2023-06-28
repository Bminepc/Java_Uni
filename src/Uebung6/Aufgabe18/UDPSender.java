package Uebung6.Aufgabe18;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
public class UDPSender {
    public static void main(String[] args){
        int receivedPacks = 0;
        try (DatagramSocket ds = new DatagramSocket(Integer.parseInt(args[0])))
        {
            while (true) {
                DatagramPacket pack = new DatagramPacket(new byte[65001], 65001);
                ds.receive(pack);
                String message = String.valueOf(pack.getData()[0]) + String.valueOf(pack.getData()[1]) + String.valueOf(pack.getData()[2]);
                System.out.println("Pack " + receivedPacks + ": " + message);
                receivedPacks++;
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

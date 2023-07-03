package Uebung6.Aufgabe18;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketTimeoutException;

public class UDPReceiver {
    public static void main(String[] args){
        int receivedPacks = 0;
        try (DatagramSocket ds = new DatagramSocket(Integer.parseInt(args[0])))
        {
            ds.setSoTimeout(10000);
            while (true) {
                DatagramPacket pack = new DatagramPacket(new byte[65001], 65001);
                ds.receive(pack);
                //erste Zeichen der Nachricht werden in byte-Array überführt
                byte[] messageOhneNummer = new byte[4];
                for (int i = 1; i < 5; i++) {
                    messageOhneNummer[i-1] = pack.getData()[i];
                }
                //byte-Array wird in String umgewandelt
                String message = new String(messageOhneNummer);
                //Packnummer wird in String umgewandelt und angehängt
                message = String.valueOf(pack.getData()[0]) + message;
                //Ausgabe von empfangenem Pack
                System.out.println("Pack " + receivedPacks + ": " + message);
                receivedPacks++;
            }
        } catch (SocketTimeoutException e){
            return;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

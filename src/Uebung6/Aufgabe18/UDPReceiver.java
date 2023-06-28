package Uebung6.Aufgabe18;

import java.io.IOException;
import java.net.*;

import static Uebung6.Aufgabe18.UDPReceiver.createMessage;

public class UDPReceiver {
    public static void createMessage(byte[] list, String i){
        list[0] = Byte.parseByte(i);
        for (int j = 1; j < 65001; j++) {
            list[j] = Byte.parseByte(" ");
        }
    }
    public static void sendPackage(String host, int port, int i) throws SocketException {
        byte[] message = new byte[65001];
        createMessage(message, Integer.toString(i));
        try (DatagramSocket ds = new DatagramSocket())
            {
                InetAddress address = InetAddress.getByName(host);
                DatagramPacket pack = new DatagramPacket(message, message.length, address, port);
                ds.send(pack);
            } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
    public static void main(String[] args) throws SocketException {
        for (int i = 0; i < 100; i++) {
            sendPackage(args[0], Integer.parseInt(args[1]), i);
        }
    }
}

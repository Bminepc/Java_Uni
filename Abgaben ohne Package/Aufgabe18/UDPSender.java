/*************************************************************/
/* Mathis Steinhage, Benjamin Wendt                          */
/* Gruppe: Di10                                              */
/* Uebungsblatt: 6, Aufgabe: 18                              */
/* Thema: java.net, UDP                                      */
/* Datum: 04.07.2023                                         */
/* Status: lauffaehig                                        */
/*************************************************************/
import java.io.IOException;
import java.net.*;

public class UDPSender {
    public static void createMessage(byte[] list, String i){
        //Die Packnummer wird als das erste Zeichen der Nachricht hinzugefügt
        list[0] = Byte.parseByte(i);
        for (int j = 1; j < 65001; j++) {
            //Rest der Nachricht wird mit Leerzeichen gefüllt
            list[j] = (byte) 32;
        }
    }
    public static void sendPackage(String host, int port, int i) {
        //neues Byte-Array wird angelegt
        byte[] message = new byte[65001];
        //erstellte message wird in Byte-Array kopiert und Packnummer wird übergeben
        createMessage(message, Integer.toString(i));
        try (DatagramSocket ds = new DatagramSocket())
            {
                InetAddress address = InetAddress.getByName(host);
                //neues Pack wird erstellt
                DatagramPacket pack = new DatagramPacket(message, message.length, address, port);
                //Pack wird gesendet
                ds.send(pack);
            } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
    public static void main(String[] args) throws SocketException {
        //sende 100 Packs
        for (int i = 0; i < 100; i++) {
            sendPackage(args[0], Integer.parseInt(args[1]), i);
        }
    }
}

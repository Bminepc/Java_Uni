package miniprojekt.network.client;

import miniprojekt.graphics.Spaceframe;

import javax.swing.*;

public class Client {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                Spaceframe sf = new Spaceframe(args[0]);
            }
        });
    }
}

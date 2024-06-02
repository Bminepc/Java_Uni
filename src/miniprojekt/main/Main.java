package miniprojekt.main;

import miniprojekt.ourList.*;

public class Main {

    public static void main(String[] args) {
        Listhead<Integer> L = new Listhead<>(1);
        L.add(2);
        L.add(3);

        System.out.println(L.getCurrent());
        L.advance();
        System.out.println(L.getCurrent());
        L.advance();
        System.out.println(L.getCurrent());
        L.retreat();
        System.out.println(L.getCurrent());

    }

}

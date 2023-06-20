package Uebung5.Aufgabe14;

public class Main {
    public static void main(String[] args){
        BonbonGlas bglas = new BonbonGlas(10000);
        System.out.println(bglas);
        Kind[] kinder = new Kind[10];
        for (int i = 0; i < 10; i++){
            kinder[i] = new Kind(bglas);
            kinder[i].run();
        }
        for (int i = 0; i < 10; i++) {
            try {
                kinder[i].join();
            }catch (InterruptedException e){
                System.out.println("Well that's something");
            }
        }
        System.out.println(bglas);

    }
}

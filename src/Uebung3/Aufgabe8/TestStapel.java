package Uebung3.Aufgabe8;

public class TestStapel {
    public static void main(String[] args){
        System.out.println("Test für Datentyp int:");
        Stapel<Integer> IntStack = new Stapel<>();
        //Testen von Methode leer()
        System.out.println(IntStack.leer());
        //Testen von Methode ablegen()
        IntStack.ablegen(5);
        IntStack.ablegen(19);
        //Testen von Methode entnehmen()
        try{
            IntStack.entnehmen();
        }catch (Exception a) {
            System.out.println(a.getMessage());
        }
        try{
            IntStack.entnehmen();
        }catch (Exception a){
            System.out.println(a.getMessage());
        }
        //Testen der Exception bei Aufruf von entnehmen() bei leerem Stack
        try{
            IntStack.entnehmen();
        }catch (Exception a){
            System.out.println(a.getMessage());
        }

        System.out.println("-----------------------");
        System.out.println("Test für Datentyp char:");
        Stapel<Character> CharStack = new Stapel<>();
        //Testen von Methode leer()
        System.out.println(CharStack.leer());
        //Testen von Methode ablegen()
        CharStack.ablegen('x');
        CharStack.ablegen('?');
        //Testen von Methode entnehmen()
        try{
            CharStack.entnehmen();
        }catch (Exception a) {
            System.out.println(a.getMessage());
        }
        try{
            CharStack.entnehmen();
        }catch (Exception a){
            System.out.println(a.getMessage());
        }
        //Testen der Exception bei Aufruf von Methode entnehmen() bei leeren Stack
        try{
            CharStack.entnehmen();
        }catch (Exception a){
            System.out.println(a.getMessage());
        }
    }
}

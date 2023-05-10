package Uebung3.Aufgabe9;
import java.util.ArrayList;
import java.util.Scanner;
public class Gast {
    private String name;
    private int alter;

    public Gast(String n, int a){
        this.name = n;
        this.alter = a;
    }
    public Gast() {
        this.name = "Max";
        this.alter = 42;
    }
    @Override public String toString(){
        return this.name + " (" + this.alter + ")";
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<Gast> gaesteliste = new ArrayList<>();
        int a;
        System.out.print("Wie lang ist die Liste?");
        a = sc.nextInt();
        for (int i = 0; i < a; i++){
            System.out.print("Alter: ");
            int alter = sc.nextInt();
            System.out.print("Name: ");
            String n = sc.next();
            gaesteliste.add(new Gast(n, alter));
        }
    }
}

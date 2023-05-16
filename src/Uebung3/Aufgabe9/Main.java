package Uebung3.Aufgabe9;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<Gast> gaesteliste = new ArrayList<>();
        int a;
        System.out.print("Wie lang ist die Liste? ");
        a = sc.nextInt();
        for (int i = 0; i < a; i++){
            System.out.print("Alter: ");
            int alter = sc.nextInt();
            System.out.print("Name: ");
            String n = sc.next();
            gaesteliste.add(new Gast(n, alter));
        }
        gaesteliste.removeIf(x -> (x.getAlter() > 12));
        gaesteliste.forEach(x -> {
            System.out.println(x);
        });
    }
}

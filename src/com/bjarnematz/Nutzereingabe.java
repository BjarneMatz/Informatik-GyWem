package com.bjarnematz;
import java.util.Scanner;
public class Nutzereingabe {
    public static void main(String[] args) {
        System.out.println("Es koennen nur Ganzzahlen verrechnet werden!");
        Scanner sc = new Scanner(System.in);
        System.out.print("Wert fuer X: ");
        double x = sc.nextDouble();
        sc.nextLine();
        System.out.print("Wert fuer Y: ");
        double y = sc.nextDouble();
        sc.nextLine();



        double sum = x + y;
        double dif = x - y;
        double pro = x * y;
        double quo = x / y;

        System.out.println("Die Summe von " + x + " und " + y + " ist " + sum + ".");
        System.out.println("Die Differenz von " + x + " und " + y + " ist " + dif + ".");
        System.out.println("Das Produkt von " + x + " und " + y + " ist " + pro + ".");
        System.out.println("Der Quotient von " + x + " und " + y + " ist " + quo + ".");
    }
}

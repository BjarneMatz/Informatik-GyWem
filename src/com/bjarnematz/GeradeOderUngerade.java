package com.bjarnematz;
import java.util.Scanner;
public class GeradeOderUngerade {

    public static void main(String[] args) {
        //Erzeugen eines neuen Scanner Objekts
        Scanner sc = new Scanner(System.in);

        //Deklaration der Variablen
        int usermode = 0;
        int userint = 0;
        int pcint = 0;
        int rest = 0;
        int sum = 0;

        // Modus Abfrage fuer den Spieler
        while (true) {
            System.out.print("Waehle gerade (0) oder ungerade (1)");
            usermode = sc.nextInt();
            sc.nextLine();
            // Wenn Nutzer '0' waehlt, spielt er als gerade
            if (usermode == 0) {
                System.out.println("Du waehlst 'gerade'.");
                break;
                // Wenn Nutzer '1' waehlt, spielt er als ungerade
            } else if (usermode == 1) {
                System.out.println("Du waehlst 'ungerade'.");
                break;
            }
            // Wenn Spieler andere Zahl als 0 oder 1 eingibt: starte Abfrage erneut


        }

        // Spieler Eingabe der Fingerzahl
        while (true) {
            System.out.print("Wie viele Finger zeigst du? (0-5)");
            userint = sc.nextInt();
            sc.nextLine();
            if (userint > 5) {
                System.out.println("Deine Hand hat nur 5 Finger!");
            } else {
                break;
            }
        }
        // Generieren der Zahl fuer den Computer
        pcint = (int) (Math.random() * 6);
        System.out.println("Der Computer waehlt:  " + pcint);

        //Berechnung und Ausgabe
        sum = pcint + userint; // Zusammenzaehlen der Fingerwerte von Computer und Spieler
        rest = sum % 2; // Bestimmung ob gerade oder Ungerade durch Modulo
        System.out.println("Die Summe ist: " + sum);

        // Wenn Rest gleich Spielermodus hat der Spieler gewonnen
        if (rest == usermode) {
            System.out.println("Du hast gewonnen!");
        } else {
            System.out.println("Du hast verloren!");
        }
    }
}
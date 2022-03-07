package com.bjarnematz;

import java.util.Scanner;
public class Zahlenraten {

    public static void main(String[] args) {
        // In der Variablen zufallszahl wird eine zufaellig genrierte Zahl
        // von 0 bis 100 gespeichert.
        //int zufallszahl = (int) (Math.random() * 101);

        /* TODO Hier soll der Nutzer wiederholt nach einer Zahl gefragt werden,
         * bis er die Zufallszahl erraten hat.
         */
        // Erzeugen eines neuen Scanner Objekts
        Scanner sc = new Scanner(System.in);

        //Deklaration der Variablen
        int userin = 0;
        int maxzahl = 0;
        int rand = 0;

        //Config
        maxzahl = 100;

        // Generieren des Zufallswerts
        rand = (int) (Math.random() * maxzahl);

        //System.out.println(rand); // Ausgabe des Zufallswertes (debug)
        while(true){
            System.out.println("Gebe eine Zahl von 0-" + maxzahl + " ein:");
            userin = sc.nextInt();
            sc.nextLine();

            if (userin > maxzahl){
                System.out.println("Deine Eingabe liegt ausserhalb des Wertebereichs! (0-" + maxzahl + ")");
            }
            if (userin == rand){
                System.out.println("Du hast die Zahl erraten!");
                break;
            }
        }

    }
}
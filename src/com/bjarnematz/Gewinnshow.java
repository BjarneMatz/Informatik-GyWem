package com.bjarnematz;
import java.util.Scanner;
public class Gewinnshow {

    public static void main(String[] args) {
        /* In der folgenden Zeile wird die Variable car deklariert und ihr
         * ein zufaelliger Ganzzahl-Wert von 1 bis 3 zugewiesen. Dieser Wert
         * gibt an, hinter welcher Tuer (1, 2 oder 3) sich der Hauptgewinn,
         * das Auto, befindet.
         */
        //int car = 1 + (int) (Math.random() * 3);

        // TODO Frage den Spieler nach der Tuer, die er oeffnen moechte und lies
        //      die Eingabe ein.

        // TODO Teile dem Spieler mit, welchen Preis er gewonnen hat.



        //Initialisierung von Scanner
        Scanner sc = new Scanner(System.in);
        int userin;

        //Config
        String lostprice = "Ziege";
        String winprice = "Auto";
        int mindoor = 1;
        int maxdoor = 3;

        //Deklaration der Gewinner-Tuer
        int car = mindoor + (int) (Math.random() * maxdoor);

        //Eingabe der Tuer-Nummer durch den Spieler
        System.out.println("Willkommen bei der Gewinnshow!");
        System.out.println("Waehle eine Tuer von " + mindoor + " bis " + maxdoor + ".");
        System.out.print("Welche Tuer waehlst du? ");
        userin = sc.nextInt();
        sc.nextLine();
        System.out.println("");

        //Abfrage ob Spieler gewonnen hat und Ausgabe des Gewinnes
        if(userin == car){
            System.out.println("Du hast gewonnen und den Hauptgewinn " + winprice + " erhalten.");
        }else{
            System.out.println("Du hast leider verloren und nur den Trostpreis " + lostprice +  " erhalten :(");
            System.out.println("");
            System.out.println("Die richtige Tuer waere Tuer " + car + " gewesen.");
        }


    }
}

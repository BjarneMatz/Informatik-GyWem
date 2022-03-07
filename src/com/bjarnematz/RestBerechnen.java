package com.bjarnematz;
import java.util.Scanner;
public class RestBerechnen {

    public static void main(String[] args) {
        // Erzeugen eines neuen Scanner Objekts
        Scanner sc = new Scanner(System.in);

        // Deklaration der Variablen
        int x = 0;
        int y = 0;
        int div = 0;
        int rest = 0;

        // Nutzerabfrage fuer x und y
        while(true) {
            System.out.print("Wert fuer x: ");
            x = sc.nextInt();
            sc.nextLine();
            System.out.print("Wert fuer y: ");
            y = sc.nextInt();
            sc.nextLine();

            // Wenn x oder y = 0: Frage Nutzer erneut nach eingabe
            if (x == 0 | y == 0) { // | ist in Java das logische Zeichen fuer ODER
                System.out.println("Wert fuer x oder y darf nicht 0 sein!");

            }else {
                break;
            }
        }
        // Berechnung und Ausgabe
        div = x/y;
        rest = x % y; // Angeabe des Restes durch Modulo
        System.out.println(x + " : " + y + " = " + div + " Rest " + rest);
    }
}
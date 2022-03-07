package com.bjarnematz;
import java.util.Scanner;
public class Schülerdaten {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Wie heisst du? ");
        String name = s.nextLine();

        System.out.print("Wie alt bist du? ");
        int age = s.nextInt();
        s.nextLine();
        System.out.print("Auf welche Schule gehst du? ");
        String school = s.nextLine();
        System.out.print("In welchen Jahrgang gehst du? ");
        int studentclass = s.nextInt();
        s.nextLine();

        System.out.println(name + " ist " + age + " Jahre alt und geht auf der/dem " + school + " in den " + studentclass + " Jahrgang.");

    }
}

package com.bjarnematz;

public class Verzweigungen {

    public static void main(String[] args) {

        System.out.println("Programm A:");
        progA();
        System.out.println("");
        System.out.println("Programm B:");
        progB();
        System.out.println("");
        System.out.println("Programm C:");
        progC();
        System.out.println("");


    }

    public static void progA(){
        int x = 5;

        if(x > 10){
            System.out.println("Hund");
        }else{
            System.out.println("Katze");
        }
    }

    public static void progB(){
        int x = 10;

        if(x == 10){
            System.out.println("Hund");
        }else {
            System.out.println("Katze");
        }
    }

    public static void progC(){
        int x = 3;

        if(x < 10){
            System.out.println("Hund");
        }else if (x < 5){
            System.out.println("Katze");
        }else{
            System.out.println("Maus");
        }
    }
}


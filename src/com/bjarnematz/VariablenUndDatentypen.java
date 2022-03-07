package com.bjarnematz;

public class VariablenUndDatentypen {
    public static void main(String[] args) {
        float x;
        x = 17;
        float y = 4;

        float sum = x + y;
        float diff = x - y;
        float prod = x * y;
        float quot = x / y;
        System.out.println("Die Summe von " + x + " und " + y + " ist " + sum  + ".");
        System.out.println("Die Differenz von " + x + " und " + y + " ist " + diff + ".");
        System.out.println("Das Produkt von " + x + " und " + y + " ist " + prod + ".");
        System.out.println("Die Quotient von " + x + " und " + y + " ist " + quot + ".");
    }
}

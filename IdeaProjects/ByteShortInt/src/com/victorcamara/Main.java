package com.victorcamara;

public class Main {

    public static void main(String[] args) {
        byte baite = 10;
        short xorte = 20;
        int inti = 50;
        long longue = 50000L + 10L * (baite + xorte + inti);

        short shorte = (short)(1000 + 10 * (baite + xorte + inti));

        System.out.println("longue = " + longue);
        System.out.println("shorte = " + shorte);
    }
}

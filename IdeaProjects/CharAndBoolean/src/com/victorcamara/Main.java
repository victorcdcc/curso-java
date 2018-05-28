package com.victorcamara;

public class Main {

    public static void main(String[] args) {
        //width of 16 (2 bytes)
        char myChar = '\u03A9';
        System.out.println("Unicode output was: " + myChar);

        boolean myBoolean = false;
        boolean isMale = true;

        char registered = '\u00AE';
        System.out.println("Registered symbol = " + registered);
    }
}

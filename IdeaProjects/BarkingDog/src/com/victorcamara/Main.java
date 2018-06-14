package com.victorcamara;

public class Main {

    public static void main(String[] args) {
        System.out.println(bark(true, 44));
    }

    public static boolean bark(boolean barking, int hourOfDay) {
        if ((barking && !(hourOfDay >= 8 && hourOfDay < 23)) && (hourOfDay != -1 && hourOfDay <= 23)) {
            return true;
        } else {
            return false;
        }
    }
}

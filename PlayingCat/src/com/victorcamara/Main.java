package com.victorcamara;

public class Main {

    public static void main(String[] args) {
        System.out.println(isCatPlaying(true, 33));
        System.out.println(isCatPlaying(false, 36));
        System.out.println(isCatPlaying(false, 35));
    }

    public static boolean isCatPlaying(boolean summer, int temperature){
        if((temperature >= 25 && temperature <= 35) && !summer){
            return true;
        } else {
            if((temperature >= 25 && temperature <= 45) && summer) {
                return true;
            } else {
                return false;
            }
        }
    }
}

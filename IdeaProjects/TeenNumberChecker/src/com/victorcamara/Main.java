package com.victorcamara;

public class Main {

    public static void main(String[] args) {
        System.out.println(hasTeen(9,99,19));
    }

    public static boolean hasTeen(int i, int j, int k){
        if (i >= 13 && i <= 19){
            return true;
        } else if(j >= 13 && j <= 19){
            return true;
        } else if(k >= 13 && k <= 19){
            return true;
        } else{
            return false;
        }
    }
}

package com.victorcamara;

import java.text.DecimalFormat;
import java.util.Formatter;

public class Main {

    public static void main(String[] args) {
        System.out.println(areEqualByThreeDecimalPlaces(3.1232, -3.1236));
    }

    public static boolean areEqualByThreeDecimalPlaces(double d1, double d2){
        String D1 = Double.toString(d1);
        String D2 = Double.toString(d2);


        while(D1.length() < D2.length()){
            D1 = D1 + "0";
        }

        while(D1.length() > D2.length()){
            D2 = D2 + "0";
        }
        int startPointD1 = 0;
        int startPointD2 = 0;

        for (int x = 0; x < D1.length(); x++){
            if(D1.charAt(x) == '.'){
               startPointD1 = x + 1;
               break;
            }
        }

        for (int y = 0; y < D2.length(); y++){
            if(D2.charAt(y) == '.'){
                startPointD2 = y + 1;
                break;
            }
        }

        if(D1.charAt(0) != D2.charAt(0)){
            return false;
        }

        if(startPointD1 != startPointD2){
            return false;
        }

        int count  = 0;
        for (int i = startPointD1; i < D1.length(); i++){

            if (count == 3){
                return true;
            }

            if(D1.charAt(i) != D2.charAt(i)){
                return false;
            }

            count++;
        }
        return true;
    }

}

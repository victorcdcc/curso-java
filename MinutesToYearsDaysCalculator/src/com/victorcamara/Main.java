package com.victorcamara;

public class Main {

    public static void main(String[] args) {
        printYearsAndDays(525600);
    }

    public static void printYearsAndDays(long minutes){
        long totalMinutes = minutes;
        long days = 0;
        long years = 0;
        if(minutes < 0){
            System.out.println("Invalid Value");
        }else{
            while(minutes >= 1440){
                minutes -= 1440;
                days++;
            }
            while(days >= 365){
                days -= 365;
                years++;
            }
            System.out.println(totalMinutes + " min = " + years + " y and " + days +" d");
        }
    }
}

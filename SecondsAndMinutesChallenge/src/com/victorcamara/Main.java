package com.victorcamara;

public class Main {

    private static final String INVALID_VALUE_MESSAGE = "INVALID VALUE";

    public static void main(String[] args) {
        System.out.println(getDurationString(65, 9));
        System.out.println(getDurationString(3945));
    }

    public static String getDurationString(Integer minutes, Integer seconds){
        Integer hours = 0;
        if(minutes < 0 || (seconds < 0 && seconds > 59)){
            return INVALID_VALUE_MESSAGE;
        } else{
            while(seconds >= 60){
                seconds = seconds - 60;
                minutes++;
            }
            while(minutes >= 60){
                minutes = minutes - 60;
                hours++;
            }
        }
        String hoursWithZero = "";
        String minutesWithZero = "";
        String secondsWithZero = "";

        if(hours < 10){
            hoursWithZero = "0" + hours;
        } else{
            hoursWithZero = hours.toString();
        }
        if(minutes < 10){
            minutesWithZero = "0" + minutes;
        } else{
            minutesWithZero = minutes.toString();
        }
        if(seconds < 10){
            secondsWithZero = "0" + seconds;
        } else{
            secondsWithZero = seconds.toString();
        }

        return hoursWithZero + " hour(s) " + minutesWithZero + " minute(s) " + secondsWithZero + " second(s).";
    }

    public static String getDurationString(Integer seconds){
        Integer minutes = 0;
        if(seconds < 0 && seconds > 59){
            return INVALID_VALUE_MESSAGE;
        } else{
            while(seconds >= 60){
                seconds = seconds - 60;
                minutes++;
            }
        }
        return getDurationString(minutes, seconds);
    }
}

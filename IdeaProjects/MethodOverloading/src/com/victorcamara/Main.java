package com.victorcamara;

public class Main {

    public static void main(String[] args) {

        int newScore = calculateScore("Victor", 500);
        System.out.println("New score is " + newScore);
        calculateScore(100);
        calculateScore();

        calcFeetAndInchesToCentimeters(0, 0);
        calcFeetAndInchesToCentimeters(200);
    }

    public static int calculateScore(String playerName, int score){
        System.out.println("Player name: " + playerName + " scored " + score + " points.");
        return score * 1000;
    }

    public static int calculateScore(int score){
        System.out.println("Unnamed name scored: " + score + " points.");
        return score * 1000;
    }

    public static int calculateScore(){
        System.out.println("No player name, no player score.");
        return 0;
    }

    public static void calcFeetAndInchesToCentimeters(double feet, double inches){
        double oneInchOneCentimeter = 2.54;
        double oneFeetOneCentimeter = 12 * oneInchOneCentimeter;
        if (feet < 0 || (inches < 0 && inches < 12)){
            System.out.println("INVALID FEET OR INCHES PARAMETERS");
        }else{
            while(inches >= 12){
                inches = inches - 12;
                feet++;
            }
            feet = feet * oneFeetOneCentimeter;
            inches = inches * oneInchOneCentimeter;
            System.out.println((feet/oneFeetOneCentimeter) + " feet, " + (inches/oneInchOneCentimeter) + " inches = " + (feet + inches) + " cm.");
        }
    }

    public static void calcFeetAndInchesToCentimeters(double inches){
        double totalFeet;
        double total;
        if (inches < 0){
            System.out.println("INVALID FEET OR INCHES");
        }else{
            totalFeet = inches / 12;
            inches = inches % 12;
            calcFeetAndInchesToCentimeters((int)totalFeet, (int)inches);
        }
    }
}


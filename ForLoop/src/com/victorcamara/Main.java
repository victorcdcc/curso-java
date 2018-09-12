package com.victorcamara;

public class Main {

    public static void main(String[] args) {
        System.out.println("10,000 at 2% of interest = " + calculateInterest(10000.00, 2.0));
        System.out.println("10,000 at 2% of interest = " + calculateInterest(10000.00, 3.0));
        System.out.println("10,000 at 2% of interest = " + calculateInterest(10000.00, 4.0));
        System.out.println("10,000 at 2% of interest = " + calculateInterest(10000.00, 5.0));
        System.out.println();

        for (int i = 2; i < 9; i++){
            System.out.println("10,000 at " + i +"%" + " of interest = " + String.format("%.2f" ,calculateInterest(10000, i)));
        }
        System.out.println();

        for (int i = 9; i >= 2; i--){
            System.out.println("10,000 at " + i +"%" + " of interest = " + String.format("%.2f" ,calculateInterest(10000, i)));
        }

        int chosenNumber = 10;
        int foundNumbers = 0;

        System.out.println();
        for (int i = 0; i < chosenNumber; i++){
            if (isPrime(i)){
                foundNumbers++;
                System.out.println("The number " + i + " is prime!");
            }
            if (foundNumbers == 3){
                break;
            }
        }
    }

    public static double calculateInterest(double amount, double interestRate){
        return(amount * interestRate/100);
    }

    public static boolean isPrime(int n){
        if(n == 1 || n == 0){
            return false;
        }

        for (int i = 2; i <= n/2; i++){
            if(n % i == 0){
                return false;
            }
        }

        return true;
    }
}

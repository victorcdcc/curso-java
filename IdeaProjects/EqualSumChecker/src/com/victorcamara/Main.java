package com.victorcamara;

public class Main {

    public static void main(String[] args) {
        System.out.println(hasEqualSum(1,-1,0));
    }

    public static boolean hasEqualSum(int i, int j, int k){
        int result = i + j;

        if(result == k){
            return true;
        }else{
            return false;
        }
    }
}

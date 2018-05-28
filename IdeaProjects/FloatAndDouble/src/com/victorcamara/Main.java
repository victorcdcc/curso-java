package com.victorcamara;

public class Main {

    public static void main(String[] args) {

        //width of int = 32 (4 bytes)
	    int myIntValue = 5 / 2;
	    //width of float = 32 (4 bytes)
	    float myFloatValue = 5f / 3f;
	    //width of double = 64 (8 bytes)
	    double myDoubleValue = 5d / 3d;

        System.out.println("myIntValue = " + myIntValue);
        System.out.println("myFloatValue = " + myFloatValue);
        System.out.println("myDoubleValue = " + myDoubleValue);

        double pounds = 200d;
        double kilogram = 0.453592237d * pounds;

        System.out.println("Kilogram value for the quantity of pounds set = " + kilogram);
        //90.7185
        double pi = 3.141_592_7d;
;    }
}

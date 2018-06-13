package com.victorcamara;

public class Main {

    public static void main(String[] args) {
        printMegaBytesAndKiloBytes(0);
    }

    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        int x = kiloBytes;
        int y = 0;
        int z = 0;
        if (kiloBytes <= 0){
            System.out.println("Invalid Value");
            return;
        }
        while (kiloBytes > 0) {
            if (kiloBytes >= 1024) {
                y = y + 1;
                kiloBytes = kiloBytes - 1024;
            }
            if (kiloBytes < 1024) {
                z = z + kiloBytes;
                break;
            }
        }
        System.out.println(x + " KB = " + y + " MB and " + z + " KB");
    }
}

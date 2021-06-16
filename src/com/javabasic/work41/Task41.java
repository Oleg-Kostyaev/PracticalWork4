package com.javabasic.work41;

public class Task41 {
    public static void main(String[] args) {
        int x = 10;
        int y = 1000;
        int z = 100;
        int max;
        // var 1
//        if (x >= y) {
//            if (x >= z) {
//                max = x;
//            } else {
//                max = z;
//            }
//        } else if (y >= z) {
//            max = y;
//        } else {
//            max = z;
//        }

        // var 2
//        if (x >= y && x >= z) {
//            max = x;
//        } else if (y >= z && y >= x) {
//            max = y;
//        } else {
//            max = z;
//        }

        // var 3
        max = x;
        if (y > max) {
            max = y;
        }
        if (z > max) {
            max = z;
        }
        System.out.printf("Max = " + max);
    }
}

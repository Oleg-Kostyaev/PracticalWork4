package com.javabasic.work45;

public class Task45 {
    public static void main(String[] args) {
        int i = 1;

        System.out.printf("%2s","*|");
        while (i<=9){
            System.out.printf("%4d",i);
            i++;
        }

        System.out.println();
        System.out.println("---------------------------------------");

        i = 1;
        while (i<=9){
            int j = 1;
            System.out.printf("%2s",i+"|");
            while (j<=9){
                System.out.printf("%4d", j*i );
                j++;
            }
            System.out.println();
            i++;
        }
    }
}

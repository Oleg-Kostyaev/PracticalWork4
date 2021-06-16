package com.javabasic.work43;

public class Task43 {
    public static void main(String[] args) {
        int i = 1;
        int j = i;
        while (i<=8){
            while (j>0) {
                System.out.print(j+" ");
                j--;
            }
            System.out.println();
            i++;
            j = i;
        }
    }
}

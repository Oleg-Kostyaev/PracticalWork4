package com.javabasic.work46;

import java.util.Scanner;

public class Task46 {
    public static void main(String[] args) {
        System.out.println("Введите целое число:");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int sumSquaresDigits = 0;
        int digit;
        while (number>0){
            digit = number%10;
            number = number / 10;
            sumSquaresDigits = sumSquaresDigits + digit*digit;
        }
        System.out.print("Cумма квадратов цифр введенного числа: ");
        System.out.println(sumSquaresDigits);
    }
}

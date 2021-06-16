package com.javabasic.work46;

import java.util.Scanner;

public class Task46 {
    public static void main(String[] args) {
        System.out.println("Введите целое число:");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        number = number < 0 ? -number : number;

        int sumSquaresDigits = 0;
        while (number>0){
            int digit = number%10;
            number /= 10;
            sumSquaresDigits += digit*digit;
        }
        System.out.print("Cумма квадратов цифр введенного числа: ");
        System.out.println(sumSquaresDigits);
    }
}

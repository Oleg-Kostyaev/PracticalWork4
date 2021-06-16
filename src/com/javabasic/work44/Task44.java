package com.javabasic.work44;

public class Task44 {
    public static void main(String[] args) {
        final int NUMBER_1=3;
        final int NUMBER_2=4;
        final int START_RANGE=1;
        final int END_RANGE=300;
        final int MAX_COUNT_RESULT_NUMBER=8;

        int j = 0;
        int i = START_RANGE;
        System.out.println("List["+MAX_COUNT_RESULT_NUMBER+"]: multiples of "+NUMBER_1+" or multiples of "+NUMBER_2+" in range between "+START_RANGE+" and "+END_RANGE);
        while (i<=END_RANGE) {
         if ((i % NUMBER_1 == 0) || (i % NUMBER_2 == 0)) {
             j++;
             System.out.println("List["+j+"]="+i);
         }
         if (j == MAX_COUNT_RESULT_NUMBER) {
             System.out.println("==The END==");
             break;
         }
         i++;
        }
    }
}

package com.practice.collections;

import java.util.Arrays;

public class ArrayDemo {


    public static void main(String[] args) {

        int[] numbers = new int[3];
        int[] numbers1 = {22, 12, 34, 55, 5};
        numbers[2] = 51;
        numbers[0] = 23;
        numbers[1] = 66;
        //numbers[3]=21; exception
        System.out.println("numbers in array2 are" + Arrays.toString(numbers));
        System.out.println("numbers in array1 are" + Arrays.toString(numbers1));
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("numbers are " + numbers[i]);
        }
    }
}
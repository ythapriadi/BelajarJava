package com.tutorial;

import java.util.Arrays;

public class sorting {
    public static void main(String[] args) {

        int [] array1 = {1,9,3,9,5,7,6,8,2,4};

        Arrays.sort(array1);
        printArray(array1);

    }

    private static void printArray (int [] dataArray){
        System.out.println(Arrays.toString(dataArray));
    }
}

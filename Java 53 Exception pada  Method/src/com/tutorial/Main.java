package com.tutorial;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int[] arrayData = {0,1,2,3,4,5};
        Scanner userInput = new Scanner(System.in);
        System.out.print("Data Ke - " );
        int indexInput = userInput.nextInt();

        //Exception biasa
        System.out.println("Exception Biasa");
        try {
            System.out.printf("Data dari array ke - %d adalah %d \n",indexInput, arrayData[indexInput]);
        }catch (Exception e){
            System.err.println(e);
        }

        //Exception didalam fungsi
        System.out.println("\nException didalam fungsi");
        int data = ambildataDariArray(arrayData, indexInput);
        System.out.printf("Data dari array ke - %d adalah %d \n",indexInput, data);

        //Exception throw by method
        System.out.println("\nException throw by method");
        int data2 = 0;
        try {
            data2 = ambilData(arrayData, indexInput);
        }catch (Exception e){
            System.err.println(e);
        }
        System.out.printf("Data dari array ke - %d adalah %d \n",indexInput, data2);

        System.out.println("\nAkhir dari Program");
    }

    private static int ambilData (int[] array, int index) throws Exception{
        int hasil = array [index];
        return hasil;
    }

    private static int ambildataDariArray (int [] array, int index){
        int hasil = 0;
        try {
           hasil = array[index];
        }catch (Exception e){
            System.err.println(e);
        }
        return hasil;
    }

}

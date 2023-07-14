package com.tutorial;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int[] array = {0,1,2,3};
        Scanner userInput = new Scanner(System.in);
        FileInputStream fileInput = null;
        System.out.print("Nilai array ke berapa : ");;
        int index = userInput.nextInt();

        //exception Handling
        //Try, catch, Finally
        System.out.println("Handling out of bound");
        try {
            System.out.printf("index ke - %d adalah %d \n", index,array[index]);
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }

        //runtime error jika file tidak ada
        System.out.println("Handling IO not found");
        try {
            fileInput = new FileInputStream("input.txt");
        } catch (IOException e){
            System.err.println(e);
        }

        //menggabungkan 2 exception
        System.out.println("Menggabungkan dua buah exception");
        try {
            System.out.printf("index ke - %d adalah %d \n", index,array[index]);
            fileInput = new FileInputStream("input.txt");
        }catch (ArrayIndexOutOfBoundsException e){
            System.err.println("Index yang anda masukkan tidak sesuai dengan jumlah array");
        }catch (IOException e){
            System.err.println("File tidak ditemukan");
        }

        //Finally
        System.out.println("Menambahkan Finally");
        try {
            System.out.printf("index ke - %d adalah %d \n", index,array[index]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.err.println("Index yang anda masukkan tidak sesuai dengan jumlah array");
        }finally {
            System.out.println("Finally \n");
        }

        System.out.println("Akhir dari Program");


    }
}

package com.tutorial;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int [] arrayAngka1 = {1, 2, 3, 4, 5};


        //Merubah Array menjadi String
        System.out.println("\nmerubah array menjadi string\n =============");
        printArray(arrayAngka1);

        //Mengcopy Array
        System.out.println("\nMengcopy Array \n =============");
        int[] arrayAngka2 = new int[5];

        printArray(arrayAngka1);
        printArray(arrayAngka2);

        System.out.println("\nMengcopy dengan loop");
        for (int i = 0; i < arrayAngka1.length; i++){
            arrayAngka2[i] = arrayAngka1[i];
        }

        printArray(arrayAngka1);
        System.out.println(arrayAngka1);
        printArray(arrayAngka2);
        System.out.println(arrayAngka2);

        System.out.println("\nMengcopy dengan CopyOf");
        int[] arrayAngka3 = Arrays.copyOf(arrayAngka1, 5);
        printArray(arrayAngka1);
        System.out.println(arrayAngka1);
        printArray(arrayAngka3);
        System.out.println(arrayAngka3);

        System.out.println("\n Mengcopy dengan copyOfRange");
        int[] arrayAngka4 = Arrays.copyOfRange(arrayAngka1, 3,5);
        printArray(arrayAngka1);
        System.out.println(arrayAngka1);
        printArray(arrayAngka4);
        System.out.println(arrayAngka4);

        System.out.println("\n Fill Array\n ==========================");
        int[] arrayAngka5 = new int [10];
        printArray(arrayAngka5);
        Arrays.fill(arrayAngka5,5);
        printArray(arrayAngka5);

        //Komparasi Array
        System.out.println("\nKomparasi Array\n=======================");
        int [] arrayAngka6 = {1,2,3,4,9};
        int [] arrayAngka7 = {1,2,3,4,5};

        System.out.println("\nmembandingkan antara dua buah array");
        System.out.println(Arrays.equals(arrayAngka6,arrayAngka7));

        if (Arrays.equals(arrayAngka6,arrayAngka7)){
            System.out.println("Angka ini sama");
        }else {
            System.out.println("Array ini beda");
        }

        System.out.println("\nmengecek mana array yang lebih besar");
        System.out.println(Arrays.compare(arrayAngka6,arrayAngka7));

        System.out.println("\nMengecek mana index yang berbeda");
        System.out.println(Arrays.mismatch(arrayAngka6, arrayAngka7));


        //sort Array
        System.out.println("\n Sort Array\n ======================");
        int [] arrayAngka8 = {1,4,6,7,8,9};
        Arrays.sort(arrayAngka8);
        printArray(arrayAngka8);

        //Search Array
        System.out.println("\nSearch Array\n ================================");
        int angka = 4;
        int posisi = Arrays.binarySearch(arrayAngka8, angka);
        System.out.println("Angka = " + angka + " ada di index" + posisi);



    }

    private static void printArray (int[] dataArray){
        System.out.println("Array  = " + Arrays.toString(dataArray));
    }
}

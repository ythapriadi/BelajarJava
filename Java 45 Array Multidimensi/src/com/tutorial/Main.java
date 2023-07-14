package com.tutorial;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        System.out.println("Belajar Array Multidimensi");

        //cara membuat array dua dimensi

        int [][] array_2D = {
                {1,2},
                {3,4}
        };

        printArray2D(array_2D);

        //cara membuat array 2d dengan deklarasi
                            /*Int [baris][kolom]*/
        int [][] arrayAngka = new int [5] [4];
        printArray2D(arrayAngka);

//        //looping lengkap secara manual
//       for (int i = 0; i < arrayAngka.length;i++){
//           System.out.print("[");
//           for (int j = 0 ; j < arrayAngka[i].length;j++){
//               System.out.print(arrayAngka[i][j] + " , ");
//           }
//           System.out.print("]\n");
//       }

        //Looping foreach
//        for (int[] baris: dataArray) {
//            System.out.print("[");
//            for (int angka : baris){
//                System.out.print(angka + ",");
//            }
//            System.out.print("]\n");
//        }

        //array secara manual untuk pembuktian
        int[][] array_2D_d = {
                {1,2,3,4,5},
                {6,7,8,9,10},
                {11,12,13,14,15}
        };

        printArray2D(array_2D_d);

        int [][] array_ranged = {
                {1,2,3},
                {4,5,6,7},
                {8}
        };

        printArray2D(array_ranged);
    }

    private static void printArray2D (int [][] dataArray){
        for (int[] baris: dataArray) {
            System.out.print("[");
            for (int angka : baris){
                System.out.print(angka + ",");
            }
            System.out.print("]\n");
        }
//        for (int i = 0; i < dataArray.length;i++){
//            System.out.println(Arrays.toString(dataArray[i]));
//        }
    }
}

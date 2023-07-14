package com.tutorial;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int [] arrayAngka  = {11,12,13,14,15,16,17,18,19,20};

        //Looping Standar
        System.out.println("looping Standar");
        for (int i = 0; i < 10; i++){
            System.out.println("Index ke - " + i + "  adalah = " + arrayAngka[i]);
        }

        //Looping dengan properti dari array
        System.out.println("Looping dengan properti lenght");
        for (int i = 0; i < arrayAngka.length; i++){
            System.out.println("Index ke - " + i + " adalah  = " + arrayAngka[i]);
        }

        //Looping Khususon untuk collection <- array
        System.out.println("Looping for each");
        for (int angka: arrayAngka){
            System.out.println("Angka pada looping ini " + angka);
        }
    }
}

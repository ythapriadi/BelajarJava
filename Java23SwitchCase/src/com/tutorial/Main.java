package com.tutorial;

import java.util.Scanner;

public class Main {
    public static void main (String [] args){

        //Switch Case



        String input;

        Scanner inputUser = new Scanner(System.in);

        System.out.print("Panggil nama : ");
        input = inputUser.next();


        // Ekspresinya berupa satuan (int, long, byte, short), String, atau enum
        switch (input){
            case "otong":
                System.out.println("Saya otong dan Hadir nih gaiss");
                break;
            case "ucup":
                System.out.println("saya ucup dan hadir gaiss");
                break;
            case "mario":
                System.out.println("saya mario dan hadir gaiss");
                break;
            default:
                System.out.println(input + " tidak hadir");
        }

        System.out.println("Selesai program");
    }
}

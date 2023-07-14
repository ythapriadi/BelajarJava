package com.tutorial;

public class Main {
    public static void main (String[] args){

//        while () {
//            aksi
//        }

        int a = 0;
        boolean kondisi = true;

        System.out.println("awal Program");

        while (kondisi) {
            System.out.println("While Loop ke - " + a);
            a++;
           if (a == 10){
               kondisi = false;
           }
        }
        System.out.println("Akhir program");
    }
}

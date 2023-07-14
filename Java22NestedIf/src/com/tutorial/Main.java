package com.tutorial;

public class Main {
    public static void main (String [] args){

        //Nested Iff atau If Bersarang
        int a = 5;
        int b = 10;

        System.out.println(" Ini adalah awal program");

        if (a == 5){
            if (b == 10){
                System.out.println("Ini adalah aksi dimana a= 5 dan b = 10");
            }else{
                System.out.println("ini adalah default 1, dimana a = 5 dan b bukan 10");
            }
        }else{
            System.out.println("ini adakah aksi default dimana a dan b salah");
        }

        System.out.println("Ini adalah akhir dari Program");
    }
}

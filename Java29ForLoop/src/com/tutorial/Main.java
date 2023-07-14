package com.tutorial;

public class Main {

    public static void main(String[] args) {

//        for (Inisialisasi;Kondisi;Step nilai){
//            aksi;
//        }

        System.out.println("----Awal program----");

        System.out.println("Loop Pertama");

        for (int nilai = 0; nilai <= 10; nilai++){

            System.out.println("For Loop Ke - " + nilai);

        }

        System.out.println("----Loop Kedua----");

        for (int nilai = 0; nilai < 10; nilai++){

            System.out.println("For Loop Ke - " + nilai);

        }

        System.out.println("----Loop Ketiga----");

        for (int nilai = 10; nilai >= 0; nilai--){

            System.out.println("For Loop Ke - " + nilai);

        }

        System.out.println("----Loop Keempat----");

        int nilai = 0;
        
        for (;nilai < 10; nilai++){

            System.out.println("For Loop Ke - " + nilai);

        }

        System.out.println("Ini adalah akhir program");

    }
}

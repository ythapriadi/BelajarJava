package com.tutorial;

public class Latihan {
    public static void main (String [] args ){
        // uji coba nested if

        int a = 5;
        int b = 7;
        int c = 2;
        System.out.println("ini adalah Awal dari program");

        if (a == 4){
            System.out.println("ini adalah aksi 1 dimana a = 5 =b =7 c= 2 ");
        }else if (b == 5){
            System.out.println("ini adlah aksi 2 default dimana a bukan 5 b = 7 c= 2");
        }else{
            if (c == 0){
                System.out.println("ini adalah aksi 3 dimana  a bukan 5 b bukan 7 c = 2");
            }else{
                System.out.println("ini adalah aksi 4 dimana  a bukan 5 b bukan 7 c bukan 2");
            }
        }
        System.out.println("ini adalah Akhir dari program");
    }
}

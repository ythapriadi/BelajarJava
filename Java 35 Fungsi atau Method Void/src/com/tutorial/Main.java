package com.tutorial;

public class Main {

    public static void main(String[] args) {
        //Void adalah HAMPA
        System.out.println(simple());

        fungsivoid("apa pun");
        selamatPagi("emak");
        selamatPagi("abah");


    }

    private static void selamatPagi (String nama){
        System.out.println("Selamat Pagi " + nama);
    }


    //Fungsi ayau methode tanpa kembalian
    private static void fungsivoid(String input){
         System.out.println(input);
    }

    //Fungsi atau Methode dengan kembalian
    //sehingga menggunakan return utnuk
    //mengembalikan nilainya (10.f)
    private static float simple (){
        return 10.f;
    }

}

package com.tutorial;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        //membuat string
        String kataString = "Hallo";
        char[] kataChar = {'h','a','l','l','o'};

        //menampilkan String
        System.out.println(kataString);
        System.out.println(Arrays.toString(kataChar));

        //mengakses komponen string
        System.out.println("Komponen pertama dari char[] = " + kataChar[0]);
        System.out.println("Komponen pertama dari string adalah = " + kataString.charAt(3));

        //merubah komponen dari string tidak bisa
        //karena di java itu immutable
        kataChar[0] = 'c';
        System.out.println(Arrays.toString(kataChar));

        //kataString[0] = "c" <------ tidak bisa
        //kataString.charAt(0) = "c"; <------ tidak bisa

        //Kita bisa merubah komponen secara tidak langsung

        printAddress("kataString", kataString);

        kataString = "c" + kataString.substring(1,5);
        System.out.println(kataString);

        printAddress("kataString", kataString);

        String str_1 = "test";
        String str_2 = "hallo";
        String str_3 = "testing";

        printAddress("str_1", str_1);
        printAddress("str_2", str_2);
        printAddress("str_3", str_3);

        str_3 = str_3.substring(0,4);
        printAddress("str_3", str_3);

        String str_4 = "callo";
        printAddress("str_4", str_4);

        kataString = "callo";
        printAddress("kataString", kataString);

        //1. string di java Immutable
        //w. String yang berda di Stringpool itu akan reusable, memorinya efisien
        //3. membuat string dengan method baru, maka dia akan di tempatkan di memori lain
        //bukan di memory pool

        //lebih dalam
        String a = new String("hallo");
        printAddress("a",a);
    }

    private static void printAddress(String nama , String data){
        int address = System.identityHashCode(data);
        System.out.println(nama + "=" + data +"\t || address = " + Integer.toHexString(address));
    }
}

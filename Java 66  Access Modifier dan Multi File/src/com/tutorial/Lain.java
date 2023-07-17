package com.tutorial;

public class Lain {
    //Bagian ini dapat diakses oleh siapapun
    public static void methodPublic(){
        System.out.println("Access modifier : Lain.Public");
    }

    //Ini hanya dapat diakses oleh class yang bersangkutan
    private static void methodPrivate(){
        System.out.println("Access modifier : Private");
    }

    //ini hanya dapat diakses oleh class dalam package yang sama
    static void methodDefault(){
        System.out.println("Access modifier : Lain.Default");
    }

    //ini hanya dapa diakses oleh class dalam package yang sama dan subsclassnya
    protected static void methodProtected(){
        System.out.println("Access modifier : Lain.Protected");
    }
}

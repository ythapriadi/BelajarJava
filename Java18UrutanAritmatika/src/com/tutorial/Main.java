package com.tutorial;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Kesimpulan adalah
        //Perkalian atau Pembagian akan dilakukan terlebih dahulu

        int hasil = 10 / 2 * 5;
        System.out.println(hasil);
        hasil = 5 + 2 - 10;
        System.out.println(hasil);

        //Menggunakan Pengelompokan operasi dengan ()
        hasil = 60 / (2 + 10);
        System.out.println(hasil);

        Scanner userInput = new Scanner(System.in);
        //perhitungan persamaan kuadrat
        System.out.println("menghitung persamaan kuadrat");
        int m,x,c;

        System.out.print("Nilai x = ");
        x= userInput.nextInt();
        System.out.print("Nilai m = ");
        m = userInput.nextInt();
        System.out.print("Nilai c = ");
        c= userInput.nextInt();

        int y = m*x*x + c;
        System.out.println("Nilai y = " + y);
    }
}

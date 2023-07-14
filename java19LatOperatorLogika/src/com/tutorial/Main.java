package com.tutorial;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        //Membuat Sebuah objek untuk menangkap input dari user
        Scanner inputUser = new Scanner(System.in);

        //Sebuah program sederhana untuk menebak angka
        int nilaiBenar = 6;
        int nilaiTebakan;
        boolean statusTebakan;

        System.out.print("Masukkan Nilai tebakan anda : ");
        nilaiTebakan = inputUser.nextInt();
        System.out.println("Nilai tebakan anda adalah : " + nilaiTebakan);

        //Operasi logika Tebakan
        statusTebakan = (nilaiTebakan == nilaiBenar);
        System.out.println("Tebakan anda : " + statusTebakan);

        //Operasi Aljabar Boolean (AND / OR)
        System.out.print("Masukan nilai antara 4 dan 9 : ");
        nilaiTebakan = inputUser.nextInt();
        System.out.println("Nilai Tebakan anda adalah : " + nilaiTebakan);

        statusTebakan = (nilaiTebakan > 4) && (nilaiTebakan < 9);
        System.out.println("tebakan anda : " + statusTebakan);

    }
}

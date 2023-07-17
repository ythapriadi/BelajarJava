package com.tutorial;

import java.io.*;
import java.time.Year;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;
import java.util.StringTokenizer;


public class Main {

    public static void main(String[] args) throws IOException {

        Scanner terminalInput = new Scanner(System.in);
        String pilihanUser;
        boolean istLanjutkan = true;

        while (istLanjutkan) {

            clearScreen();

            System.out.println("database Perpustakaan\n");
            System.out.println("1.\tLihat Seluruh Buku");
            System.out.println("2.\tCari Data buku");
            System.out.println("3.\tTambah Data Buku");
            System.out.println("4.\tUbah Data Buku");
            System.out.println("5.\tHapus Data Buku");

            System.out.print("\n\nPilihan Anda : ");
            pilihanUser = terminalInput.next();

            switch (pilihanUser) {
                case "1":
                    System.out.println("\n===================");
                    System.out.println("LIST SELURUH BUKU");
                    System.out.println("===================");
                    tampilkanData(); //Tampilkan data
                    break;
                case "2":
                    System.out.println("\n===================");
                    System.out.println("CARI DATA BUKU"); //Cari Data
                    System.out.println("===================");
                    cariData();
                    break;
                case "3":
                    System.out.println("\n===================");
                    System.out.println("TAMBAH DATA BUKU");
                    System.out.println("===================");
                    tambahData();
                    tampilkanData();
                    break;
                case "4":
                    System.out.println("\n===================");
                    System.out.println("UBAH DATA BUKU");
                    System.out.println("===================");
                    updateData();
                    break;
                case "5":
                    System.out.println("\n===================");
                    System.out.println("HAPUS DATA BUKU");
                    System.out.println("===================");
                    deleteData();
                    break;
                default:
                    System.err.println("\nInput anda tidak ditemukan\nSilahkan pilih (1-5)");
            }

            istLanjutkan = getYesorNo("Apakah anda ingin melanjutkan ?");

        }
    }





}

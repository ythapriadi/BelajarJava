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

    private static void updateData () throws IOException{
//        Mengambil database original
        File database = new File("database.txt");
        FileReader fileInput = new FileReader(database);
        BufferedReader bufferedInput = new BufferedReader(fileInput);

//        Buat database Sementara
        File tempDB = new File("tempDB.txt");
        FileWriter fileOutput = new FileWriter(tempDB);
        BufferedWriter bufferedOutput = new BufferedWriter(fileOutput);

//        tampilkan data
        System.out.println("List Buku");
        tampilkanData();

//        mengambil user input / pilihan data
        Scanner terminalInput = new Scanner(System.in);
        System.out.println("\nMasukkan no buku yang akan di update");
        int updateNum = terminalInput.nextInt();

//        tampilkan yang data yang inin di update
    }

    private static void deleteData() throws  IOException{
        // kita ambil database original
        File database = new File("database.txt");
        FileReader fileInput = new FileReader(database);
        BufferedReader bufferedInput = new BufferedReader(fileInput);

        // kita buat database sementara
        File tempDB = new File("tempDB.txt");
        FileWriter fileOutput = new FileWriter(tempDB);
        BufferedWriter bufferedOutput = new BufferedWriter(fileOutput);

        // tampilkan data
        System.out.println("List Buku");
        tampilkanData();

        // kita ambil user input untuk mendelete data
        Scanner terminalInput = new Scanner(System.in);
        System.out.print("\nMasukan nomor buku yang akan dihapus: ");
        int deleteNum = terminalInput.nextInt();

        // looping untuk membaca tiap data baris dan skip data yang akan didelete

        boolean isFound = false;
        int entryCounts = 0;

        String data = bufferedInput.readLine();

        while (data != null){
            entryCounts++;
            boolean isDelete = false;

            StringTokenizer st = new StringTokenizer(data,",");

            // tampilkan data yang ingin di hapus
            if (deleteNum == entryCounts){
                System.out.println("\nData yang ingin anda hapus adalah:");
                System.out.println("-----------------------------------");
                System.out.println("Referensi       : " + st.nextToken());
                System.out.println("Tahun           : " + st.nextToken());
                System.out.println("Penulis         : " + st.nextToken());
                System.out.println("Penerbit        : " + st.nextToken());
                System.out.println("Judul           : " + st.nextToken());

                isDelete = getYesorNo("Apakah anda yakin akan menghapus?");
                isFound = true;
            }

            if(isDelete){
                //skip pindahkan data dari original ke sementara
                System.out.println("Data berhasil dihapus");
            } else {
                // kita pindahkan data dari original ke sementara
                bufferedOutput.write(data);
                bufferedOutput.newLine();
            }
            data = bufferedInput.readLine();
        }

        if(!isFound){
            System.err.println("Buku tidak ditemukan");
        }

        // menulis data ke file
        bufferedOutput.flush();
        // delete original file
        fileOutput.close();
        bufferedInput.close();
        fileInput.close();
        System.gc();
        database.delete();
        // rename file sementara ke database
        tempDB.renameTo(database);
    }

    private static void tampilkanData() throws IOException{
        FileReader fileInput;
        BufferedReader bufferedInput;

        try {
            fileInput = new FileReader("database.txt");
            bufferedInput = new BufferedReader(fileInput);
        }catch (Exception e){
            System.err.println("Database tidak ditemukan");
            System.err.println("Silahkan tambah data terlebih dahulu");
            tambahData();
            return;
        }

        System.out.print("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("\n| No  |\tTahun|\tPenulis               |\tPenerbit              |\tJudul Buku   ");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        String data = bufferedInput.readLine();
        int nomorData = 0;
        while (data != null) {
            nomorData++;

            StringTokenizer stringToken = new StringTokenizer(data, ",");
            stringToken.nextToken();
            System.out.printf("|%2d   ", nomorData);
            System.out.printf("|\t%4s ", stringToken.nextToken());
            System.out.printf("|\t%-20s  ", stringToken.nextToken());
            System.out.printf("|\t%-20s  ", stringToken.nextToken());
            System.out.printf("|\t%s  ", stringToken.nextToken());
            System.out.print("\n");

            data = bufferedInput.readLine();
        }
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

    }

    private static void cariData () throws IOException{

//        Membaca adtabase
        try {
            File file = new File("database.txt");
        }catch (Exception e){
            System.err.println("Database tidak ditemukan");
            System.err.println("Silahkan tambah data terlebih dahulu");
            tambahData();
            return;
        }
//        Kita Ambil Keyword dari user

        Scanner terminalInput = new Scanner(System.in);
        System.out.print("Masukkan Kata Kunci untuk mencari buku : ");
        String cariString = terminalInput.nextLine();
        System.out.println(cariString);

        String[] keywords = cariString.split("\\s+");

//        Kita Cek keyword di database
        cekBukuDiDatabase(keywords,true);
    }

    private static void tambahData() throws IOException{

        FileWriter fileOutput = new FileWriter("database.txt",true);
        BufferedWriter bufferedOutput = new BufferedWriter(fileOutput);

        //mengambil input dari user
        Scanner terminalInput = new Scanner(System.in);
        String penulis, judul, penerbit, tahun;

        System.out.print("Masukkan Nama Penulis : ");
        penulis = terminalInput.nextLine();
        System.out.print("Masukkan Judul Buku : ");
        judul= terminalInput.nextLine();
        System.out.print("Masukkan Nama Penerbit : ");
        penerbit = terminalInput.nextLine();
        System.out.print("Masukkan Tahun terbit, format = (YYYY) :  ");
        tahun = ambilTahun();

        //cek buku di database
        String[] keywords = {tahun + ","+ penulis + "," + penerbit + "," + judul};
        System.out.println(Arrays.toString(keywords));

        boolean isExist = cekBukuDiDatabase(keywords, false);

        //Menulis buku di database
        if (!isExist){
            //fiersabesari_2012_1,2012,fiersa besari,media kita,jejak langkah
            System.out.println(ambilEntryPertahun(penulis, tahun));
            long nomorEntry = ambilEntryPertahun(penulis, tahun) + 1;

            String penulisTanpaSpasi =  penulis.replaceAll("\\s+","");
            String primaryKey = penulisTanpaSpasi + "_" + tahun + "_" + nomorEntry;
            System.out.println("\nData yang akan anda masukan adalah : ");
            System.out.println("----------------------------------------");
            System.out.println("Primary Key   : " + primaryKey);
            System.out.println("Tahun terbit  : " + tahun);
            System.out.println("Penulis       : " + penulis);
            System.out.println("Judul         : " + judul);
            System.out.println("Penerbit      : " + penerbit);

            boolean isTambah = getYesorNo("Apakah anda ingin menambahkan data tersebut ?");
            if (isTambah){
                bufferedOutput.write(primaryKey + "," + tahun + "," + penulis + "," + penerbit + "," + judul + ",");
                bufferedOutput.newLine();
                bufferedOutput.flush();
            }
        } else {
            System.out.println("Buku yang anda akan masukan sudah tersedia di database dengan data berikut");
            cekBukuDiDatabase(keywords, true);
        }

        bufferedOutput.close();
    }

    private static long ambilEntryPertahun(String penulis, String tahun) throws IOException{
        FileReader fileInput = new FileReader("database.txt");
        BufferedReader bufferedInput = new BufferedReader(fileInput);

        long entry = 0;
        String data = bufferedInput.readLine();
        Scanner dataScanner;
        String primaryKey;

        while (data != null){
            dataScanner = new Scanner(data);
            dataScanner.useDelimiter(",");
            primaryKey = dataScanner.next();
            dataScanner = new Scanner(primaryKey);
            dataScanner.useDelimiter("_");

            penulis = penulis.replaceAll("\\s+", "");
            if (penulis.equalsIgnoreCase(dataScanner.next()) && tahun.equalsIgnoreCase(dataScanner.next())) {
                entry = dataScanner.nextInt();
            }

            data = bufferedInput.readLine();
        }
        return entry;
    }

    private static boolean cekBukuDiDatabase(String[] keywords, boolean isDisplay)throws IOException{

        FileReader fileInput = new FileReader("database.txt");
        BufferedReader bufferedInput = new BufferedReader(fileInput);

        String data = bufferedInput.readLine();

        boolean isExist = false;
        int nomorData = 0;
        if (isDisplay){
            System.out.print("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println("\n| No  |\tTahun|\tPenulis               |\tPenerbit              |\tJudul Buku   ");
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        }

        while (data != null) {

//            Cek keyword didalam baris
            isExist = true;
            for (String keyword:keywords){
                isExist = isExist && data.toLowerCase().contains(keyword.toLowerCase());
            }

//            Jika keywordnya cocok maka tampilkan
            if (isExist){
                if (isDisplay){
                    nomorData++;
                    StringTokenizer stringToken = new StringTokenizer(data, ",");
                    stringToken.nextToken();
                    System.out.printf("|%2d   ", nomorData);
                    System.out.printf("|\t%4s ", stringToken.nextToken());
                    System.out.printf("|\t%-20s  ", stringToken.nextToken());
                    System.out.printf("|\t%-20s  ", stringToken.nextToken());
                    System.out.printf("|\t%s  ", stringToken.nextToken());
                    System.out.print("\n");
                }else {
                    break;
                }
            }

            data = bufferedInput.readLine();

        }

        if (isDisplay){
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        }
        return isExist;
    }

    private static String ambilTahun() throws IOException{
        boolean tahunValid = false;
        Scanner terminalInput = new Scanner(System.in);
        String tahunInput = terminalInput.nextLine();
        while (!tahunValid){
            try {
                Year.parse(tahunInput);
                tahunValid = true;
            }catch (Exception e){
                System.out.println("Format tahun yang anda masukkan salah, format = (YYYY)");
                System.out.print("Masukkan tahun terbit lagi : ");
                tahunValid = false;
                tahunInput = terminalInput.nextLine();
            }
        }
        return tahunInput;
    }

    private static boolean getYesorNo (String message){
        Scanner terminalInput = new Scanner(System.in);
        System.out.print("\n" + message + "(y/n) ?");
        String pilihanUser = terminalInput.next();

        while (!pilihanUser.equalsIgnoreCase("y") && !pilihanUser.equalsIgnoreCase("n")){
            System.err.println("Pilihan anda bukan y atau n,");
            System.out.print("\n" + message + "(y/n) ?");
            pilihanUser = terminalInput.next();
        }

        return pilihanUser.equalsIgnoreCase("y");

    }

    private static void clearScreen( ){
        try {
            if (System.getProperty("os.name").contains("Windows")){
                new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();
            }else {
                System.out.print("\033\143");
            }
        }catch (Exception ex){
            System.err.println("Tidak bisa Clear Screen");
        }
    }

}

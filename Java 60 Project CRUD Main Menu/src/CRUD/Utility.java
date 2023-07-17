package CRUD;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.Year;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Utility {

    private static long ambilEntryPertahun(String penulis, String tahun) throws IOException {
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

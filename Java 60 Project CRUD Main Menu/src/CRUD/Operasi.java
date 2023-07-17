package CRUD;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Operasi {

    public static void updateData () throws IOException {
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
        System.out.print("\nMasukkan no buku yang akan di update : ");
        int updateNum = terminalInput.nextInt();

//        tampilkan yang data yang ingin di update
        String data = bufferedInput.readLine();
        int entryCounts = 0;

        while (data != null){
            entryCounts++;

            StringTokenizer st = new StringTokenizer(data, ",");
//            tampilkan entriCounts == updateNum
            if (updateNum == entryCounts){
                System.out.println("\nData yang ingin anda update adalah : ");
                System.out.println("-----------------------------------------");
                System.out.println("Referensi      : " + st.nextToken());
                System.out.println("Tahun          : " + st.nextToken());
                System.out.println("Penulis        : " + st.nextToken());
                System.out.println("Penerbit       : " + st.nextToken());
                System.out.println("Judul          : " + st.nextToken());

                //Update data

                //Mengambil input dari user
                String[] fieldData = {"tahun","penulis","penerbit","judul"};
                String[] tempData = new String[4];

                //refresh token
                st = new StringTokenizer(data, ",");
                String originalData = st.nextToken();

                for (int i = 0; i < fieldData.length ; i++){
                    boolean isUpdate = Utility.getYesorNo("Apakah anda ingin merubah nama " + fieldData[i]);
                    originalData = st.nextToken();
                    if (isUpdate){
                        //user Input

                        if (fieldData[i].equalsIgnoreCase("tahun")){
                            System.out.print("Masukan tahun terbit, format = YYYY : ");
                            tempData[i] = Utility.ambilTahun();
                        }else{
                            terminalInput = new Scanner(System.in);
                            System.out.print("\nMasukkan " + fieldData[i] + " baru : " );
                            tempData[i] = terminalInput.nextLine();

                        }
                    }else {
                        tempData[i] = originalData;
                    }
                }

                //Tampilkan data baru ke layar
                st = new StringTokenizer(data, ",");
                st.nextToken();
                System.out.println("\nData baru anda adalah ");
                System.out.println("-----------------------------------------");
                System.out.println("Tahun          : " + st.nextToken() + " ----> " + tempData[0]);
                System.out.println("Penulis        : " + st.nextToken() + " ----> " + tempData[1]);
                System.out.println("Penerbit       : " + st.nextToken() + " ----> " + tempData[2]);
                System.out.println("Judul          : " + st.nextToken() + " ----> " + tempData[3]);

                boolean isUpdate = Utility.getYesorNo("apakah anda yakin ingin mengupdate data tersebut");

                if (isUpdate){
                    //cek data baru di database
                    boolean isExist = Utility.cekBukuDiDatabase(tempData,true);
                    if (isExist){
                        System.err.println("Data buku sudah ada didatabase, proses update dibatalkan,\nsilahkan delete data yang bersangkutan");
                        // Copy data
                        bufferedOutput.write(data);
                    }else{

                        //Format data baru ke database
                        String tahun = tempData[0];
                        String penulis = tempData[1];
                        String penerbit = tempData[2];
                        String judul = tempData[3];

                        //buat primary key
                        long nomorEntry = Utility.ambilEntryPertahun(penulis, tahun) + 1;

                        String penulisTanpaSpasi =  penulis.replaceAll("\\s+","");
                        String primaryKey = penulisTanpaSpasi + "_" + tahun + "_" + nomorEntry;

                        //tulis data ke database
                        bufferedOutput.write(primaryKey + "," + tahun + "," + penulis + "," + penerbit + "," + judul);
                    }
                }else{
                    bufferedOutput.write(data);
                }
            }else {
                //Copy data
                bufferedOutput.write(data);
            }
            bufferedOutput.newLine();
            data = bufferedInput.readLine();
        }
        //menulis data ke file
        bufferedOutput.flush();
        bufferedOutput.close();
        fileOutput.close();
        bufferedInput.close();
        fileInput.close();

        System.gc();
        //delete original database
        database.delete();
        //rename file tempDB menjadi database
        tempDB.renameTo(database);
    }

    public static void deleteData() throws  IOException{
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

                isDelete = Utility.getYesorNo("Apakah anda yakin akan menghapus?");
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
        bufferedOutput.close();
        fileOutput.close();
        bufferedInput.close();
        fileInput.close();
        System.gc();
        database.delete();
        // rename file sementara ke database
        tempDB.renameTo(database);
    }

    public static void tampilkanData() throws IOException{
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

    public static void cariData () throws IOException{

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
        Utility.cekBukuDiDatabase(keywords,true);
    }

    public static void tambahData() throws IOException{

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
        tahun = Utility.ambilTahun();

        //cek buku di database
        String[] keywords = {tahun + ","+ penulis + "," + penerbit + "," + judul};
        System.out.println(Arrays.toString(keywords));

        boolean isExist = Utility.cekBukuDiDatabase(keywords, false);

        //Menulis buku di database
        if (!isExist){
            //fiersabesari_2012_1,2012,fiersa besari,media kita,jejak langkah
            System.out.println(Utility.ambilEntryPertahun(penulis, tahun));
            long nomorEntry = Utility.ambilEntryPertahun(penulis, tahun) + 1;

            String penulisTanpaSpasi =  penulis.replaceAll("\\s+","");
            String primaryKey = penulisTanpaSpasi + "_" + tahun + "_" + nomorEntry;
            System.out.println("\nData yang akan anda masukan adalah : ");
            System.out.println("----------------------------------------");
            System.out.println("Primary Key   : " + primaryKey);
            System.out.println("Tahun terbit  : " + tahun);
            System.out.println("Penulis       : " + penulis);
            System.out.println("Penerbit      : " + penerbit);
            System.out.println("Judul         : " + judul);

            boolean isTambah = Utility.getYesorNo("Apakah anda ingin menambahkan data tersebut ?");
            if (isTambah){
                bufferedOutput.write(primaryKey + "," + tahun + "," + penulis + "," + penerbit + "," + judul);
                bufferedOutput.newLine();
                bufferedOutput.flush();
            }
        } else {
            System.out.println("Buku yang anda akan masukan sudah tersedia di database dengan data berikut");
            Utility.cekBukuDiDatabase(keywords, true);
        }

        bufferedOutput.close();
    }

}

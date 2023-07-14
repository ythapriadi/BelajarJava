package com.tutorial;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;

public class Main {

    public static void main(String[] args) throws Exception {

        FileInputStream fileInput = null;
        FileOutputStream fileOutput = null;

        //Membuka file
        fileInput = new FileInputStream("input.txt");

        //Membaca file
        int data = fileInput.read();
        while (data != -1){
            System.out.println((char) data);
            data = fileInput.read();
        }

        //menutup file
        fileInput.close();

        //Salah satu scenario program pembukaan file
        try {
            fileInput = new FileInputStream("input2.txt");
            fileOutput = new FileOutputStream("output2.txt");

            //membaca File
            int buffer = fileInput.read();

            while (buffer != -1){
                fileOutput.write(buffer);
                buffer = fileInput.read();
            }

        }finally {
            if (fileInput != null){
                fileInput.close();
            }

            if (fileOutput != null){
                fileInput.close();
            }
        }

        //Contoh terakhir (try with resources)

        try (
                FileInputStream in = new FileInputStream("input.txt");
                FileOutputStream out = new FileOutputStream("output.txt")
        ){
            //membaca file
            int data2 = in.read();
            while (data2 != -1){
                out.write((char) data2);
                data2 = in.read();
            }
        }


//        System.out.println("File input bernilai = " + fileInput);
//
//        fileInput = new FileInputStream("input.txt");
//        System.out.println("File input bernilai = " + fileInput);
//
//        fileInput.close();
//        System.out.println("File input bernilai = " + fileInput);
//
//        fileInput = new FileInputStream("inputw.txt");
//        System.out.println("File input bernilai = " + fileInput);
    }
}

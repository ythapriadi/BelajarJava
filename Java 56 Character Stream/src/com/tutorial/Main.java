package com.tutorial;

import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {

        //Membuka file

        //byte Stream - FileInputStream
        //Character stream - FileReader

        FileInputStream byteFileInput = new FileInputStream("input.txt");
        FileReader      charFileInput = new FileReader("input.txt");

        FileOutputStream byteFileOuput = new FileOutputStream("outputByte.txt");
        FileWriter charFileOutput = new FileWriter("outputChart.txt");

        //Membaca File
        //byte file
        int buffer = byteFileInput.read();
        while (buffer != -1){
            System.out.print((char) buffer);
            byteFileOuput.write(buffer);
            buffer = byteFileInput.read();
        }

        System.out.println("\n");
        //char file
        buffer = charFileInput.read();
        while (buffer != -1){
            System.out.print((char) buffer);
            charFileOutput.write(buffer);
            buffer = charFileInput.read();
        }


        //menutup File
        byteFileInput.close();
        charFileInput.close();
        byteFileOuput.close();
        charFileOutput.close();
    }
}

package com.tutorial;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

       FileReader fileInput = new FileReader("input.txt");
        BufferedReader bufferedReader = new BufferedReader(fileInput);

        Scanner scanner = new Scanner(bufferedReader);

//      .hasNext() untuk cek ada kata selanjutnya atau tidak
        System.out.println(scanner.hasNext()); //true

//      untuk membaca kata, dengan pemisan/delimeter(Spasi)
        System.out.println(scanner.next());
        System.out.println(scanner.next());
        System.out.println(scanner.next());
        System.out.println(scanner.next());

        System.out.println(scanner.hasNext()); //false

//      Menggunakan Delimeter tertentu
        FileReader fileInput2 = new FileReader("input2.txt");
        bufferedReader = new BufferedReader(fileInput2);
        bufferedReader.mark(200);

        scanner = new Scanner(bufferedReader);
        scanner.useDelimiter(",");

        while (scanner.hasNext()){
            System.out.println(scanner.next());
        }

        //menggunakan string tokenizer
        bufferedReader.reset();
        String data = bufferedReader.readLine();
        System.out.println(data);

        StringTokenizer stringToken = new StringTokenizer(data, ",");

        while (stringToken.hasMoreTokens()){
            System.out.println(stringToken.nextToken());
        }

        //baris kedua
        data = bufferedReader.readLine();
        System.out.println(data);

        stringToken  = new StringTokenizer(data, ",");

        while (stringToken.hasMoreTokens()){
            System.out.println(stringToken.nextToken());
        }


    }
}

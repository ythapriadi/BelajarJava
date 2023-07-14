package com.tutorial;

import java.util.Scanner;

public class LoopWhile {

    public static void main (String[] args){
        int f_n, f_n1, f_n2, n;

        Scanner inputuser = new Scanner(System.in);
        System.out.print("Mengambil nilai Fibonacci ke - ");
        n = inputuser.nextInt();

        f_n2 = 0;
        f_n1 = 1;
        f_n = 1;
        int i = 1;

        while (i <= n){
            System.out.println("Nilai ke - " + i + " adalah " + f_n);
            f_n = f_n1 + f_n2;
            f_n2 = f_n1;
            f_n1 = f_n;
            i++;
        }
    }
}

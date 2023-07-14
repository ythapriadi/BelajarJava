package com.tutorial;

import java.util.Scanner;

public class LoopDoWhile {
    public static void main (String[] args){

        int f_n, f_n1, f_n2, n, i;

        Scanner inputuser = new Scanner(System.in);
        System.out.print("Mengambil nilai Fibonacci ke - ");
        n = inputuser.nextInt();

        f_n2 = 0;
        f_n1 = 1;
        f_n = 1;
        i = 1;

        do {
            System.out.println("Nilai ke - " + i + " adalah " + f_n);
            f_n = f_n1 + f_n2;
            f_n2 = f_n1;
            f_n1 = f_n;
            i++;
        }while (i <= n);
    }
}

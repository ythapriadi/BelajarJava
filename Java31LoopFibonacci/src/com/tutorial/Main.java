package com.tutorial;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        //menghitung deret fibonacci
        int f_n, f_n1, f_n2, n;

        Scanner inputuser = new Scanner(System.in);
        System.out.print("Mengambil nilai Fibonacci ke - ");
        n = inputuser.nextInt();

        f_n2 = 0;
        f_n1 = 1;
        f_n = 1;

        for (int i = 1 ; i <= n ; i++){
            System.out.println("Nilai ke - " + i + " adalah " + f_n);
            f_n = f_n1 + f_n2;
            f_n2 = f_n1;
            f_n1 = f_n;
        }
    }
}

package com.tutorial;

public class Main {

    public static void main(String[] args) {
        //Break, Continue, dan Return

        int a = 0;

        while (true){
            a++;

            if (a == 10){
                break;
                // ini adalah Keyword untuk memaksa keluar dari loop
            } else if (a == 5){
                continue;
                // ini adalah keyword untuk memaksa memuali loop/memuali aksi dari awal
            } else if (a == 7){
                return;
            }

            System.out.println("Looping ke - " + a);
        }
        System.out.println("Akhir dari program");
    }
}

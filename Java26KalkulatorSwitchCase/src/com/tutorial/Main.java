package com.tutorial;

import java.util.*;

public class Main {
    public static void main(String [] args){

        Scanner inputUser;
        float a,b,hasil;
        String operator;

        inputUser = new Scanner(System.in);

        System.out.print("Nilai a = ");
        a= inputUser.nextFloat();
        System.out.print("Operator = ");
        operator = inputUser.next();
        System.out.print("Nilai b = ");
        b = inputUser.nextFloat();

        switch (operator){
            case "+":
                //Penjumlahan
                hasil = a + b;
                System.out.println("Hasilnya adalah : " + hasil);
                break;
            case "-":
                //Pengurangan
                hasil = a - b;
                System.out.println("Hasilnya adalah : " + hasil);
                break;
            case "*":
                //Perkalian
                hasil = a * b;
                System.out.println("Hasilnya adalah : " + hasil);
                break;
            case "/":
                //Pembagian
                hasil = a / b;
                System.out.println("Hasilnya adalah : " + hasil);
                break;
            default:
                System.out.println("Operator" + operator + "tidak ditemukan");
        }
    }
}

package com.tutorial;

import java.util.*;

public class Main {
    public static void main (String [] args){

        // a operator b
        Scanner inputUser;
        float a,b,hasil;
        char operator;

        inputUser = new Scanner(System.in);

        System.out.print("Nilai a = ");
        a = inputUser.nextFloat();

        System.out.print("Operator = ");
        operator = inputUser.next().charAt(0);

        System.out.print("Nilai b = ");
        b = inputUser.nextFloat();

        System.out.println("Input User : " + a + " " + operator + " " + b);

        //Operator Tersedia
        if (operator == '+'){
            hasil = a + b;
            System.out.println("Hasil = " + hasil);
        }else  if (operator == '-'){
            hasil = a - b;
            System.out.println("Hasil = " + hasil);
        }else  if (operator == '*'){
            hasil = a * b;
            System.out.println("Hasil = " + hasil);
        }else  if (operator == '/'){
            if (b == 0){
                System.out.println("Pembagi nol menghasilkan Tak hingal");
            }else{
                hasil = a / b;
                System.out.println("Hasil = " + hasil);
            }
        }else{
            System.out.println("Operator tidak ditemukan");
        }
    }
}

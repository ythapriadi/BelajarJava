package com.tutorial;

import com.sun.source.tree.IfTree;

import java.util.Scanner;

public class Main {
    public static void main (String [] args){

        //Ternary Operator


        int input, x;
        Scanner inputUser = new Scanner (System.in);

        System.out.print("Masukan Nilai : ");
        input = inputUser.nextInt();

        //Variabel X = ekpresi ? statement_True : Statemeny_False
        x = (input == 10) ? (input*input) : (input/2);

//        Jika memakai If
//        if (){
//            x = input * input;
//        }else{
//            x = input / 2;?
//        }

        System.out.println("Hasilnya " + x);

    }
}

package com.tutorial;

public class Main {
    public static void main (String [] args){

        //Operasi Aritmatika
        int variabel1 = 12;
        int variabel2 = 5;

        int hasil;

        //1. Penambahan
        hasil = variabel1 + variabel2;
        //Cara 1 System.out.println(hasil);

        System.out.println(variabel1 + "+" + variabel2 + "=" + hasil ); //Cara 2

        //2. Pengurangan
        hasil = variabel1 - variabel2;
        System.out.printf("%d - %d = %d \n", variabel1,variabel2,hasil); //menggunakan Printf

        //3. Perkalian
        hasil = variabel1 * variabel2;
        System.out.printf("%d * %d = %d \n", variabel1,variabel2,hasil);

        //4. Pembagian
        hasil = variabel1 / variabel2;
        System.out.printf("%d / %d = %d \n", variabel1,variabel2,hasil);

        //Menggunakan float
        float a = 5;
        float b = 6;
        float hasilFloat = a/b;
        System.out.println(a + "/" + b +"=" + hasilFloat);

        //5. Modulus
        hasil = variabel1 % variabel2;
        System.out.printf("%d %% %d = %d \n", variabel1,variabel2,hasil);
    }
}

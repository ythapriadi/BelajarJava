package com.tutorial;

public class Main {

    public static void main(String[] args) {
	// Program Konversi Data
        int nilaiInt = 450; //32-bit
        System.out.println("Nilai Int = " + nilaiInt);

    //Memperluas rentang nilai tipe data ke yang lebih besar
        long nilaiLong = nilaiInt;
        System.out.println("Nilai long = " + nilaiLong);

    //Memperkecil rentang nilai ke tipe data yang lebih kecil
        byte nilaiByte = (byte) nilaiInt;
        System.out.println("nilai byte = "+ nilaiByte);
        System.out.println("Nilai max byte = " + Byte.MAX_VALUE);
        System.out.println("Nilai min byte = " + Byte.MIN_VALUE);

    //Casting Pembagian
        int a = 10;
        float b = 4;

        float c = a/b;
        System.out.printf("%d / %f = %f \n",a,b,c);

        int x = 10;
        int y = 4;

        float z = (float) x/y;
        System.out.printf("%d / %d = %f \n",x,y,z);
    }
}
